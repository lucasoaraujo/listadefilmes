package com.devlucasboaraujo.listaDeSeries.dto;

import com.devlucasboaraujo.listaDeSeries.entities.ListaDeSeries;

public class ListaDeSeriesDTO {

	private Long id;
	private String nome;
	
	public ListaDeSeriesDTO() {
		
	}

	public ListaDeSeriesDTO(ListaDeSeries entity) {
		id = entity.getId();
		nome = entity.getNome();
	}

	public Long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}
	
	
	
}
