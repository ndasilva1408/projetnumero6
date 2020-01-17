package org.sid.projetnumero6.security;

import org.sid.projetnumero6.service.AuthenticationSuccessHandlerImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

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
                        "SELECT login AS username, role_id AS role FROM member  WHERE login=?")
                .rolePrefix("ROLE_")
                .passwordEncoder(getBCPE());

    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.formLogin()
                .successHandler(authenticationSuccessHandler)
                .and().csrf().disable()

                .logout();


//------------------------------------ACCESS -----------------------------------------------


//ACCESS MEMBRE
       http.authorizeRequests()
                .antMatchers( "/editCommentary", "/newEdit")
                .access("hasRole('ROLE_1') or hasRole('ROLE_2')");// 1 =ADMIN 2= MEMBRE

//ACCESS INVITE
        http.authorizeRequests()
              .antMatchers("/newtopo", "/demandBooking", "/createClimbPath", "/addComment", "/newPlace", "/saveplace", "/savetopo", "/validtopo")
               .access("hasRole('ROLE_1') or hasRole('ROLE_2') or hasRole('ROLE_3')");// 3 =INVITE

//ACCESS ALL
        http.authorizeRequests()
                .antMatchers("/login", "/index","/savemember")
                .permitAll();


//----------------GESTION ERREUR-----------
        http.exceptionHandling().accessDeniedPage("/403");

    }

    @Bean
    BCryptPasswordEncoder getBCPE() {
        return new BCryptPasswordEncoder();
    }
}
