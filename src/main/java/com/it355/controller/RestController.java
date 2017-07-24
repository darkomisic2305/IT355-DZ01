package com.it355.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.it355.model.Hotel;
import com.it355.model.Soba;
import com.it355.service.HotelService;
import com.it355.service.SobaService;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/rest")
public class RestController {
	
	@Autowired
	private SobaService sobaService;
	
	@Autowired
	private HotelService hotelService;
	
	@RequestMapping(value="/sobe", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Soba>> getSobe() {
		List<Soba> sveSobe = sobaService.getSveSobe();
		
		if(sveSobe.size() == 0) {
			return new ResponseEntity<List<Soba>>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<List<Soba>>(sveSobe, HttpStatus.OK);
	}
	
	@RequestMapping(value="/soba/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Soba> getSoba(@PathVariable("id") int id) {
		Soba soba = sobaService.getSobaById(id);
		
		if(soba == null) {
			return new ResponseEntity<Soba>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<Soba>(soba, HttpStatus.OK);
	}
	
	@RequestMapping(value="/addsoba/", method = RequestMethod.POST)
	public ResponseEntity<Void> addSoba(@RequestBody Soba soba) {
		sobaService.addSoba(soba);
		
		HttpHeaders headers = new HttpHeaders();
		return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
	}
	
	@RequestMapping(value="/updatesoba/{id}", method=RequestMethod.PUT)
	public ResponseEntity<Soba> updateSoba(@PathVariable("id") int id, @RequestBody Soba soba) {
		soba.setSobaId(id);
		
		sobaService.editSoba(soba);
		
		return new ResponseEntity<Soba>(soba, HttpStatus.OK);
	}
	
	@RequestMapping(value="/deletesoba/{id}", method=RequestMethod.DELETE)
	public ResponseEntity<Soba> deleteSoba(@PathVariable("id") int id) {
		Soba soba = sobaService.getSobaById(id);
		if(soba == null) {
			return new ResponseEntity<Soba>(HttpStatus.NOT_FOUND);
		}
		sobaService.deleteSoba(soba);
		return new ResponseEntity<Soba>(HttpStatus.OK);
	}
	
	@RequestMapping(value="/hoteli", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Hotel>> getHoteli() {
		List<Hotel> sviHoteli = hotelService.getSveHotele();
		
		if(sviHoteli.size() == 0) {
			return new ResponseEntity<List<Hotel>>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<List<Hotel>>(sviHoteli, HttpStatus.OK);
	}
	
	@RequestMapping(value="/hotel/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Hotel> getHotel(@PathVariable("id") int id) {
		Hotel hotel = hotelService.getHotelById(id);
		
		if(hotel == null) {
			return new ResponseEntity<Hotel>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<Hotel>(hotel, HttpStatus.OK);
	}
	
	@RequestMapping(value="/addhotel/", method = RequestMethod.POST)
	public ResponseEntity<Void> addHotel(@RequestBody Hotel hotel) {
		hotelService.addHotel(hotel);
		
		HttpHeaders headers = new HttpHeaders();
		return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
	}
	
	@RequestMapping(value="/updatehotel/{id}", method=RequestMethod.PUT)
	public ResponseEntity<Hotel> updateHotel(@PathVariable("id") int id, @RequestBody Hotel hotel) {
		hotel.setHotelId(id);
		
		hotelService.editHotel(hotel);
		
		return new ResponseEntity<Hotel>(hotel, HttpStatus.OK);
	}
	
	@RequestMapping(value="/deletehotel/{id}", method=RequestMethod.DELETE)
	public ResponseEntity<Hotel> deleteHotel(@PathVariable("id") int id) {
		Hotel hotel = hotelService.getHotelById(id);
		if(hotel == null) {
			return new ResponseEntity<Hotel>(HttpStatus.NOT_FOUND);
		}
		hotelService.deleteHotel(hotel);
		return new ResponseEntity<Hotel>(HttpStatus.OK);
	}
 
}