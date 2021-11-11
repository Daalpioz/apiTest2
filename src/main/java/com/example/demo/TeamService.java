package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class TeamService {
	public String callTeam() {
		return "\"location\":\"California\",\"name\":\"US\",\"mascote\":\"Peanuts\",\"players\":[{\"name\":\"Charlie Brown\",\"position\":\"Pitcher\"},{\"name\":\"Snoopy\",\"position\":\"Shortstop\"}]}";
	}
}
