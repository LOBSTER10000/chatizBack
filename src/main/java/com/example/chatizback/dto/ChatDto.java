package com.example.chatizback.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class ChatDto {
    private String chatRoomCode;
    private String messenger;
    private String content;
    private String receiver;
    private LocalDateTime timestamp = LocalDateTime.now();

}
