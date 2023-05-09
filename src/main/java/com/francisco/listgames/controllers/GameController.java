package com.francisco.listgames.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.francisco.listgames.entities.Game;
import com.francisco.listgames.services.GameService;

@RestController
@RequestMapping(value = "/games")
public class GameController {
	
	@Autowired
	private GameService gameService;
	@GetMapping
	public List<Game>findAll(){
		List<Game> result = gameService.findAll();
		return result;
	}
	
}
