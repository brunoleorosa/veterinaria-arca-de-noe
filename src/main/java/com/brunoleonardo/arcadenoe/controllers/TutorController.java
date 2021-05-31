package com.brunoleonardo.arcadenoe.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.brunoleonardo.arcadenoe.repositories.TutorRepository;

@Controller
public class TutorController {
	
	@Autowired
	TutorRepository tutorRepository;
	
	@RequestMapping("/tutor")
	public String cadastraTutor() {
		return null;		
	}
}
