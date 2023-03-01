package de.reinerh.courses.java.lists.dynarrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class DynamicArrayTest {
    @Test
    public void TestDynamicArray_add_keys() {
        var l1 = new DynamicArray();
        l1.add(15);
        l1.add(24);
        l1.add(12);
        l1.add(38);
        l1.add(3, 42);

        String actual = l1.toString();
        assertEquals("[15,24,12,42,38]", actual);

        assertEquals(12, l1.get(2));
    }
}
