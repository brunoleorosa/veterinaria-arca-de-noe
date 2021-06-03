package com.brunoleonardo.arcadenoe.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.brunoleonardo.arcadenoe.controllers.dto.EstadoDto;
import com.brunoleonardo.arcadenoe.controllers.dto.PaisDto;
import com.brunoleonardo.arcadenoe.entities.Tutor;
import com.brunoleonardo.arcadenoe.repositories.EstadoRepository;
import com.brunoleonardo.arcadenoe.repositories.PaisRepository;
import com.brunoleonardo.arcadenoe.repositories.TutorRepository;

@Controller
@RequestMapping("/cadastros")
public class TutorController {
	
	@Autowired
	private TutorRepository tutorRepository;
	
	@Autowired
	private PaisRepository paisRepository;
	
	@Autowired
	private EstadoRepository estadoRepository;
	
	@GetMapping("/novoTutor")
	public String novo(Model model) {
		
		model.addAttribute("tutor", new Tutor());
		model.addAttribute("paises", retornaPaisesDto());
		model.addAttribute("estados", retornaEstadoDto());
		
		return "cadastros/cadastroTutor";
	}

	private List<PaisDto> retornaPaisesDto(){
		
		List<PaisDto> paisesDto = new ArrayList<PaisDto>();
		
		paisRepository.findAll().forEach(p -> {
			paisesDto.add(new PaisDto(p));
		}); 
		return paisesDto;
	}
	
	private Object retornaEstadoDto() {
		
		List<EstadoDto> estadosDto = new ArrayList<EstadoDto>();
		estadoRepository.findAll().forEach(e -> {
			estadosDto.add(new EstadoDto(e));
		});
		return estadosDto;
	}
}
