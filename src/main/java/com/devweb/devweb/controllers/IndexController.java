package com.devweb.devweb.controllers;


import com.devweb.devweb.services.RecipeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Slf4j
@Controller
public class IndexController {

    private final RecipeService recipeService ;

    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }


    @RequestMapping({"","/","/index"})
    public String getindex(Model model){
        log.debug("geting index page");
       model.addAttribute("recipes",recipeService.getrecipes());

        return "index";
    }

}
