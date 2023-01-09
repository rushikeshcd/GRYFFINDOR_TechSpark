package com.example.Shipment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.Shipment.repository.AgentRepository;
import com.example.Shipment.model.*;
import java.util.*;

@CrossOrigin(origins = "http://localhost:3000/")
@RestController
@RequestMapping("/api/v1/")
public class AgentController {

	@Autowired
	private AgentRepository agentRepository;

	@GetMapping("/agent")
	public List<Agent> getAllAgent(){
		return agentRepository.findAll();
	}

	@PostMapping("/agent")
	public Agent createAgent(@RequestBody Agent agent){
		System.out.println(agent.toString());
		return agentRepository.save(agent);
	}
}
