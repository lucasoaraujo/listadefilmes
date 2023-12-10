package com.devlucasboaraujo.listaDeSeries.projections;

public interface SeriesMinProjection {
	
	Long getId();
	Integer getAno();
	String getImgUrl();
	Integer getPosicao();
	String getTitulo();
	String getDescricaoCurta();

}
