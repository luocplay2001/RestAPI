package com.taco.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.PrePersist;
import javax.persistence.Table;

@Entity
@Table(name="Taco_Order")
public class Order implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Id	
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private Date placedAt;
	@ManyToMany(targetEntity=Taco.class)
	private List<Taco> tacos = new ArrayList<>();
	public void addDesign(Taco design){this.tacos.add(design);}
	
	@PrePersist
	void placedAt() {
	this.placedAt = new Date();
	}
}
