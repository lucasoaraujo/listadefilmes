package com.devlucasboaraujo.listaDeSeries.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devlucasboaraujo.listaDeSeries.dto.SeriesMinDTO;
import com.devlucasboaraujo.listaDeSeries.services.SeriesService;

@RestController
@RequestMapping(value = "/series")
public class SeriesController {
	
	@Autowired
	private SeriesService seriesService;
	
	@GetMapping
	public List<SeriesMinDTO> findAll(){
		List<SeriesMinDTO> result = seriesService.findAll();
		return result;
		
	}

}
