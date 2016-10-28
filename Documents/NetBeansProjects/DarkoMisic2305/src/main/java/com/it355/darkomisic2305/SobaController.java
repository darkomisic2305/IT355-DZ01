/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.it355.darkomisic2305;

import com.it355.model.Soba;
import java.util.Locale;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Darko
 */
@Controller
@RequestMapping("/")
public class SobaController {
    
    @Autowired
    private MessageSource messageSource;
    
    @RequestMapping(value = "/soba", method = RequestMethod.GET)
    public ModelAndView soba() {
        System.out.println("Poziva se message source:");
        System.out.println(messageSource.getMessage("numOfBeds", null, Locale.ENGLISH));
        
        return new ModelAndView("soba", "command", new Soba());
    }
    
    @RequestMapping(value = "/addSoba", method = RequestMethod.POST)
    public String addSoba(@ModelAttribute Soba soba, ModelMap model) {
        model.addAttribute("brojKreveta", soba.getBrojKreveta());
        model.addAttribute("velicina", soba.getVelicina());
        model.addAttribute("imaKupatilo", soba.getImaKupatilo());
        model.addAttribute("imaTv", soba.getImaTv());
        model.addAttribute("imaKlima", soba.getImaKlima());
        model.addAttribute("cenaPoDanu", soba.getCenaPoDanu());
        
        return "prikaz_soba";
    }
}
