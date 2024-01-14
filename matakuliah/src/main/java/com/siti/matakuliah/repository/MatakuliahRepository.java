/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.siti.matakuliah.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.siti.matakuliah.entity.Matakuliah;

/**
 *
 * @author Windows
 */
@Repository
public interface MatakuliahRepository extends JpaRepository<Matakuliah , Long> {
    
}
