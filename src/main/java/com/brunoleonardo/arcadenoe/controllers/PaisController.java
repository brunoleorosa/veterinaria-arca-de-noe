package com.brunoleonardo.arcadenoe.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.brunoleonardo.arcadenoe.repositories.PaisRepository;

@Controller
@RequestMapping("/cadastros")
public class PaisController {
	
	@Autowired
	private PaisRepository paisRepository;
}
