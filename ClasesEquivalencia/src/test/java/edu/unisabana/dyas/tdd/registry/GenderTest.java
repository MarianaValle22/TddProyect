package edu.unisabana.dyas.tdd.registry;

import org.junit.Assert;
import org.junit.Test;

public class GenderTest {

    @Test
    public void shouldContainAllGenderValues() {
        Gender[] values = Gender.values();
        Assert.assertEquals(3, values.length);
        Assert.assertEquals(Gender.MALE, Gender.valueOf("MALE"));
        Assert.assertEquals(Gender.FEMALE, Gender.valueOf("FEMALE"));
        Assert.assertEquals(Gender.UNIDENTIFIED, Gender.valueOf("UNIDENTIFIED"));
    }
}
