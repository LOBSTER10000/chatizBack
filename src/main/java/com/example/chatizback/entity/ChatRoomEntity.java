package com.example.chatizback.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Entity
@Table(name = "chatRoom")
public class ChatRoomEntity {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "chatRoomId", unique = true, nullable = false)
    private int chatRoomId;

    @Id
    @Column(name = "chatRoomCode")
    private String chatRoomCode;

    @Column(name = "chatRoomName")
    private String chatRoomName;

    @Column(name = "population")
    private int population;

    @Column(name = "isEmpty")
    private boolean isEmpty;

    @Column(name = "isGaming")
    private boolean isGaming;
}
