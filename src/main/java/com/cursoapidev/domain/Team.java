package com.cursoapidev.domain;

import java.util.Set;

public class Team {
	String location;
	String name;
	String mascote;
	Set<Player> players;
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMascote() {
		return mascote;
	}
	public void setMascote(String mascote) {
		this.mascote = mascote;
	}
	public Set<Player> getPlayers() {
		return players;
	}
	public void setPlayers(Set<Player> players) {
		this.players = players;
	}
	public Team(String location, String name, String mascote, Set<Player> players) {
		this.location = location;
		this.name = name;
		this.mascote = mascote;
		this.players = players;
	}
	
	
}
