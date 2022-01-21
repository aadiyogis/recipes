package org.learning.recipe.service;

import org.learning.recipe.domain.Recipe;
import org.learning.recipe.repositories.RecipeRepository;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class RecipeServiceImpl implements RecipeService {
    private final RecipeRepository recipeRepository;

    public RecipeServiceImpl(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    @Override
    public Set<Recipe> getAllRecipes() {
        Set<Recipe> recipeSet = new HashSet<>();
        Iterable<Recipe> recipes = recipeRepository.findAll();
        recipes.forEach(recipe -> recipeSet.add(recipe));
        return recipeSet;
    }
}
