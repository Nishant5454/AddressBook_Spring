package com.Adressbook.AdressBook.Controller;

import com.Adressbook.AdressBook.Model.AddressEntity;
import com.Adressbook.AdressBook.Service.Servicelayer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/address/api")
public class ControllerClass {

    @Autowired
    private Servicelayer servicelayer;

    @PostMapping("/save")
    public ResponseEntity<String> addAddress(@RequestBody AddressEntity addressEntity) {
        servicelayer.addAddress(addressEntity);
        return ResponseEntity.ok("Success");
    }

    @GetMapping("/get")
    public ResponseEntity<List<AddressEntity>> getAllContacts() {
        return ResponseEntity.ok(servicelayer.getAddressEntities().getBody());
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<Optional<AddressEntity>> getContactById(@PathVariable Long id) {
        return ResponseEntity.ok(servicelayer.getAddressById(id));
    }

    @PutMapping("/edit/{id}")
    public ResponseEntity<String> updateAddress(@PathVariable Long id, @RequestBody AddressEntity updatedAddress) {
       Optional< AddressEntity> existingAddress=servicelayer.getAddressById(id);
       if(existingAddress==null) {
           ResponseEntity.ok().body("Name not Found in the Database by this Id");

       }
       servicelayer.updateAddress(id,updatedAddress);
       return ResponseEntity.ok().body("Address Sucsessfully Updated");


    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> delete(@PathVariable Long id) {
        servicelayer.deleteAddress(id);
        return ResponseEntity.ok("Deleted successfully");
    }
}
