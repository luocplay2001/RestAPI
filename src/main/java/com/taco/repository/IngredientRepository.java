package com.taco.repository;

import org.springframework.data.repository.CrudRepository;

import com.taco.model.Ingredient;

public interface IngredientRepository extends CrudRepository<Ingredient, String>{
	

}
