package com.Adressbook.AdressBook.Service;

import com.Adressbook.AdressBook.Model.AdressEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import java.util.ArrayList;
import java.util.List;

public class Servicelayer {
    private final List<AdressEntity>adressEntities=new ArrayList<>();
    public ResponseEntity<AdressEntity> addaddress(AdressEntity adressEntity){
        adressEntities.add(adressEntity);
        return ResponseEntity.ok().body(adressEntity);
    }
    public ResponseEntity<List<AdressEntity>>getAdressEntities(){
        return ResponseEntity.ok().body(adressEntities);
    }
    public ResponseEntity<List<AdressEntity>>updateAddress(int id,AdressEntity adressEntity){
        adressEntities.set(id,adressEntity);
        return ResponseEntity.ok().body(adressEntities);

    }
    public ResponseEntity<String>deleteAddress(int id){
        adressEntities.remove(id);
        return ResponseEntity.ok().body("Sucssesfully delted");
    }






}
