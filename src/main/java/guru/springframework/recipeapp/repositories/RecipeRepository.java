package guru.springframework.recipeapp.repositories;

import guru.springframework.recipeapp.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

import java.util.Set;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {

    Set<Recipe> findAll();

    Recipe save(Recipe recipe);
}
