package edu.unisabana.dyas.tdd.registry;

import org.junit.Assert;
import org.junit.Test;

public class PersonTest {

    @Test
    public void shouldStoreAndReturnAttributesCorrectly() {
        Person person = new Person("Carlos", 2002, 45, Gender.MALE, true);
        Assert.assertEquals("Carlos", person.getName());
        Assert.assertEquals(2002, person.getId());
        Assert.assertEquals(45, person.getAge());
        Assert.assertEquals(Gender.MALE, person.getGender());
        Assert.assertTrue(person.isAlive());
    }

    @Test
    public void shouldModifyAttributesWithSetters() {
        Person person = new Person();
        person.setName("Sofia");
        person.setId(3030);
        person.setAge(20);
        person.setGender(Gender.FEMALE);
        person.setAlive(false);

        Assert.assertEquals("Sofia", person.getName());
        Assert.assertEquals(3030, person.getId());
        Assert.assertEquals(20, person.getAge());
        Assert.assertEquals(Gender.FEMALE, person.getGender());
        Assert.assertFalse(person.isAlive());
    }
}
