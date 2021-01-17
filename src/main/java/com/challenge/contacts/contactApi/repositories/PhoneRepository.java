package com.challenge.contacts.contactApi.repositories;

import com.challenge.contacts.contactApi.models.Phone;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PhoneRepository extends JpaRepository<Phone, Long> {
}
