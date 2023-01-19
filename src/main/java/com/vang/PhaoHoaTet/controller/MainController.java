/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.vang.PhaoHoaTet.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author kyqua
 */
@Controller
public class MainController {

    @GetMapping(value = {"/","/home"})
    public String homePage() {
        return "index";
    }
}
