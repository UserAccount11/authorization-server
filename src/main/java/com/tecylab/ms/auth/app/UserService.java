package com.tecylab.ms.auth.app;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class UserService implements UserDetailsService {

  // private UserJpaRepository repository;
  // private UserFeignClient client;

  @Override
  public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
    // UserDto dto = client.getUser();
    // UserEntity entity = repository.findByUsername();

    return User.builder()
        .username("user")
        .password("{noop}password")
        .roles("USER")
        .build();

  }
}
