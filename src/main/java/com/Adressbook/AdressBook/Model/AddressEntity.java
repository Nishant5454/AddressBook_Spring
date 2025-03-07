package com.Adressbook.AdressBook.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.validation.annotation.Validated;

@Entity
@Table(name = "ADDRESS")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class AddressEntity {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    Long id;
    String name;
    String address;
    String City;
    String state;
    int zipcode;
    String Phone;

}
