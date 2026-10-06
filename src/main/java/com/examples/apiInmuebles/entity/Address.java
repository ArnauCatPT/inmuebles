/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.examples.apiInmuebles.entity;

/**
 *
 * @author UsuarioM
 */
public class Address {

    private String calle;
    private int numero;
    private int CP;
    private String provincia;
    
    public Address() {
    }

    public Address(String calle, int numero, int CP, String provincia) {
        this.calle = calle;
        this.numero = numero;
        this.CP = CP;
        this.provincia = provincia;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    

    public int getCP() {
        return CP;
    }

    public void setCP(int CP) {
        this.CP = CP;
    }

    

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    @Override
    public String toString() {
        return "Address{" + "calle=" + calle + ", numero=" + numero + ", CP=" + CP + ", provincia=" + provincia + '}';
    }
    
}
