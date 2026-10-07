/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.apiInmuebles.entity;

/**
 *
 * @author UsuarioM
 */
public class Address {

    private int id;
    private String calle;
    private int numero;
    private int CP;
    private String provincia;
    
    public Address() {
    }

    public Address(int Id, String calle, int numero, int CP, String provincia) {
        this.id = Id;
        this.calle = calle;
        this.numero = numero;
        this.CP = CP;
        this.provincia = provincia;
    }

    

    public int getId() {
        return id;
    }


    public String getCalle() {
        return calle;
    }

    public int getNumero() {
        return numero;
    }

    public int getCP() {
        return CP;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setId(int Id) {
        this.id = Id;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

   
    public void setNumero(int numero) {
        this.numero = numero;
    }

   
    public void setCP(int CP) {
        this.CP = CP;
    }

    
    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    @Override
    public String toString() {
        return "Address{" + "Id=" + id + ", calle=" + calle + ", numero=" + numero + ", CP=" + CP + ", provincia=" + provincia + '}';
    }

    
}
