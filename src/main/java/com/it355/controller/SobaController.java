package com.it355.controller;

import com.it355.model.Soba;
import com.it355.service.SobaService;

import java.util.List;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
    	Soba soba = new Soba();
    	
    	model.addAttribute("soba", soba);
    	
    	return "addSoba";
    }
    
    @RequestMapping(value="/addSoba", method=RequestMethod.POST)
    public String addSoba(@ModelAttribute("soba") Soba soba) {
    	sobaService.addSoba(soba);
    	
    	return "redirect:/sveSobe";
    }
    
    @RequestMapping("/editSoba/{id}")
	public String editSoba(@PathVariable("id") int id, Model model) {
		Soba soba = sobaService.getSobaById(id);

		model.addAttribute("soba", soba);

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
