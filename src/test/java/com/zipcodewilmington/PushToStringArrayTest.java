package com.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;

public class PushToStringArrayTest {

    @Test
    public void pushToStringArray() {
        String[] array = { "a", "b", "c", "d", "e" };
        String[] expected = { "a", "b", "c", "d", "e", "f" };
        String[] actual = StringArrayUtils.pushToStringArray(array, "f");
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void pushToStringArrayTwo() {
        String[] array = { "a", "b", "c", "dddd", "e" };
        String[] expected = { "a", "b", "c", "dddd", "e", "qwop" };
        String[] actual = StringArrayUtils.pushToStringArray(array, "qwop");
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void pushToStringArrayThree() {
        String[] array = { "a", "b" };
        String[] expected = { "a", "b" };
        String[] actual = StringArrayUtils.pushToStringArray(array, "b");
        Assert.assertNotEquals(expected, actual);
    }
}