package com.aulajavaspring.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aulajavaspring.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
