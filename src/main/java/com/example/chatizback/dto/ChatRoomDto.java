package com.example.chatizback.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ChatRoomDto {
    private String chatRoomCode;
    private String chatRoomName;
    private LocalDateTime created_at = LocalDateTime.now();
}
