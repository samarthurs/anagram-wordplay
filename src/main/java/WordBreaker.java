package com.bestsecret;

import java.util.*;

public class WordBreaker {
    // set to hold dictionary values
    private static Set<String> dictionary = new HashSet<>();

    public static void main(String[] args) {

        // array of strings to be added in dictionary set.
        String[] tempDictionary = {"best", "secret", "i", "asch", "heim", "crowd", "it", "him",
                "beet", "bets", "writ", "better", "sec", "like"};

        dictionary.addAll(Arrays.asList(tempDictionary));

        // sample input cases
        System.out.println(wordBreak("ilikebestsecret"));
        System.out.println(wordBreak("bestsecret"));
        System.out.println(wordBreak(""));
        System.out.println(wordBreak("ilikeaschheim"));
        System.out.println(wordBreak("cod writ"));
        System.out.println(wordBreak("better secret"));

    }

    // returns true if the word can be segmented into parts such
    // that each part is contained in dictionary
    public static boolean wordBreak(String word) {
        int size = word.length();

        // base case
        if (size == 0)
            return true;

        //else check for all words
        for (int i = 1; i <= size; i++) {
            // eg. ilikebestsecret in 1st iteration it is split into : i & likebestsecret because i is present in dictionary
            // for likebestsecret, l is not present(no recursion proceed with for loop), li is not present(no recursion proceed with for loop), lik is not present, like is present
            // likebestsecret is split into like & bestsecret
            // for bestsecret, b is not present(no recursion proceed with for loop), be is not present(no recursion proceed with for loop), bes is not present, best is present
            // best is present, so split bestsecret into best & secret
            // for secret, s absent, se absent, sec absent, secr absent, secre absent, and secret present
            // So, there were recursion calls twice. ilikebestsecret --> i & bestsecret, later bestsecret to best & secret
            // i like best secret ---  all are present in the dictionary
            if (dictionary.contains(word.substring(0, i)) &&
                    wordBreak(word.substring(i, size)))
                return true;
        }

        // if all cases failed then return false
        return false;
    }
}
