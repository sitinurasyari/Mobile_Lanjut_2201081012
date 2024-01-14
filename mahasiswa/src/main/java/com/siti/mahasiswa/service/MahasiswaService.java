/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.siti.mahasiswa.service;

import com.siti.mahasiswa.repository.MahasiswaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.siti.mahasiswa.entity.Mahasiswa;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author Windows
 */
@Service
public class MahasiswaService {
    private final MahasiswaRepository mahasiswaRepository;
    
    @Autowired
    
    public MahasiswaService(MahasiswaRepository mahasiswaRepository){
        this.mahasiswaRepository = mahasiswaRepository;
    }
    
    public List<Mahasiswa> getAllMahasiswa(){
        return mahasiswaRepository.findAll();
    }
    
    public Mahasiswa getMahasiswaById(Long id){
        return mahasiswaRepository.findById(id).get();
    }
    public Mahasiswa getMahasiswa(Long idmahasiswa){
        return mahasiswaRepository.findById(idmahasiswa).get();
    }
    public void insertMahasiswa(Mahasiswa mahasiswa){
        Optional<Mahasiswa> mahasiswaOptional = 
                mahasiswaRepository.findMahasiswaByEmail(mahasiswa.getEmail());
        if (mahasiswaOptional.isPresent()){
            throw new IllegalStateException("Email sudah ada");
        }
        mahasiswaRepository.save(mahasiswa);
    }

    
}
