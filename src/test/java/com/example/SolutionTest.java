package com.example;

import org.example.Solution;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SolutionTest {

    static Solution solution;

    String s;

    @BeforeAll
    static void setup(){

        solution = new Solution();
    }

    @Test
    public void StringWithOnlyTwoVowels(){

        s = "ae";

        assertTrue(solution.halvesAreAlike(s));
    }

    @Test
    public void StringWithOnlyOneVowelAtTheFirstHalf(){

        s = "aprc";

        assertFalse(solution.halvesAreAlike(s));
    }

    @Test
    public void StringWithThreeVowelsTheFirstHalfAndThreeAtTheSecond(){

        s = "pgfijaepkuliom";

        assertTrue(solution.halvesAreAlike(s));
    }
}
