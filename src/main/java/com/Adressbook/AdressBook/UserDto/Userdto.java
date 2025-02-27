package com.Adressbook.AdressBook.UserDto;

import org.springframework.http.ResponseEntity;

public class Userdto {
    Long id;
    private String name;
    private String address;
    Userdto(Long id,String name,String address){
        this.id=id;
        this.name=name;
        this.address=address;
    }
    public ResponseEntity<String>getname(){
        return ResponseEntity.ok().body(name);
    }
    public ResponseEntity<String>getaddress(){
        return ResponseEntity.ok().body(address);
    }
    public void setName(String name){
        this.name=name;

    }
    public void setAddress(String address){
        this.address=address;
    }
}
