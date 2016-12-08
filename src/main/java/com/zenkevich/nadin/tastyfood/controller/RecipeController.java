package com.zenkevich.nadin.tastyfood.controller;

import com.zenkevich.nadin.tastyfood.model.Recipe;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nadin on 12/8/16.
 */
@Controller
public class RecipeController {
  @RequestMapping(value = "/recipe", method = RequestMethod.GET)
  public ResponseEntity getRecipes(){
    Recipe recipe = new Recipe();
    recipe.setTitle("Title 1");
    recipe.setContent("Content 1");
    recipe.setImage("images/picture2.jpg");
    Recipe r2 = new Recipe("Title 2", "Content 2", "images/picture4.jpg");
    List<Recipe> recipes = new ArrayList<>();
    recipes.add(recipe);
    recipes.add(r2);
    return new ResponseEntity<>(recipes, HttpStatus.OK);
  }

}
