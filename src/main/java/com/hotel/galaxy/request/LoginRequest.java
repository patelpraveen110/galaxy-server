package com.hotel.galaxy.request;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

/**
 * @author praveen patel
 */
@Data
public class LoginRequest {
    @NotBlank
    private String email;
    @NotBlank
    private String password;
}