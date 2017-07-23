package com.it355.dao;

import java.util.List;

import com.it355.model.Hotel;

public interface HotelDao {
	
	public List<Hotel> getSveHotele();
	public Hotel getHotelById(int id);
	public void addHotel(Hotel hotel);
	public void editHotel(Hotel hotel);
	public void deleteHotel(Hotel hotel);
}
