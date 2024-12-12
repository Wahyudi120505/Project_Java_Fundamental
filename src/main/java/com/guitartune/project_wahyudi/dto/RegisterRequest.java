package com.guitartune.project_wahyudi.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RegisterRequest {
    private String username;
    private String email;
    private String phoneNumber;
    private String address;
    private String city;
    private String password;
}
