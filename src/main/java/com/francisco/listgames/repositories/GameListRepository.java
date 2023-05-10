package com.francisco.listgames.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.francisco.listgames.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
