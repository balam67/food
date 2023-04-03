package com.foodies.hotels.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.foodies.hotels.dao.HotelsDao;

@Service
public class ShowHotelsService {

	//@Autowired
	private HotelsDao hotelsDao = new HotelsDao();
	
	public String showHotels() {
		
		return hotelsDao.showHotels();
	}
}
