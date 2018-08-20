package com.shubham.SpringAssignment2_2;

import java.util.List;

public class Country {
	
	
	private String countryId;
	
	private String countryName;
	
	private List<Player> player;
	
	

	public List<Player> getPlayer() {
		return player;
	}

	public void setPlayer(List<Player> player) {
		this.player = player;
	}

	public String getCountryId() {
		return countryId;
	}

	public void setCountryId(String countryId) {
		this.countryId = countryId;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	
	

}
