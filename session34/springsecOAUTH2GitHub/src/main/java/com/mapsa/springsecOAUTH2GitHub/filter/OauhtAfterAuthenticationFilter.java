package com.mapsa.springsecOAUTH2GitHub.filter;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;

public class OauhtAfterAuthenticationFilter extends OncePerRequestFilter {



    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
            throws ServletException, IOException {
        System.out.println(" in OauhtAfterAuthenticationFilter");
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        System.out.println("user : " + authentication.getName());


        filterChain.doFilter(request, response);
    }
}
