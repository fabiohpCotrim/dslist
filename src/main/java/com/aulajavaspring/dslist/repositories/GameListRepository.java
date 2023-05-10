package com.aulajavaspring.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aulajavaspring.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
