package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
public class TeamController {
	private final TeamService service;
	
	public TeamController(TeamService service) {
		this.service = service;
	}
	
	@RequestMapping("/llamaTeam")
	public @ResponseBody String team() {
		return service.callTeam();
	}
}
