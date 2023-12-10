package com.devlucasboaraujo.listaDeSeries.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.devlucasboaraujo.listaDeSeries.entities.Series;
import com.devlucasboaraujo.listaDeSeries.projections.SeriesMinProjection;

// Repository é um objeto de acesso a dados, ele faz a consulta no banco, tras do bando de dados os filmes, devolve isso para uma classe 
// service, e esse serviço por sua vez devolve o DTO equivalente para o controlador. Resumindo, Repository é um objeto responsavel 
// por fazer consultas ao banco de dados.
// `JpaRepository` é uma interface do Spring Data JPA que fornece métodos padrão para operações de banco de dados, como salvar, 
// buscar, atualizar e excluir entidades, sem a necessidade de escrever consultas SQL, simplificando o acesso a dados em aplicações 
// Java com JPA.

public interface SeriesRepository extends JpaRepository<Series, Long>{

	@Query(nativeQuery = true, value = """
	SELECT tb_series.id, tb_series.titulo, tb_series.ano, tb_series.img_url AS imgUrl,
	tb_series.descricao_curta AS descricaoCurta, tb_pertencimento.posicao
	FROM tb_series
	INNER JOIN tb_pertencimento ON tb_series.id = tb_pertencimento.series_id
	WHERE tb_pertencimento.lista_id = :listaId
	ORDER BY tb_pertencimento.posicao
	""")
List<SeriesMinProjection> searchByList(Long listaId);	
	
}
