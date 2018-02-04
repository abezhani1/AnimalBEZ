package edu.advjavabezhani.test;

import org.junit.Test;
import edu.advjavabezhani.Cat;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;

public class CatTest {
    public Cat cat;

    @Test
    public void testThatCat()
    {
        cat = new Cat (mousesKilled: 4, name: "Thor");
        assertTrue(message: "The cat killed the wrong number of mice", condition: cat.getMousesKilled()<5);
        assertEquals(message: "The cat really killed the wrong number of mice", expected: 4, cat.getMousesKilled());
    }
}
