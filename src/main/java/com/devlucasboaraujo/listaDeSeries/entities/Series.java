package com.devlucasboaraujo.listaDeSeries.entities;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

// A anotação `@Entity` em Java, usando `jakarta.persistence.Entity`, indica que a classe `Series` 
// está mapeada para uma tabela em um banco de dados relacional. Isso permite que objetos da classe sejam 
// armazenados e recuperados do banco de dados usando a Java Persistence API (JPA). 
// A anotação @Table é o nome da tabela no banco de dados relacional
// A anotação @Id é para definir como chave primaria
// A anotação @GeneratedValue é para que o id seja autoincrementado pelo banco de dados

@Entity
@Table(name = "tb_series")
public class Series {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String titulo;
	private Integer ano;
	private String genero;
	private String plataforma;
	private Double pontuaçao;
	private String imgUrl;
	private String descriçaoCurta;
	private String DecriçaoLonga;

	public Series() {

	}

	public Series(Long id, String titulo, Integer ano, String genero, String plataforma, Double pontuaçao,String imgUrl,
			String descriçaoCurta, String decriçaoLonga) {
		this.id = id;
		this.titulo = titulo;
		this.ano = ano;
		this.genero = genero;
		this.plataforma = plataforma;
		this.pontuaçao = pontuaçao;
		this.imgUrl = imgUrl;
		this.descriçaoCurta = descriçaoCurta;
		this.DecriçaoLonga = decriçaoLonga;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getPlataforma() {
		return plataforma;
	}

	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}

	
	public Double getPontuaçao() {
		return pontuaçao;
	}

	public void setPontuaçao(Double pontuaçao) {
		this.pontuaçao = pontuaçao;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public String getDescriçaoCurta() {
		return descriçaoCurta;
	}

	public void setDescriçaoCurta(String descriçaoCurta) {
		this.descriçaoCurta = descriçaoCurta;
	}

	public String getDecriçaoLonga() {
		return DecriçaoLonga;
	}

	public void setDecriçaoLonga(String decriçaoLonga) {
		DecriçaoLonga = decriçaoLonga;
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
		Series other = (Series) obj;
		return Objects.equals(id, other.id);
	}

	
}
