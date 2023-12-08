package com.devlucasboaraujo.listaDeSeries.entities;

import java.util.Objects;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

// @Embeddable está encapsulando dois atributos em uma classe só

@Embeddable
public class PertencimentoPK {
	
// @ManyToOne é a configuraçao do JPA para fazer o mapeamento do objeto relacional
// @JoinColumn é a configuração do nome da chave estrangeira
	
    @ManyToOne
    @JoinColumn(name = "series_id")
	private Series series;
    @ManyToOne
    @JoinColumn(name = "lista_id")
	private ListaDeSeries lista;
	
	public PertencimentoPK() {
		
	}

	public PertencimentoPK(Series series, ListaDeSeries lista) {
		this.series = series;
		this.lista = lista;
	}

	public Series getSeries() {
		return series;
	}

	public void setSeries(Series series) {
		this.series = series;
	}

	public ListaDeSeries getLista() {
		return lista;
	}

	public void setLista(ListaDeSeries lista) {
		this.lista = lista;
	}

	@Override
	public int hashCode() {
		return Objects.hash(lista, series);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PertencimentoPK other = (PertencimentoPK) obj;
		return Objects.equals(lista, other.lista) && Objects.equals(series, other.series);
	}
	
	
}
