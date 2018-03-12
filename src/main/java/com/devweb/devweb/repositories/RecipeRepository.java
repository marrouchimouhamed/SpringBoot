package com.devweb.devweb.repositories;

import com.devweb.devweb.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe,Long> {
}
