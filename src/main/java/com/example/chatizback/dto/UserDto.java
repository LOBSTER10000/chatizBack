package com.example.chatizback.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class UserDto {
    private String userName;
    private String userPassword;
    private String userProfile;
    private int point;
}
