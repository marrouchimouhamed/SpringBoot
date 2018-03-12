package com.devweb.devweb.domain;


import lombok.Data;

import javax.persistence.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
@Data
@Entity
public class Recipe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;
    private Integer prepTime;
    private Integer cookTime;
    private Integer servings;
    private String source;
    private String url;
    @Lob
    private String directions;
    //todo add
    //private Difficulty difficulty;
    @Lob
    private Byte[] imge;
    @OneToOne(cascade = CascadeType.ALL)
    private Notes notes;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "recipe")
    private Set<Ingredient> ingredients = new HashSet<>();
    @Enumerated(value = EnumType.STRING)
    private Difficulty difficulty;
    @ManyToMany
    @JoinTable(name = "recipe_Category",
        joinColumns = @JoinColumn(name = "recipe_id"),
            inverseJoinColumns = @JoinColumn(name = "categories_id"))
    private Set<Category> categories= new HashSet<>();



    public void setNotes(Notes notes) {
        this.notes = notes;
        notes.setRecipe(this);
    }
    public Recipe addIngredient(Ingredient ingredient){
        ingredient.setRecipe(this);
        this.ingredients.add(ingredient);
                return this;
    }


}
