package org.sid.projetnumero6.security;

import org.sid.projetnumero6.service.AuthenticationSuccessHandlerImpl;
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
    AuthenticationSuccessHandlerImpl authenticationSuccessHandler;

    @Override
    public void configure(AuthenticationManagerBuilder auth) throws Exception {
        bCryptPasswordEncoder = getBCPE();

        auth.jdbcAuthentication()
                .dataSource(dataSource)
                .usersByUsernameQuery("select login as principal, password as credentials, active from member where login=?")
                .authoritiesByUsernameQuery(
                "SELECT login AS username, rang AS role FROM member, roles  WHERE login=?")
                .rolePrefix("ROLE_")
                .passwordEncoder(getBCPE());
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.formLogin()
                    .permitAll().successHandler(authenticationSuccessHandler)
        .and()
                    .logout()
                    .permitAll();
                     http.csrf().disable();






//------------------------------------ACCESS -----------------------------------------------

//ACCESS ADMIN
        http.authorizeRequests()
                .antMatchers("/newtopo","/demandBooking","/createClimbPath","/addComment","/editCommentary","/newEdit","/newPlace","/saveplace","/savetopo","/validtopo")
                    .hasRole("ADMIN");

//ACCESS MEMBRE
        http.authorizeRequests()
                .antMatchers("/newtopo","/demandBooking","/createClimbPath","/addComment","/editCommentary","/newEdit","/newPlace","/saveplace","/savetopo","/validtopo")
                .hasRole("MEMBRE");

//ACCESS INVITE
        http.authorizeRequests()
                .antMatchers("/login","/index")
                .permitAll();


//----------------GESTION ERREUR-----------
        http.exceptionHandling().accessDeniedPage("/403");

    }

    @Bean
    BCryptPasswordEncoder getBCPE() {
        return new BCryptPasswordEncoder();
    }
}
