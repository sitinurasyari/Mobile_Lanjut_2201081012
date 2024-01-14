/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.siti.mahasiswa.controller;

import com.siti.mahasiswa.service.MahasiswaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.siti.mahasiswa.entity.Mahasiswa;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 *
 * @author Windows
 */
@RestController
@RequestMapping("api/v1/mahasiswa")
public class MahasiswaController {
    private final MahasiswaService mahasiswaService;
    
    @Autowired
    public MahasiswaController(MahasiswaService mahasiswaService){
        this.mahasiswaService = mahasiswaService;
    }
    
    @GetMapping
    public List<Mahasiswa>getAllMahasiswa(){
        return mahasiswaService.getAllMahasiswa();
    }
    
    @GetMapping(path= "{id}")
    public Mahasiswa getMahasiswaById(@PathVariable("id") Long id){
        return mahasiswaService.getMahasiswaById(id);
    }
    @PostMapping
    public void insertMahasiswa(@RequestBody Mahasiswa mahasiswa){
        mahasiswaService.insertMahasiswa(mahasiswa);
    }
}
