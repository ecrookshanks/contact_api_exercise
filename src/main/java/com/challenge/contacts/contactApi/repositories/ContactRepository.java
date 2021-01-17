package com.challenge.contacts.contactApi.repositories;

import com.challenge.contacts.contactApi.models.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<Contact, Long> {
}
