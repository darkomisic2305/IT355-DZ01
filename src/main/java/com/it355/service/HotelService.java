package com.it355.service;

import java.util.List;

import com.it355.model.Hotel;
import com.it355.model.Soba;

public interface HotelService {

	public List<Hotel> getSveHotele();
	public Hotel getHotelById(int id);
	public Hotel addHotel(Hotel hotel);
	public void editHotel(Hotel hotel);
	public void deleteHotel(Hotel hotel);
	public List<Soba> getListaSobaPoHotelu(Hotel hotel);
}
