/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.siti.hotel.controller;

import com.siti.hotel.service.HotelService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.siti.hotel.entity.Hotel;

/**
 *
 * @author Windows
 */
@RestController
@RequestMapping("api/v1/hotel")
public class HotelController {
    
    private final HotelService hotelService;
    
    @Autowired
    public HotelController(HotelService hotelService){
        this.hotelService = hotelService;
    }
    
    @GetMapping
    public List<Hotel>getAllHotel(){
        return hotelService.getAllHotel();
    }
    
    @GetMapping(path= "{id}")
    public Hotel getHotelById(@PathVariable("id") Long id){
        return hotelService.getHotelById(id);
    }
    @PostMapping
    public void insertHotel(@RequestBody Hotel hotel){
        hotelService.insertHotel(hotel);
    }
}

