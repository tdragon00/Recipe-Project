package com.example.ReipceProject.repositories;

import com.example.ReipceProject.Domain.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {

}
