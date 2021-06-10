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
import com.brunoleonardo.arcadenoe.controllers.dto.VeterinarioDto;
import com.brunoleonardo.arcadenoe.entities.Veterinario;
import com.brunoleonardo.arcadenoe.repositories.CidadeRepository;
import com.brunoleonardo.arcadenoe.repositories.EstadoRepository;
import com.brunoleonardo.arcadenoe.repositories.VeterinarioRepository;

@Controller
@RequestMapping("/cadastros")
public class VeterinarioController {
	
	@Autowired
	private VeterinarioRepository veterinarioRepository;
	
	@Autowired
	private CidadeRepository cidadeRepository;
	
	@Autowired
	private EstadoRepository estadoRepository;
	
	@GetMapping("/novoVeterinario")
	public String novoVeterinario(Model model) {
		model.addAttribute("veterinario", new Veterinario());
		model.addAttribute("estados", retornaEstadoDto());
		model.addAttribute("cidades", retornaCidadeDto());
		return "cadastros/cadastroVeterinario";		
	}
	
	@PostMapping("/cadastroVeterinario")
	public String cadastraVeterinario(@Valid VeterinarioDto veterinarioDto , BindingResult result, Model model) {
		if(result.hasErrors()) {
			model.addAttribute("erro", "Erro ao tentar cadastrar Veterinário:" + result.getAllErrors().get(0).getDefaultMessage());
			return "cadastros/cadastroVeterinario";
		}
		Veterinario veterinario = veterinarioDto.converter();
		veterinarioRepository.save(veterinario);
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
