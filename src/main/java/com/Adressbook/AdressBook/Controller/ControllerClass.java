package com.Adressbook.AdressBook.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/adress/api")
public class ControllerClass {
    private final List<Map<String,String>>finallist=new ArrayList<>();
    @PostMapping
    public ResponseEntity<Map<String,String>>addcontact(@RequestBody Map<String,String>contact){
        finallist.add(contact);
        return ResponseEntity.ok().body(contact);// RESPONSE ENTITY



    }
    @GetMapping("/get")
    public ResponseEntity<List<Map<String,String>>>getallcontact(){
        return ResponseEntity.ok().body(finallist);
    }
    @GetMapping("/get/{index}")
    public ResponseEntity<Map<String,String>>getcontactviaIndex(@RequestParam int index){
        return ResponseEntity.ok().body(finallist.get(index));
    }//a

    @PutMapping("/put")
    public ResponseEntity<Map<String,String>>updateAdress(@RequestBody Map<String,String>updated){
        String name=updated.get("name");
        String address=updated.get("address");
        Map<String,String>response=new HashMap<>();
        response.put("name",name);
        response.put("address",address);
        finallist.add(response);
        return ResponseEntity.ok().body(response);

    }
    @DeleteMapping("/delete")
    public ResponseEntity<String>delete(@RequestBody String name){
        finallist.remove(name);
        return ResponseEntity.ok().body("Deleted");


    }


}
