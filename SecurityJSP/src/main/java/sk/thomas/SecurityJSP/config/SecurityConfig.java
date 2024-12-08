package sk.thomas.SecurityJSP.config;

import jakarta.servlet.DispatcherType;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.core.session.SessionRegistry;
import org.springframework.security.core.session.SessionRegistryImpl;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity(debug = true)
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        return http
                .authorizeHttpRequests(authorizeHttpRequests -> authorizeHttpRequests
                        .dispatcherTypeMatchers(DispatcherType.FORWARD, DispatcherType.ERROR, DispatcherType.INCLUDE).permitAll()
                        .requestMatchers("/login").permitAll()
                        .requestMatchers("/resources/**").permitAll()
                        .requestMatchers("/error").permitAll()
                        .anyRequest().authenticated())



                .formLogin(login -> login
                        .loginPage("/login")
//                        .defaultSuccessUrl("/dms/index")
                        .permitAll())



                .csrf(AbstractHttpConfigurer::disable)
                .build();
    }

    @Bean
    public UserDetailsService userDetailsService() {
        UserDetails user =
                User.withDefaultPasswordEncoder()
                        .username("nextit_minarovic")
                        .password("password")
                        .roles("DMS_LOGIN")
                        .build();

        return new InMemoryUserDetailsManager(user);
    }

    @Bean
    public SessionRegistry sessionRegistry() {
        return new SessionRegistryImpl();
    }

}
