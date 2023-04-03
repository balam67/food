package com.foodies.hotels.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.foodies.hotels.service.ShowHotelsService;

@Controller
public class HotelController {

	//@Autowired
	private ShowHotelsService showHotelService= new ShowHotelsService();
	
	@GetMapping("/showhotels")
	public String showHotels() {
		
     return showHotelService.showHotels();

		
	}
}
