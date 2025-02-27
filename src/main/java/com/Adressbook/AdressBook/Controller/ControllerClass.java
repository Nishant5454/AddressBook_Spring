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

    @PostMapping
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

    @PutMapping("/put/{id}")
    public ResponseEntity<AddressEntity> updateAddress(@PathVariable Long id, @RequestBody Map<String, String> updated) {
        AddressEntity updatedAddress = servicelayer.updateAddress(id, (AddressEntity) updated);
        return ResponseEntity.ok(updatedAddress);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> delete(@PathVariable Long id) {
        servicelayer.deleteAddress(id);
        return ResponseEntity.ok("Deleted successfully");
    }
}
