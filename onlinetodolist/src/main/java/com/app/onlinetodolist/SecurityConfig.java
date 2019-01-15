/**
 * 
 */
package com.app.onlinetodolist;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

/**
 * @author 35389
 *
 */
@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	 @Autowired
	 private DataSource dataSource;

	/**
	 * 
	 */
	public SecurityConfig() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param disableDefaults
	 */
	public SecurityConfig(boolean disableDefaults) {
		super(disableDefaults);
		// TODO Auto-generated constructor stub
	}
	
	@Override
    protected void configure(AuthenticationManagerBuilder auth)
            throws Exception {
		auth.jdbcAuthentication().passwordEncoder(new BCryptPasswordEncoder()).dataSource(dataSource);
		
       /* auth.
                jdbcAuthentication()
                .usersByUsernameQuery(usersQuery)
                .authoritiesByUsernameQuery(rolesQuery)
                .dataSource(dataSource)
                .passwordEncoder(bCryptPasswordEncoder);*/
}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		 http.
         authorizeRequests()
         .antMatchers("/").permitAll()
         .antMatchers("/login").permitAll().and().csrf().disable().formLogin()
         .loginPage("/login").failureUrl("/login?error=true")
         .defaultSuccessUrl("/index")
         .usernameParameter("user_name")
         .passwordParameter("password")
         .and().logout()
         .logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
         .logoutSuccessUrl("/").and().exceptionHandling()
.accessDeniedPage("/error");
	}

	
}