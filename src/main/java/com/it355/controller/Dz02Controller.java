package com.it355.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author Darko
 */

@Controller
@RequestMapping("/dz02")
public class Dz02Controller {
    
    @RequestMapping(method = RequestMethod.GET)
    public String printHello(ModelMap model) {
        model.addAttribute("poruka", "Ovo je drugi domaći zadatak iz predmeta IT355. Student: Darko Mišić, 2305.");
        return "dz02";
    }
}
