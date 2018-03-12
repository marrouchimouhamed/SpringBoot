package com.devweb.devweb.repositories;

import com.devweb.devweb.domain.UnitMeasure;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@DataJpaTest
public class UnitMeasureRepositoryIT {

    @Autowired
    UnitMeasureRepository unitMeasureRepository;
    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void findByDescription() {
        Optional<UnitMeasure> unitMeasure = unitMeasureRepository.findByDescription("pound");
        assertEquals("pound",unitMeasure.get().getDescription());

    }
    @Test
    public void findByDescriptionCup() {
        Optional<UnitMeasure> unitMeasure = unitMeasureRepository.findByDescription("Cup");
        assertEquals("Cup",unitMeasure.get().getDescription());

    }
}