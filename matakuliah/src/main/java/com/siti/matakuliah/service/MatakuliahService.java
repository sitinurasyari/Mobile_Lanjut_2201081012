/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.siti.matakuliah.service;

import com.siti.matakuliah.repository.MatakuliahRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.siti.matakuliah.entity.Matakuliah;

/**
 *
 * @author Windows
 */
@Service
public class MatakuliahService {

    @Autowired
    private MatakuliahRepository matakuliahRepository;
    
    public List<Matakuliah> getAll(){
        return matakuliahRepository.findAll();
    }
    
    public Matakuliah getMatakuliahById(Long idmatakuliah){
        return matakuliahRepository.findById(idmatakuliah).get();
    } 
    
    public void insert(Matakuliah matakuliah){
        matakuliahRepository.save(matakuliah);
    }
    
    public void delete(Long idmatakuliah){
        matakuliahRepository.deleteById(idmatakuliah); 
    }
}
