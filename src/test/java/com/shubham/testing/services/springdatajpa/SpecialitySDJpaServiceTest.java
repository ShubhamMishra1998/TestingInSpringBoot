package com.shubham.testing.services.springdatajpa;

import com.shubham.testing.model.Speciality;
import com.shubham.testing.repositories.SpecialtyRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class SpecialitySDJpaServiceTest {
    @InjectMocks
    SpecialitySDJpaService service;
    @Mock
    SpecialtyRepository repository;

    @Test
    void findByIdTest(){
      Speciality speciality=new Speciality();
      when(repository.findById(1L)).thenReturn(Optional.of(speciality));
        Speciality found=service.findById(1L);
        assertNotNull(found);
        verify(repository).findById(1L);
    }

    @Test
    void delete() {
        service.deleteById(1L);
        verify(repository,times(1)).deleteById(1L);
    }

    @Test
    void deleteById() {
        Speciality speciality=new Speciality();
        service.delete(speciality);
        verify(repository,times(1)).delete(any(Speciality.class));
    }

    @Test
    void testDoThrow(){
        doThrow(new RuntimeException("sdgsdg")).when(repository).deleteById(any());
        assertThrows(RuntimeException.class,()->repository.deleteById(any()));
        verify(repository).deleteById(any());
    }




}