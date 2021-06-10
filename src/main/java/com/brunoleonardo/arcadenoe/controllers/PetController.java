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
import com.brunoleonardo.arcadenoe.controllers.dto.PetDto;
import com.brunoleonardo.arcadenoe.entities.Pet;
import com.brunoleonardo.arcadenoe.repositories.CidadeRepository;
import com.brunoleonardo.arcadenoe.repositories.EstadoRepository;
import com.brunoleonardo.arcadenoe.repositories.PetRepository;

@Controller
@RequestMapping("/cadastros")
public class PetController {
	
	@Autowired
	private PetRepository petRepository;
	
	@Autowired
	private CidadeRepository cidadeRepository;
	
	@Autowired
	private EstadoRepository estadoRepository;
	
	@GetMapping("/novoPet")
	public String novoPet(Model model) {
		model.addAttribute("pet", new Pet());
		model.addAttribute("estados", retornaEstadoDto());
		model.addAttribute("cidades", retornaCidadeDto());
		return "cadastros/cadastroPet";
	}
	
	@PostMapping("/cadastroPet")
	public String cadastraPet(@Valid PetDto petDto, BindingResult result, Model model) {
		if(result.hasErrors()) {
			model.addAttribute("erro", "Erro ao tentar cadastrar Pet:" + result.getAllErrors().get(0).getDefaultMessage());
			return "cadastros/cadastroPet";
		}
		Pet pet = petDto.converter();
		petRepository.save(pet);
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
