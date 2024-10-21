package com.example.chatizback.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Entity
@Table(name = "chat")
public class ChatEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "chatId")
    private int chatId;

    @ManyToOne
    @JoinColumn(name = "chatRoomCode", nullable = false)
    private ChatRoomEntity chatRoomCode;

    @OneToOne
    @JoinColumn(name = "userName", nullable = false)
    private UserEntity sender;

    @Column(name= "content")
    private String content;

    @Column(name = "timestamp", nullable = false, updatable = false)
    private Timestamp timestamp;

    @PrePersist
    protected void onCreate(){
        timestamp = new Timestamp(System.currentTimeMillis());
    }
}
