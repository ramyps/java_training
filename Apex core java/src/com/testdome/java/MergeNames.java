/**
 * 
 */
package com.testdome.java;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @author Ramy
 *
 */

public class MergeNames {
    
    public static String[] uniqueNames(String[] names1, String[] names2) {

    String[] newnames = null;
    
    Set<String> hash_Set = new HashSet<String>(); 
    for(String e:names1) {
    hash_Set.add(e);
    }
    for(String e:names2) {
        hash_Set.add(e);
     }
    newnames = (String[]) hash_Set.toArray();
    
    return newnames;
    }
    
    public static void main(String[] args) {
        String[] names1 = new String[] {"Ava", "Emma", "Olivia"};
        String[] names2 = new String[] {"Olivia", "Sophia", "Emma"};
        System.out.println(String.join(", ", MergeNames.uniqueNames(names1, names2))); // should print Ava, Emma, Olivia, Sophia
    }
}