package com.example.UserSystem.service;

import com.example.UserSystem.entity.User;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.Set;
import java.util.stream.Collectors;

public class CustomUserDetails implements UserDetails {

    private static final long serialVersionUID = 1L;
	private final User user;

    public CustomUserDetails(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        Set<GrantedAuthority> authorities = user
                .getRoles()
                .stream()
                .map(role -> new SimpleGrantedAuthority(role.getName()))
                .collect(Collectors.toSet());
        return authorities;
    }

    @Override
    public String getPassword() {
        return user.getPassword();
    }

    @Override
    public String getUsername() {
        return user.getEmail();
    }

    @Override
    public boolean isAccountNonExpired() {
        // Implement logic for account expiration if needed
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        // Implement logic for account locking if needed
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        // Implement logic for credentials expiration if needed
        return true;
    }

    @Override
    public boolean isEnabled() {
        // Implement logic for account enabled/disabled status if needed
        return true;
    }
}
