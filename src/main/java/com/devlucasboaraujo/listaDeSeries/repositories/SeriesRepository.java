package com.devlucasboaraujo.listaDeSeries.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devlucasboaraujo.listaDeSeries.entities.Series;

public interface SeriesRepository extends JpaRepository<Series, Long>{

}
