package com.example.nurserypetbot.repository;

import com.example.nurserypetbot.models.UsersContactInformation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserContactInformationRepository extends JpaRepository<UsersContactInformation, Long> {
    Optional<UsersContactInformation> findByChatId(long chatId);
}