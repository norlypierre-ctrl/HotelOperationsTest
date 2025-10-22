package com.pluralsight;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {

  private Room room;

  @BeforeEach
  void setRoom() {
      room = new Room(2,100);
  }
  @Test
  void testCheckin(){
      room.checkIn();
      assertTrue(room.isOccupied());
      assertTrue(room.isDirty());

  }
    @Test
    void testCheckout() {
        room.checkIn();
        room.checkout();
        assertFalse(room.isOccupied());
        assertTrue(room.isDirty());
    }
}