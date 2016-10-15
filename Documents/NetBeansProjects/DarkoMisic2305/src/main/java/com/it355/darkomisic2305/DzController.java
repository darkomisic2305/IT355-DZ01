/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.it355.darkomisic2305;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author Darko
 */

@Controller
@RequestMapping("/")
public class DzController {
    
    @RequestMapping(method = RequestMethod.GET)
    public String printHello(ModelMap model) {
        model.addAttribute("poruka", "Ovo je prvi domaći zadatak iz predmeta IT355. Student: Darko Mišić, 2305.");
        return "dz01";
    }
}
