package com.taco.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor(access=AccessLevel.PRIVATE, force=true)
@Table(name = "ingredients")
public class Ingredient {
	
	@Id
	private final String id;
	
	private final String name;
	
	@Enumerated(EnumType.STRING)	
	private final Type type;	
	public static enum Type {
	WRAP, PROTEIN, VEGGIES, CHEESE, SAUCE
	}
}
