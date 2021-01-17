package com.challenge.contacts.contactApi.repositories;

import com.challenge.contacts.contactApi.models.UserName;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserNameRepository extends JpaRepository<UserName, Long> {
}
