package com.brunoleonardo.arcadenoe.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.brunoleonardo.arcadenoe.controllers.dto.CidadeDto;
import com.brunoleonardo.arcadenoe.controllers.dto.EstadoDto;
import com.brunoleonardo.arcadenoe.controllers.dto.TutorDto;
import com.brunoleonardo.arcadenoe.entities.Tutor;
import com.brunoleonardo.arcadenoe.repositories.CidadeRepository;
import com.brunoleonardo.arcadenoe.repositories.EstadoRepository;
import com.brunoleonardo.arcadenoe.repositories.TutorRepository;

@Controller
@RequestMapping("/cadastros")
public class TutorController {
	
	@Autowired
	private TutorRepository tutorRepository;
	
	@Autowired
	private EstadoRepository estadoRepository;
	
	@Autowired
	private CidadeRepository cidadeRepository;
	
	@GetMapping("/novoTutor")
	public String novo(Model model) {
		
		model.addAttribute("tutor", new Tutor());
		model.addAttribute("estados", retornaEstadoDto());
		model.addAttribute("cidades", retornaCidadeDto());
		
		return "cadastros/cadastroTutor";
	}
	
	@PostMapping("/cadastroTutor")
	public String cadastraTutor(@Valid TutorDto tutorDto, BindingResult result, Model model) {
		if(result.hasErrors()) {
			model.addAttribute("erro", "Erro ao tentar cadastrar Pet:" + result.getAllErrors().get(0).getDefaultMessage());
			model.addAttribute("tutor", tutorDto);
			return "cadastros/cadastroTutor";
		}
		Tutor tutor = tutorDto.converter();
		tutorRepository.save(tutor);
		return "redirect:/";
		
	}
	
	private Object retornaEstadoDto() {
		
		List<EstadoDto> estadosDto = new ArrayList<EstadoDto>();
		estadoRepository.findAll().forEach(e -> {
			estadosDto.add(new EstadoDto(e));
		});
		return estadosDto;
	}
	
	private Object retornaCidadeDto() {
		
		List<CidadeDto> cidadesDto = new ArrayList<CidadeDto>();
		cidadeRepository.findAll().forEach(c -> {
			cidadesDto.add(new CidadeDto(c));
		});
		return cidadesDto;
	}
}