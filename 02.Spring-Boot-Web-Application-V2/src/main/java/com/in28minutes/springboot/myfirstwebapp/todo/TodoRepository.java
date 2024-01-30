package com.in28minutes.springboot.myfirstwebapp.todo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

// Allow Action to be performed on entities.
// Repo is Interface. Naming Convention: Entity+Repository
// Must extend JpaRepository
// <What bean its managing, Type of ID field>

// If search by Id, dont need Repo. But because we trying to find by username
// Spring Data JPA will automatically create method to do the search.
public interface TodoRepository extends JpaRepository<Todo, Integer>{
	public List<Todo> findByUsername(String username);
}
