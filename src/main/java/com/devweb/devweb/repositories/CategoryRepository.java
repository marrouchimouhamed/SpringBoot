package com.devweb.devweb.repositories;

import com.devweb.devweb.domain.Category;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface CategoryRepository extends CrudRepository <Category,Long> {

    Optional<Category> findByDescription(String description);
}
