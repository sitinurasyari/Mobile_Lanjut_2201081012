/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.siti.hotel.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.siti.hotel.entity.Hotel;

/**
 *
 * @author Windows
 */
@Repository
public interface HotelRepository extends JpaRepository<Hotel, Long>{

    public Optional<Hotel> findHotelByid(Long id);
    
}
