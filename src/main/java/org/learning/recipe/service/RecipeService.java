package org.learning.recipe.service;

import org.learning.recipe.domain.Recipe;

import java.util.Set;

public interface RecipeService {
    Set<Recipe> getAllRecipes();
}
