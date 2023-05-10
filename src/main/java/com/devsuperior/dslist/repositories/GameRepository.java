package com.devsuperior.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dslist.entities.Game;

//Faz a consulta no BD - Componente de camada de acesso a dados
public interface GameRepository extends JpaRepository<Game, Long>{
	

}
