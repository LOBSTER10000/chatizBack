package com.example.chatizback.repository;

import com.example.chatizback.entity.ChatReceiptEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChatReceiptRepository  extends JpaRepository<ChatReceiptEntity, Long> {

}
