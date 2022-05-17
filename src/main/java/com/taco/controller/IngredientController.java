package com.taco.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.taco.model.Ingredient;
import com.taco.repository.IngredientRepository;

@RestController
@RequestMapping(path = "/ingredients", produces = "application/json")
@CrossOrigin(origins = "*")
public class IngredientController {
	
	@Autowired
	private IngredientRepository ingredientRepo;

	
	@GetMapping
	public Iterable<Ingredient> getAllIngredients() {
		return ingredientRepo.findAll();
	}
	
	@GetMapping("/{id}")
	public Ingredient ingredientById(@PathVariable("id") String id) {
	Optional<Ingredient> optIngredient = ingredientRepo.findById(id);
		if (optIngredient.isPresent()) {
			return optIngredient.get();
		}
		return null;
	}
}
