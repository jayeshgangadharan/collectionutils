package com.github.util;


import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertTrue;

/**
 * Created with IntelliJ IDEA.
 * User: Jayesh Gangadharan
 * Date: 10/2/14
 * Time: 11:02 AM
 */
public class CollectionUtilTest {

    private CollectionUtil collectionUtil;

    @Before
    public void setup() {
        collectionUtil = new CollectionUtil();
    }

    @Test
    public void testRemoveDuplicates() {
        List<String> stringList = new ArrayList<>();
        stringList.add("Hello Jayesh");
        stringList.add("Welcome");
        stringList.add("To");
        stringList.add("GitHub");
        stringList.add("GitHub");
        assertTrue(stringList.size() == 5);
        stringList = collectionUtil.removeDuplicates(stringList);
        assertTrue("something bad happened, not good", stringList.size() == 4);
    }

    @Test
    public void testRemoveDuplicatesRaceConditions() {
        List<String> stringList = new ArrayList<>();
        assertTrue(stringList.size() == 0);
        stringList = collectionUtil.removeDuplicates(stringList);
        assertTrue(stringList.size() == 0);

        collectionUtil.removeDuplicates(null);
    }

}
