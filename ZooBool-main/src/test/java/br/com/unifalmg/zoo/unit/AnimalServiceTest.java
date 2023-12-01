package br.com.unifalmg.zoo.unit;

import br.com.unifalmg.zoo.entity.Animal;
import br.com.unifalmg.zoo.exception.AnimalNotFoundException;
import br.com.unifalmg.zoo.repository.AnimalRepository;
import br.com.unifalmg.zoo.service.AnimalService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class AnimalServiceTest {

//    @InjectMocks
//    private AnimalService service;
//
//    @Mock
//    private AnimalRepository repository;
//
//    @Test
//    @DisplayName("#findById > When the id is null > Throw an exception")
//    void findByIdWhenTheIdIsNullThrowAnException() {
//        assertThrows(IllegalArgumentException.class, () ->
//                service.findById(null));
//    }
//
//    @Test
//    @DisplayName("#findById > When the id is not null > When a user is found > Return the user")
//    void findByIdWhenTheIdIsNotNullWhenAUserIsFoundReturnTheUser() {
//        when(repository.findById(1)).thenReturn(Optional.of(Animal.builder()
//                        .id(1)
//                        .name("Fellipe")
//                        .username("felliperey")
//                .build()));
//        Animal response = service.findById(1);
//        assertAll(
//                () -> assertEquals(1, response.getId()),
//                () -> assertEquals("Fellipe", response.getName()),
//                () -> assertEquals("felliperey", response.getUsername())
//        );
//    }
//
//    @Test
//    @DisplayName("#findById > When the id is not null > When no user is found > Throw an exception")
//    void findByIdWhenTheIdIsNotNullWhenNoUserIsFoundThrowAnException() {
//        when(repository.findById(2)).thenReturn(Optional.empty());
//        assertThrows(AnimalNotFoundException.class, () ->
//                service.findById(2));
//    }
//
//    // TODO: Implement test cases for getAllUsers

}
