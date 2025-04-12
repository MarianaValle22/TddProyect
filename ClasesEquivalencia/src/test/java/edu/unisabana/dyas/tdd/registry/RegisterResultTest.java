package edu.unisabana.dyas.tdd.registry;

import org.junit.Assert;
import org.junit.Test;

public class RegisterResultTest {

    @Test
    public void shouldContainAllEnumValues() {
        RegisterResult[] values = RegisterResult.values();
        Assert.assertEquals(5, values.length);
        Assert.assertEquals(RegisterResult.DEAD, RegisterResult.valueOf("DEAD"));
        Assert.assertEquals(RegisterResult.UNDERAGE, RegisterResult.valueOf("UNDERAGE"));
        Assert.assertEquals(RegisterResult.INVALID_AGE, RegisterResult.valueOf("INVALID_AGE"));
        Assert.assertEquals(RegisterResult.VALID, RegisterResult.valueOf("VALID"));
        Assert.assertEquals(RegisterResult.DUPLICATED, RegisterResult.valueOf("DUPLICATED"));
    }
}

