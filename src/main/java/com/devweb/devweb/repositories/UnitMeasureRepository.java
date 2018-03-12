package com.devweb.devweb.repositories;

import com.devweb.devweb.domain.UnitMeasure;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UnitMeasureRepository extends CrudRepository<UnitMeasure,Long> {

    Optional<UnitMeasure> findByDescription(String description);
}
