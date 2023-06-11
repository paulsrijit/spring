package com.example.security.jwt.filter;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import com.example.security.jwt.util.JwtUtil;

@Component
public class JwtFilter extends OncePerRequestFilter {

	@Autowired
	private JwtUtil jwtUtil;

	@Autowired
	private UserDetailsService userDetailsService;

	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {

		String authHeader = request.getHeader("Authorization");
		String bearer = "Bearer ";
		if (null != authHeader && authHeader.startsWith(bearer)) {
			String token = authHeader.substring(7);
			String userName = jwtUtil.extractUserName(token);

			if (null != userName && SecurityContextHolder.getContext().getAuthentication() == null) {
				UserDetails userDetails = userDetailsService.loadUserByUsername(userName);

				if (jwtUtil.validateToken(token, userDetails)) {
					UsernamePasswordAuthenticationToken userPassAuthToken = new UsernamePasswordAuthenticationToken(
							userDetails, null, userDetails.getAuthorities());

					userPassAuthToken.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));

					SecurityContextHolder.getContext().setAuthentication(userPassAuthToken);
				}

			}
		}

		filterChain.doFilter(request, response);

	}

}
