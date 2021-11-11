package com.example.demo;

import static org.hamcrest.CoreMatchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;


@WebMvcTest(HomeController.class)
public class WebLayerTest {
	@Autowired
	private MockMvc mockMvc;
	
	@Test
	public void shouldReturnDefaultMessage() throws Exception{
		this.mockMvc.perform(get("/team")).andDo(print()).andExpect(status().isOk())
		.andExpect(content().string(containsString("{\"location\":\"California\",\"name\":\"US\",\"mascote\":\"Peanuts\",\"players\":[{\"name\":\"Charlie Brown\",\"position\":\"Pitcher\"},{\"name\":\"Snoopy\",\"position\":\"Shortstop\"}]}")));
	}
}
