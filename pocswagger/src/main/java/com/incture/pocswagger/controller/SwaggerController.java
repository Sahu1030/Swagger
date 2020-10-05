package com.incture.pocswagger.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;

@RestController
public class SwaggerController {
	
	@GetMapping("/getData")
	@ApiOperation(value = "Load all data", response = String.class)
	public String getData()
	{
		return "Swagger Execution Data.";
	}
	
	@PostMapping("")
	@ApiOperation(value = "Post all data", response = String.class)
	public void postData()
	{
		
	}
	
	@DeleteMapping("")
	@ApiOperation(value = "Delete all data", response = String.class)
	public boolean deleteData()
	{
		return true;
	}

}
