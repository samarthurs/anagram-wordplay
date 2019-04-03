package com.bestsecret;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AnagramWordPlay {

    public static void main(String[] args) throws IOException {

        Map<String, Boolean> twoTailAnagramMap = new HashMap<>();
        twoTailAnagramMap.put("aches him", false);
        twoTailAnagramMap.put("ash chime", false);
        twoTailAnagramMap.put("chase him", false);
        twoTailAnagramMap.put("chime has", false);
        twoTailAnagramMap.put("hash mice", false);
        twoTailAnagramMap.put("hic shame", false);
        twoTailAnagramMap.put("mice shah", false);

        long startTime = System.currentTimeMillis();

        List<String> lines = Files.readAllLines(Paths.get("src/main/resources/wordlist.txt"), StandardCharsets.UTF_8);
        twoTailAnagramMap.keySet().forEach(key -> {
            String[] twoTailAnagram = key.split(" ");
            String tail1 = twoTailAnagram[0];
            String tail2 = twoTailAnagram[1];

            // We could either use Binary search within the Collections framework. or Collections.contains() method
            // The given file wordlist.txt is sorted lexicographically and so BinarySearch can be effectively used on it
            if ((Collections.binarySearch(lines, tail1) > 0 && Collections.binarySearch(lines, tail2) > 0)) {
                //twoTailAnagramMap.put(key, true);
                System.out.println(key);
            }

            /*if (lines.contains(tail1) && lines.contains(tail2)) {
                System.out.println(key);
            }*/
        });

        /*twoTailAnagramMap.forEach((key, value) -> {
            if (value) System.out.println(key);
        });*/

        System.out.print("time took for the search ");
        System.out.format("%.3f", (System.currentTimeMillis() - startTime) / 1000.0f);
        //System.out.format("time took for the search %.3f " + TimeUnit.MILLISECONDS.toMillis(System.currentTimeMillis() - startTime) );


    }
}
