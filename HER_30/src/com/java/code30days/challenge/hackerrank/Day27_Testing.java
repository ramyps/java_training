/**
 * 
 */
package com.java.code30days.challenge.hackerrank;

/**
 * @author Ramy
 *
 */

import java.util.*;

public class Day27_Testing {

    public static int minimum_index(int[] seq) {
        if (seq.length == 0) {
            throw new IllegalArgumentException("Cannot get the minimum value index from an empty sequence");
        }
        int min_idx = 0;
        for (int i = 1; i < seq.length; ++i) {
            if (seq[i] < seq[min_idx]) {
                min_idx = i;
            }
        }
        return min_idx;
    }

    static class TestDataEmptyArray {
        public static int[] get_array() {
        	
        	
			return null;
            // complete this function
        }
    }

    static class TestDataUniqueValues {
        public static int[] get_array() {
        	
        	
			return null;
            // complete this function
        }

        public static int get_expected_result() {
        	
        	
			return 0;
            // complete this function
        }
    }

    static class TestDataExactlyTwoDifferentMinimums {
        public static int[] get_array() {
			return null;
            // complete this function
        }

        public static int get_expected_result() {
			return 0;
            // complete this function
        }
    }
}
    