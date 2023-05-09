package com.francisco.listgames.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.francisco.listgames.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
