package com.challenge.contacts.contactApi.repositories;

import com.challenge.contacts.contactApi.models.UserAddress;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserAddressRepository extends JpaRepository<UserAddress, Long> {
}
