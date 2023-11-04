package com.example.nurserypetbot.repository;

import com.example.nurserypetbot.models.Pet;
import com.example.nurserypetbot.models.UsersContactInformation;
import org.jetbrains.annotations.NotNull;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface DogUsersContactInformationRepository
        extends JpaRepository <UsersContactInformation, Long> {

    Optional<UsersContactInformation>findById( long id);

    //    Optional<UsersContactInformation>findByPhone(Long phoneNumber);
    List<UsersContactInformation> findAll();
    Optional<UsersContactInformation> findByChatId(long chatId);
}
