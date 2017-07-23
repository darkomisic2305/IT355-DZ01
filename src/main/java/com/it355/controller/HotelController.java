package com.it355.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.it355.model.Hotel;
import com.it355.service.HotelService;

@Controller
@RequestMapping("/")
public class HotelController {

	@Autowired
	private HotelService hotelService;

	@RequestMapping(value = "/sviHoteli", method = RequestMethod.GET)
	public String sviHoteli(Model model) {
		List<Hotel> sviHoteli = hotelService.getSveHotele();

		model.addAttribute("sviHoteli", sviHoteli);

		return "sviHoteli";
	}

	@RequestMapping(value = "/hotel/{hotelId}", method = RequestMethod.GET)
	public String getHotel(@PathVariable(value = "hotelId") int hotelId, Model model) {
		Hotel hotel = hotelService.getHotelById(hotelId);

		model.addAttribute("hotel", hotel);

		return "hotel";
	}

	@RequestMapping(value = "/addHotel", method = RequestMethod.GET)
	public String addHotel(Model model) {
		Hotel hotel = new Hotel();

		model.addAttribute("hotel", hotel);

		return "addHotel";
	}

	@RequestMapping(value = "/addHotel", method = RequestMethod.POST)
	public String addHotel(@ModelAttribute("hotel") Hotel hotel) {
		hotelService.addHotel(hotel);

		return "redirect:/sviHoteli";
	}

	@RequestMapping("/editHotel/{id}")
	public String editHotel(@PathVariable("id") int id, Model model) {
		Hotel hotel = hotelService.getHotelById(id);

		model.addAttribute("hotel", hotel);

		return "editHotel";
	}

	@RequestMapping(value = "/editHotel", method = RequestMethod.POST)
	public String editHotelPost(@Valid @ModelAttribute("hotel") Hotel hotel) {

		hotelService.editHotel(hotel);

		return "redirect:/sviHoteli";
	}

	@RequestMapping("/deleteHotel/{id}")
	public String deleteHotel(@PathVariable int id, Model model) {

		Hotel hotel = hotelService.getHotelById(id);
		hotelService.deleteHotel(hotel);

		return "redirect:/sviHoteli";
	}
}
