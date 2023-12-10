package com.devlucasboaraujo.listaDeSeries.dto;

import com.devlucasboaraujo.listaDeSeries.entities.Series;
import com.devlucasboaraujo.listaDeSeries.projections.SeriesMinProjection;

// DTO (Data Transfer Object) é um objeto customizado utilizado para extrair apenas as informações necessárias 
//de uma entidade que contém uma grande quantidade de dados. 

public class SeriesMinDTO {

	private Long id;
	private String titulo;
	private Integer ano;
	private String imgUrl;
	private String descricaoCurta;
	
	public SeriesMinDTO(){
		
	}

	public SeriesMinDTO(Series entity) {
		id = entity.getId();
		titulo = entity.getTitulo();
		ano = entity.getAno();
		imgUrl = entity.getImgUrl();
		descricaoCurta = entity.getDescricaoCurta();
	}
	
	public SeriesMinDTO(SeriesMinProjection projection) {
		id = projection.getId();
		titulo = projection.getTitulo();
		ano = projection.getAno();
		imgUrl = projection.getImgUrl();
		descricaoCurta = projection.getDescricaoCurta();
	}

	public Long getId() {
		return id;
	}

	public String getTitulo() {
		return titulo;
	}

	public Integer getAno() {
		return ano;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public String getDescricaoLonga() {
		return descricaoCurta;
	}
	
	
	
	
}
