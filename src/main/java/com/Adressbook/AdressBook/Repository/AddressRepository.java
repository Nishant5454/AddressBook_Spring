package com.Adressbook.AdressBook.Repository;

import com.Adressbook.AdressBook.Model.AddressEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends JpaRepository<AddressEntity,Long> {
}
