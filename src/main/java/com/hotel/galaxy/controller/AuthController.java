package com.hotel.galaxy.controller;

import com.hotel.galaxy.exception.UserAlreadyExistsException;
import com.hotel.galaxy.model.User;
import com.hotel.galaxy.service.IUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @author praveen patel
 */

@RestController
@RequestMapping("/auth")
@CrossOrigin(origins = "http://localhost:5173/")
@RequiredArgsConstructor
public class AuthController {
    private final IUserService userService;
//    private final AuthenticationManager authenticationManager;
//    private final JwtUtils jwtUtils;

    @PostMapping("/register-user")
    public ResponseEntity<?> registerUser(@RequestBody User user){
        try{
            userService.registerUser(user);
            return ResponseEntity.ok("Registration successful!");

        }catch (UserAlreadyExistsException e){
            return ResponseEntity.status(HttpStatus.CONFLICT).body(e.getMessage());
        }
    }

//    @PostMapping("/login")
//    public ResponseEntity<?> authenticateUser(@Valid @RequestBody LoginRequest request){
//        Authentication authentication =
//                authenticationManager
//                        .authenticate(new UsernamePasswordAuthenticationToken(request.getEmail(), request.getPassword()));
//        SecurityContextHolder.getContext().setAuthentication(authentication);
//        String jwt = jwtUtils.generateJwtTokenForUser(authentication);
//        HotelUserDetails userDetails = (HotelUserDetails) authentication.getPrincipal();
//        List<String> roles = userDetails.getAuthorities()
//                .stream()
//                .map(GrantedAuthority::getAuthority).toList();
//        return ResponseEntity.ok(new JwtResponse(
//                userDetails.getId(),
//                userDetails.getEmail(),
//                jwt,
//                roles));
//    }
}