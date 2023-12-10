package com.devlucasboaraujo.listaDeSeries.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devlucasboaraujo.listaDeSeries.dto.ListaDeSeriesDTO;
import com.devlucasboaraujo.listaDeSeries.entities.ListaDeSeries;
import com.devlucasboaraujo.listaDeSeries.repositories.ListaDeSeriesRepository;

// O serviço tem que devolver um DTO
// seriesRepository.findall é um metodo que vai gerar uma consulta no banco de dados, pra buscar no banco de dados
// todas as series, o resultado dessa consulta será convertida em uma lista de series.

@Service
public class ListaDeSeriesService<GameMinDTO> {
	
// SeriesService tem que chamar o SeriesRepository que está em outra camada, e para chamar se utiliza o @Autowired
	
	@Autowired
	private ListaDeSeriesRepository listaDeSeriesRepository;
	
// @Transactional(readOnly = true)significa que a transação é destinada apenas para leitura no banco de dados,
// qualquer tentativa de modificar (inserir, atualizar, excluir) dados resultará em uma exceção.	
	
	@Transactional(readOnly = true)
	public List<ListaDeSeriesDTO> findAll(){
		List<ListaDeSeries> result = listaDeSeriesRepository.findAll();
		return result.stream().map(x -> new ListaDeSeriesDTO(x)).toList();
	} 

}
