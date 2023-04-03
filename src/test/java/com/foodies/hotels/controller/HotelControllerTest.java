package com.foodies.hotels.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class HotelControllerTest {

	@Test
	public void testShowHotels() {
		assertEquals("Hotel Abhiram", new HotelController().showHotels());
	}
	
}
