package com.Adressbook.AdressBook.UserDto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Userdto {
    Long id;
    private String name;
    private String address;
    private String City;
    private String phone;
    private String state;
    private int zipcode;
}