package com.example.springbootrestapi.dto;

import jakarta.persistence.Column;
import lombok.Data;
@Data
public class UserDto {

    private String firstName;
    private String lastName;
}
