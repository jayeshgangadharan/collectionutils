package com.github.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Frequently used utility method for Arrays and ArrayList
 * @author Jayesh Gangadharan
 */
public class CollectionUtil {

    private static final Logger logger = LoggerFactory.getLogger(CollectionUtil.class);

    /**
     * Removes the duplicate from the list
     * Please make sure you have equals() overridden
     * Please note: Order is not guaranteed and so this will be faster
     * @param listWithDuplicates
     * @param <T>
     * @return
     */
    public <T> List<T> removeDuplicates(final List<T> listWithDuplicates) {
        if(listWithDuplicates == null || listWithDuplicates.size() <= 0) {
            return listWithDuplicates;
        }
        Set<T> hashSet = new HashSet<T>(listWithDuplicates);
        return new ArrayList<T>(hashSet);
    }
}
