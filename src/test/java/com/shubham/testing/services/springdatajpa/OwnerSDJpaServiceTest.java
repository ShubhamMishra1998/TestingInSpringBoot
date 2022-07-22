package com.shubham.testing.services.springdatajpa;

import com.shubham.testing.model.Owner;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

@Disabled(value = "disabled until we learn mocking")
class OwnerSDJpaServiceTest {
    OwnerSDJpaService service;

    @BeforeEach
    void setUp() {
        service=new OwnerSDJpaService(null,null,null);
    }

    @Test
    @Disabled
    void findByLastName() {
        Owner owner=service.findByLastName("Buck");
    }

    @Test
    void findAllByLastNameLike() {
    }

    @Test
    void findAll() {
    }

    @Test
    void findById() {
    }

    @Test
    void save() {
    }

    @Test
    void delete() {
    }

    @Test
    void deleteById() {
    }
}