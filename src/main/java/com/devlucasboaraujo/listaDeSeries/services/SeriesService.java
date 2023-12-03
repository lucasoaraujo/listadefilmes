package com.devlucasboaraujo.listaDeSeries.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devlucasboaraujo.listaDeSeries.dto.SeriesMinDTO;
import com.devlucasboaraujo.listaDeSeries.entities.Series;
import com.devlucasboaraujo.listaDeSeries.repositories.SeriesRepository;

@Service
public class SeriesService<GameMinDTO> {
	
	@Autowired
	private SeriesRepository seriesRepository;
	
	public List<SeriesMinDTO> findAll(){
		List<Series> result = seriesRepository.findAll();
		return result.stream().map(x -> new SeriesMinDTO(x)).toList();
	}
	 

}
