package com.example.chatizback.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class ChatReceiptDto {
    private String chatRoomCode;
    private int chatId;
    private String receiver;
    private boolean readStatus;
    private LocalDateTime received_at;
}
