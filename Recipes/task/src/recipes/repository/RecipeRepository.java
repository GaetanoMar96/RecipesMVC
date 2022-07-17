package recipes.repository;

import org.springframework.data.repository.CrudRepository;
import recipes.entity.Recipe;

public interface RecipeRepository extends CrudRepository<Recipe, Integer> {

}

