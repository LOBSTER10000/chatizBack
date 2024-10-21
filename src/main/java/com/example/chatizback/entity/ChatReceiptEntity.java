package com.example.chatizback.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Entity
@Table(name = "chatReceipt")
public class ChatReceiptEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int chatReceiptId;

    @ManyToOne
    @JoinColumn(name = "chatRoomCode", nullable = false)
    private ChatRoomEntity chatRoomCode;

    @ManyToOne
    @JoinColumn(name = "chatId", nullable = false)
    private ChatEntity chatId;

    @OneToOne
    @JoinColumn(name = "userName", nullable = false)
    private UserEntity receiver;

    @Column(name = "readStatus")
    private boolean readStatus;

    @Column(name = "received_at", nullable = false, updatable = false)
    private Timestamp received_at;

    @PrePersist
    protected void onCreate(){
        received_at = new Timestamp(System.currentTimeMillis());
    }
}
