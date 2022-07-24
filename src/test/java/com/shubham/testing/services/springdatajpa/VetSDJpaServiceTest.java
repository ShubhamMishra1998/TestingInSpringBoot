package com.shubham.testing.services.springdatajpa;

import com.shubham.testing.repositories.VetRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class VetSDJpaServiceTest {
    @InjectMocks
    VetSDJpaService vetSDJpaService;
    @Mock
    VetRepository repository;

    @Test
    void deleteById() {
         vetSDJpaService.deleteById(1L);
         verify(repository,times(1)).deleteById(1L);
         verify(repository,never()).deleteById(5L);
         verify(repository,atMostOnce()).deleteById(1L);
    }
}