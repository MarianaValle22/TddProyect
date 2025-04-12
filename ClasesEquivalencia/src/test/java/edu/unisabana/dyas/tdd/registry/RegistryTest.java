package edu.unisabana.dyas.tdd.registry;

import org.junit.Assert;
import org.junit.Test;

public class RegistryTest {
    private Registry registry = new Registry();

    @Test
    public void validateRegistryForAliveAdultWithValidAge() {
        Person person = new Person("Ana", 1, 30, Gender.FEMALE, true);
        RegisterResult result = registry.registerVoter(person);
        System.out.println("Prueba registro valido: " + result); 

        Assert.assertEquals(RegisterResult.VALID, result);
    }

    @Test
    public void validateRegistryResultForDeceasedPerson() {
        Person person = new Person("Carlos", 1002, 40, Gender.MALE, false);
        RegisterResult result = registry.registerVoter(person);
        System.out.println("Prueba persona muerta: " + result); 

        Assert.assertEquals(RegisterResult.DEAD, result);
    }

    @Test
    public void validateRegistryResultForInvalidAge() {
        Person person = new Person("Tomás", 1004, -5, Gender.MALE, true);
        RegisterResult result = registry.registerVoter(person);
        System.out.println("Prueba edad invalida (Negativa): " + result); 

        Assert.assertEquals(RegisterResult.INVALID_AGE, result);
    }

    @Test
    public void validateRegistryResultForOldPersonImaginary() {
        Person person = new Person("Juana", 1005, 200, Gender.FEMALE, true);
        RegisterResult result = registry.registerVoter(person);
        System.out.println("Prueba edad invalida (Mayor a 120): " + result); 

        Assert.assertEquals(RegisterResult.INVALID_AGE, result);
    }

    @Test
    public void validateRegistryResultForDuplicatedId() {
        Person person1 = new Person("Pedro", 1006, 40, Gender.MALE, true);
        Person person2 = new Person("Pedro Copia", 1006, 40, Gender.MALE, true);

        registry.registerVoter(person1); 

        RegisterResult result = registry.registerVoter(person2);
        System.out.println("Prueba ID duplicado: " + result); 

        Assert.assertEquals(RegisterResult.DUPLICATED, result);
    }
}
