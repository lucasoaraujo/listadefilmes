package com.devlucasboaraujo.listaDeSeries.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devlucasboaraujo.listaDeSeries.entities.Series;

// Repository é um objeto de acesso a dados, ele faz a consulta no banco, tras do bando de dados os filmes, devolve isso para uma classe 
// service, e esse serviço por sua vez devolve o DTO equivalente para o controlador. Resumindo, Repository é um objeto responsavel 
// por fazer consultas ao banco de dados.
// `JpaRepository` é uma interface do Spring Data JPA que fornece métodos padrão para operações de banco de dados, como salvar, 
// buscar, atualizar e excluir entidades, sem a necessidade de escrever consultas SQL, simplificando o acesso a dados em aplicações 
// Java com JPA.

public interface SeriesRepository extends JpaRepository<Series, Long>{

}
