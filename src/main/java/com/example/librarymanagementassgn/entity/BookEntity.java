package com.example.librarymanagementassgn.entity;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@
public class BookEntity {
	
	
	private Long id;
	
	private String name;
	private String authorname;
	private String description;
	private String rating;
	
}
