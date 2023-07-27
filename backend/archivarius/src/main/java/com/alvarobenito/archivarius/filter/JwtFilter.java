//package com.alvarobenito.archivarius.filter;
//
//import java.io.IOException;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.core.context.SecurityContextHolder;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
//import org.springframework.stereotype.Component;
//import org.springframework.web.filter.OncePerRequestFilter;
//
//import com.alvarobenito.archivarius.service.UserService;
//import com.alvarobenito.archivarius.utils.JwtUtil;
//
//import jakarta.servlet.FilterChain;
//import jakarta.servlet.ServletException;
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;
//
//@Component
//public class JwtFilter extends OncePerRequestFilter {
//
//	@Autowired
//	private JwtUtil jwtUtil;
//	@Autowired
//	private UserService usersService;
//
//	@Override
//	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
//			throws ServletException, IOException {
//		// Get header "Authorization" of request
//		String header = request.getHeader("Authorization");
//
//		String token = null;
//		String username = null;
//
//		if (header != null && header.startsWith("Bearer ")) {
//			token = header.substring(7);
//			username = jwtUtil.extractUsername(token);
//		}
//
//		if (username != null && SecurityContextHolder.getContext().getAuthentication() == null) {
//
//			UserDetails userDetails = usersService.loadUserByUsername(username);
//
//			if (jwtUtil.isValidToken(token, userDetails)) {
//
//				UsernamePasswordAuthenticationToken userPassAuth = new UsernamePasswordAuthenticationToken(userDetails,
//						null, userDetails.getAuthorities());
//
//				userPassAuth.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
//
//				SecurityContextHolder.getContext().setAuthentication(userPassAuth);
//			}
//		}
//
//		filterChain.doFilter(request, response);
//
//	}
//
//}