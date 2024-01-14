/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.siti.hotel.service;

import com.siti.hotel.repository.HotelRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.siti.hotel.entity.Hotel;

/**
 *
 * @author Windows
 */
@Service
public class HotelService {
    private final HotelRepository hotelRepository;
    
    @Autowired
    
    public HotelService(HotelRepository hotelRepository){
        this.hotelRepository = hotelRepository;
    }
    
    public List<Hotel> getAllHotel(){
        return hotelRepository.findAll();
    }
    
    public Hotel getHotelById(Long id){
        return hotelRepository.findById(id).get();
    }
    public Hotel getHotel(Long id){
        return hotelRepository.findById(id).get();
    }
    public void insertHotel(Hotel hotel){
        Optional<Hotel> hotelOptional = 
                hotelRepository.findHotelByid(hotel.getId());
        if (hotelOptional.isPresent()){
            throw new IllegalStateException("Id sudah ada");
        }
        hotelRepository.save(hotel);
    }
    
    
}
    
  