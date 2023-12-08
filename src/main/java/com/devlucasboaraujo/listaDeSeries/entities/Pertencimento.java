package com.devlucasboaraujo.listaDeSeries.entities;

import java.util.Objects;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_pertencimento")
public class Pertencimento {
	
	@EmbeddedId
	private PertencimentoPK id = new PertencimentoPK();
	
	private Integer posicao;
	
	public Pertencimento() {
		
	}

	public Pertencimento(Series series, ListaDeSeries lista, Integer posicao) {
		id.setSeries(series);
		id.setLista(lista);
		this.posicao = posicao;
	}

	public PertencimentoPK getId() {
		return id;
	}

	public void setId(PertencimentoPK id) {
		this.id = id;
	}

	public Integer getPosicao() {
		return posicao;
	}

	public void setPosicao(Integer posicao) {
		this.posicao = posicao;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pertencimento other = (Pertencimento) obj;
		return Objects.equals(id, other.id);
	}
	
	
	
	

}
