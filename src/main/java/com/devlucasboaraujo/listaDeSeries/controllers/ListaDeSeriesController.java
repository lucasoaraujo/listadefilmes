package com.devlucasboaraujo.listaDeSeries.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devlucasboaraujo.listaDeSeries.dto.ListaDeSeriesDTO;
import com.devlucasboaraujo.listaDeSeries.services.ListaDeSeriesService;

// SeriesController vai ser a porta de entrada do back end, ele que vai disponibilizar a API, a API é a interface do back end
// @RestController é para configurar para ser o controlador
// @RequestMapping é para configurar o caminho que será respondido pela API

@RestController
@RequestMapping(value = "/lista")
public class ListaDeSeriesController {
	
// Controler injeta um Service através do @Autowired
	
	@Autowired
	private ListaDeSeriesService listaDeSeriesService;
	
// @GetMapping é o metodo utilizado para buscar os objetos, @GetMapping mapeia o metódo HTTP: GET.	
// @PathVariable é usado para garantir que o "id" no código corresponda ao "id" na solicitação da API.
	
	@GetMapping
	public List<ListaDeSeriesDTO> findAll(){
		List<ListaDeSeriesDTO> result = listaDeSeriesService.findAll();
		return result;
		
	}

}
