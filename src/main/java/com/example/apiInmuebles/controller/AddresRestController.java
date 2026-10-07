/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.apiInmuebles.controller;

import com.example.apiInmuebles.entity.Address;
import jakarta.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author UsuarioM
 */
@RestController
@RequestMapping("/inmobiliare")

public class AddresRestController {

    List<Address> addressList;

    @PostConstruct
    public void loadData() {
        addressList = new ArrayList<>();
        addressList.add(new Address(1, "Mallorca", 281, 8037, "Barcelona"));
        addressList.add(new Address(2, "Espalter", 8, 8001, "Barcelona"));
        addressList.add(new Address(3, "Gresolet", 17, 8034, "Barcelona"));
    }

    @GetMapping("/address")

    public List<Address> listAddress() {

        return addressList;
    }

    @GetMapping("/address/{adressId}")
    public Address getAddress(@PathVariable int addressId) {
        for (Address address : this.addressList) {
            if (address.getId() == addressId) {
                return address;
            }
        }
        return null;
    }

    @PostMapping("/address")
    public Address addAddress(@RequestBody Address theAddress) {
        addressList.add(theAddress);
        return theAddress;
    }

    @PutMapping("/address")
    public Address updateAddress(@RequestBody Address theAddress) {
        for (Address address : this.addressList) {
            if (address.getId() == theAddress.getId()) {
                address.setCalle(theAddress.getCalle());
                address.setNumero(theAddress.getNumero());
                address.setCP(theAddress.getCP());
                address.setProvincia(theAddress.getProvincia());
            }
        }

        return theAddress;
    }

    @DeleteMapping("/address/{addressId}")
    public String deleteAddress(@PathVariable int addressId) {
        this.addressList.removeIf(s -> s.getId() == addressId);
        return "Borrada la direcion" + addressId;
    }

}
