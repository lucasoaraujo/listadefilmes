package com.devlucasboaraujo.listaDeSeries.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devlucasboaraujo.listaDeSeries.dto.SeriesMinDTO;
import com.devlucasboaraujo.listaDeSeries.entities.Series;
import com.devlucasboaraujo.listaDeSeries.repositories.SeriesRepository;

// O serviço tem que devolver um DTO
// seriesRepository.findall é um metodo que vai gerar uma consulta no banco de dados, pra buscar no banco de dados
// todas as series, o resultado dessa consulta será convertida em uma lista de series.

@Service
public class SeriesService<GameMinDTO> {
	
// SeriesService tem que chamar o SeriesRepository que está em outra camada, e para chamar se utiliza o @Autowired
	
	@Autowired
	private SeriesRepository seriesRepository;
	
	public List<SeriesMinDTO> findAll(){
		List<Series> result = seriesRepository.findAll();
		return result.stream().map(x -> new SeriesMinDTO(x)).toList();
	}
	 

}
