/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.siti.hotel.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.time.LocalDate;

/**
 *
 * @author Windows
 */

@Entity
@Table
public class Hotel {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private String notrans;
    private String idpelanggan;
    private Integer lamainap;
    private Double tarif;
    private Double diskon;
    private Double total;
    
    public Hotel(){
        
    }

    public Hotel(Long id, String notrans, String idpelanggan, Integer lamainap, Double tarif, Double diskon, Double total) {
        this.id = id;
        this.notrans = notrans;
        this.idpelanggan = idpelanggan;
        this.lamainap = lamainap;
        this.tarif = tarif;
        this.diskon = diskon;
        this.total = total;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNotrans() {
        return notrans;
    }

    public void setNotrans(String notrans) {
        this.notrans = notrans;
    }

    public String getIdpelanggan() {
        return idpelanggan;
    }

    public void setIdpelanggan(String idpelanggan) {
        this.idpelanggan = idpelanggan;
    }

    public Integer getLamainap() {
        return lamainap;
    }

    public void setLamainap(Integer lamainap) {
        this.lamainap = lamainap;
    }

    public Double getTarif() {
        return tarif;
    }

    public void setTarif(Double tarif) {
        this.tarif = tarif;
    }

    public Double getDiskon() {
        return diskon;
    }

    public void setDiskon(Double diskon) {
        this.diskon = diskon;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    
}
