package com.it355.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.it355.dao.HotelDao;
import com.it355.model.Hotel;
import com.it355.service.HotelService;

@Service
public class HotelServiceImpl implements HotelService {

	@Autowired
	private HotelDao hotelDao;

	@Override
	public List<Hotel> getSveHotele() {
		return hotelDao.getSveHotele();
	}

	@Override
	public Hotel getHotelById(int id) {
		return hotelDao.getHotelById(id);
	}

	@Override
	public void addHotel(Hotel hotel) {
		hotelDao.addHotel(hotel);
	}

	@Override
	public void editHotel(Hotel hotel) {
		hotelDao.editHotel(hotel);
	}

	@Override
	public void deleteHotel(Hotel hotel) {
		hotelDao.deleteHotel(hotel);
	}

}
