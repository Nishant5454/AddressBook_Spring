package com.Adressbook.AdressBook.Service;

import com.Adressbook.AdressBook.Model.AddressEntity;
import com.Adressbook.AdressBook.Repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;
@Service
public class Servicelayer {
    @Autowired
    AddressRepository addressRepository;

    public ResponseEntity<AddressEntity> addAddress(AddressEntity adressEntity){

        addressRepository.save(adressEntity);
        return ResponseEntity.ok().body(adressEntity);
    }
    public ResponseEntity<List<AddressEntity>>getAddressEntities(){


        return ResponseEntity.ok().body(addressRepository.findAll());
    }
    public AddressEntity updateAddress(Long id,AddressEntity addressEntity){
        Optional<AddressEntity>exist=addressRepository.findById(id);
        if(exist.isPresent()){
            AddressEntity add=exist.get();
            add.setName(add.getName());
            add.setAddress(add.getAddress());
            add.setCity(add.getCity());
            add.setState(add.getState());
            add.setPhone(add.getPhone());
            add.setZipcode(add.getZipcode());
            return addressRepository.save(add);
        }
        return null;



    }
    public Optional<AddressEntity>getAddressById(Long id){
        return addressRepository.findById(id);
    }// Get the Address By Id
    public ResponseEntity<String>deleteAddress(Long id){

        addressRepository.deleteById(id);
        return ResponseEntity.ok().body("Sucssesfully delted");
    }






}
