package org.example;

public class Solution {
    public Solution(){

    }

    public boolean halvesAreAlike(String s) {

        String firstHalf = s.substring(0, (s.length() - 1) / 2 + 1).toLowerCase();
        String secondHalf = s.substring((s.length() -1) / 2 + 1).toLowerCase();

        int counterFirstHalf = 0;
        int counterSecondHalf = 0;

        counterFirstHalf = getCounterFirstHalf(firstHalf, counterFirstHalf);

        counterSecondHalf = getCounterFirstHalf(secondHalf, counterSecondHalf);

        return counterFirstHalf == counterSecondHalf;
    }

    private int getCounterFirstHalf(String word, int counter) {

        for (int i = 0; i< word.length(); i++){

            if (word.charAt(i)=='a' || word.charAt(i)=='e' || word.charAt(i)=='i' || word.charAt(i)=='o' || word.charAt(i)=='u'){

                counter ++;
            }
        }
        return counter;
    }
}