package org.sid.projetnumero6.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

import javax.sql.DataSource;


@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Autowired
    private DataSource dataSource;
    @Autowired
    BCryptPasswordEncoder bCryptPasswordEncoder;
    @Autowired
    private UserDetailsService userDetailsService;

    @Override
    public void configure(AuthenticationManagerBuilder auth) throws Exception {
        bCryptPasswordEncoder = getBCPE();

        auth.jdbcAuthentication()
                .dataSource(dataSource)
                .usersByUsernameQuery("select login as principal, password as credentials, active from member where login=?")
                .authoritiesByUsernameQuery(
                        /*---------------TEST 1 ------ Roles en relation many to many avec Member ----------------
                        "SELECT member.login as username, roles.rang as role FROM member " +
                        "INNER JOIN member_role_list on member.id = member_role_list.role_list_id " +
                        "INNER JOIN roles ON  member_role_list.role_id = roles.id where member.login=?"
                        ------------Spoil ca marche pas---------------------------*/

                "SELECT login AS username, rang AS role FROM member, roles  WHERE login=?")

                .rolePrefix("ROLE_")
                .passwordEncoder(getBCPE());
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.formLogin()
                    .loginPage("/login")
                    .defaultSuccessUrl("/index")
                   .loginProcessingUrl("/login")
                    .permitAll();
        http.csrf().disable();
    /*    http.sessionManagement()
                .sessionCreationPolicy(SessionCreationPolicy.ALWAYS);
        http.sessionManagement()
              .maximumSessions(2);*/




//------------------------------------ACCESS -----------------------------------------------

//ACCESS ADMIN
        http.authorizeRequests()
                .antMatchers("/newtopo","/demandBooking","/createClimbPath","/addComment","/editCommentary","/newEdit","/newPlace","/saveplace","/savetopo","/validtopo")
                    .hasRole("ADMIN");

//ACCESS MEMBRE
        http.authorizeRequests()
                .antMatchers("/newtopo/*","/demandBooking","/createClimbPath","/addComment","/editCommentary","/newEdit","/newPlace","/saveplace","/savetopo","/validtopo")
                .hasRole("MEMBRE");

//ACCESS INVITE
        http.authorizeRequests()
                .antMatchers("/login")
                .permitAll();


//----------------GESTION ERREUR-----------
        http.exceptionHandling().accessDeniedPage("/403");

    }

    @Bean
    BCryptPasswordEncoder getBCPE() {
        return new BCryptPasswordEncoder();
    }
}
