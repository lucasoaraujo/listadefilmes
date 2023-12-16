package com.devlucasboaraujo.listaDeSeries.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devlucasboaraujo.listaDeSeries.dto.SeriesDTO;
import com.devlucasboaraujo.listaDeSeries.dto.SeriesMinDTO;
import com.devlucasboaraujo.listaDeSeries.services.SeriesService;

// SeriesController vai ser a porta de entrada do back end, ele que vai disponibilizar a API, a API é a interface do back end
// @RestController é para configurar para ser o controlador
// @RequestMapping é para configurar o caminho que será respondido pela API

@RestController
@RequestMapping(value = "/series")
public class SeriesController {
	
// Controler injeta um Service através do @Autowired
	
	@Autowired
	private SeriesService seriesService;
	
// @GetMapping é o metodo utilizado para buscar os objetos, @GetMapping mapeia o metódo HTTP: GET.	
// @PathVariable é usado para garantir que o "id" no código corresponda ao "id" na solicitação da API.
	
	@GetMapping(value = "/{id}")
	public SeriesDTO findById(@PathVariable Long id){
		SeriesDTO result = seriesService.findById(id);
		return result;
	}
	
	@GetMapping
	public List<SeriesMinDTO> findAll(){
		List<SeriesMinDTO> result = seriesService.findAll();
		return result;
		
	}

}
