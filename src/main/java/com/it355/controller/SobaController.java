package com.it355.controller;

import com.it355.model.Hotel;
import com.it355.model.Soba;
import com.it355.service.HotelService;
import com.it355.service.SobaService;

import java.util.List;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author Darko
 */
@Controller
@RequestMapping("/")
public class SobaController {
    
    @Autowired
    private SobaService sobaService;
    
    @Autowired
    private HotelService hotelService;
    
    @RequestMapping(value="/sveSobe", method=RequestMethod.GET)
    public String sveSobe(Model model) {
    	List<Soba> sveSobe = sobaService.getSveSobe();
    	
    	model.addAttribute("sveSobe", sveSobe);
    	
    	return "sveSobe";
    }
    
    @RequestMapping(value="/soba/{sobaId}", method=RequestMethod.GET)
    public String getSoba(@PathVariable(value="sobaId")int sobaId, Model model) {
    	Soba soba = sobaService.getSobaById(sobaId);
    	
    	model.addAttribute("soba", soba);
    	
    	return "soba";
    }
    
    @RequestMapping(value="/addSoba", method=RequestMethod.GET)
    public String addSoba(Model model) {
    	System.err.println("Usao je u addSoba GET metodu.");
    	Soba soba = new Soba();
    	List<Hotel> hoteli = hotelService.getSveHotele();
    	model.addAttribute("soba", soba);
    	model.addAttribute("hoteli", hoteli);
    	
    	return "addSoba";
    }
    
    @RequestMapping(value="/addSoba", method=RequestMethod.POST)
    public String addSoba(@Valid @ModelAttribute("soba") Soba soba, BindingResult result) {
    	if (result.hasErrors()) {
			return "addSoba";
		}
    	System.err.println("Usao je u addSoba metodu.");
    	System.err.println("Soba: " + soba);
    	sobaService.addSoba(soba);
    	
    	return "redirect:/sveSobe";
    }
    
    @RequestMapping("/editSoba/{id}")
	public String editSoba(@PathVariable("id") int id, Model model) {
		Soba soba = sobaService.getSobaById(id);
		List<Hotel> hoteli = hotelService.getSveHotele();
    	model.addAttribute("soba", soba);
    	model.addAttribute("hoteli", hoteli);

		return "editSoba";
	}
    
    @RequestMapping(value = "/editSoba", method = RequestMethod.POST)
	public String editSobaPost(@Valid @ModelAttribute("soba") Soba soba) {
				
		sobaService.editSoba(soba);

		return "redirect:/sveSobe";
	}
    
    @RequestMapping("/deleteSoba/{id}")
	public String deleteSoba(@PathVariable int id, Model model) {
		
		Soba soba = sobaService.getSobaById(id);
		sobaService.deleteSoba(soba);
		
		return "redirect:/sveSobe";
	}
}
