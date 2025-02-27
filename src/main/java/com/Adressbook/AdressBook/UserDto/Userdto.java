package com.Adressbook.AdressBook.UserDto;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public class Userdto {
    int id;
    private String name;
    private String address;
    Userdto(int id,String name,String address){
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
