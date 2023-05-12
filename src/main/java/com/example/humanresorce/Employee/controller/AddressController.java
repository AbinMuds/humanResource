package com.example.humanresorce.Employee.controller;

import com.example.humanresorce.Employee.domain.Address;
import com.example.humanresorce.Employee.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1/address")
public class AddressController {

    @Autowired
    private AddressService addressService;
    @GetMapping
    public List<Address> getAllAddress(){
        return addressService.getAllAddress();
    }

    @GetMapping("/{id}")
    public Optional<Address> getAuthorById(@PathVariable Long id) {
        return addressService.getAddressById(id);
    }

    @PostMapping
    public Address createAddress(@RequestBody Address address){
        return addressService.createAddress(address);
    }

    @DeleteMapping("/{id}")
    public void deleteAddress(@PathVariable Long id){
        addressService.deleteAddressById(id);
    }

    @PutMapping
    public ResponseEntity updateAddress(@RequestParam("id") Long id, @RequestBody Address address) {
        if(id!= address.getId()){
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity(addressService.updateAddress(address),HttpStatus.OK);
    }
}
