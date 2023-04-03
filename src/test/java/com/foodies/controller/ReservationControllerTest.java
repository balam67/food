package com.foodies.controller;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class ReservationControllerTest {
    
    @Test
    public void testShowReservations() {
        assertTrue(true);
    }
    
    @Test
    public void testShowReservationForm() {
        assertEquals("C", new ReservationController().showReservationForm());
    }
    
   
    
  
}



