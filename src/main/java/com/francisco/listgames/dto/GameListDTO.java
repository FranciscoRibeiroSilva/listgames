package com.francisco.listgames.dto;

import com.francisco.listgames.entities.GameList;

public class GameListDTO {
	private Long id;
	private String name;
	
	GameListDTO(){
		
	}

	public GameListDTO(GameList entity) {
		this.id = entity.getId();
		this.name = entity.getName();
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	
	
	
	
}
