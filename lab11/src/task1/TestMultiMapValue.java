package task1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestMultiMapValue {
    private MultiMapValue<String, String> map;

    @BeforeEach
    public void setup() {
        map = new MultiMapValue<>();
    }

    @AfterEach
    public void clean() {
        map = null;
    }

    @Test
    public void testAddElementWithOneValue() {
        map.add("key", "value");
        Assertions.assertFalse(map.isEmpty());
        Assertions.assertEquals(1, map.size());
        Assertions.assertEquals(1, map.getValues("key").size());
    }

    @Test
    public void testAddElementWithMoreValues() {
        map.add("key", "value1");
        map.add("key", "value2");

        Assertions.assertFalse(map.isEmpty());
        Assertions.assertEquals(1, map.size());
        Assertions.assertEquals(2, map.getValues("key").size());
    }

    @Test
    public void testAddTwoElements() {
        // TODO
        map.add("key1", "value1");
        Assertions.assertEquals(1, map.size());
        map.add("key2", "value2");
        Assertions.assertEquals(2, map.size());
        map.add("key2","value22");
        Assertions.assertEquals(2, map.size());
    }

    @Test
    public void testGetFirst() {
        // TODO
        map.add("key1", "value1");
        map.add("key1", "value11");
        map.add("key1", "value111");
        Assertions.assertEquals("value1", map.getFirst("key1"));
        Assertions.assertEquals(null, map.getFirst("key"));
    }

    @Test
    public void testContainsKey() {
        // TODO
        map.add("key", "value1");
        map.add("key", "value2");
        Assertions.assertTrue(map.containsKey("key"));
        Assertions.assertFalse(map.containsKey("key1"));
    }

    @Test
    public void testSize() {
        // TODO
        map.add("key", "value1");
        map.add("key", "value2");
        Assertions.assertEquals(1, map.size());
        map.add("key1","value");
        Assertions.assertEquals(2, map.size());
    }

    @Test
    public void testRemoveKey() {
        // TODO
        map.add("key", "value1");
        map.add("key", "value2");
        Assertions.assertFalse(map.isEmpty());
        map.remove("key");
        Assertions.assertTrue(map.isEmpty());
    }

    @Test
    public void testAddAllWithList() {
        // TODO
        List<String> list = new ArrayList<>(Arrays.asList("value1", "value11", "value111"));
        map.addAll("key",list);
        Assertions.assertEquals(1, map.size());
    }

    @Test
    public void testAddAllWithMultiMapValue() {
        // TODO
    }
}