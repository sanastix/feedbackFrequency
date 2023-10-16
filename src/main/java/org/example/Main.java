package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        Map<String, Integer> wordCount = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String word = scanner.next();
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        String mostFrequentWord = "";
        int maxCount = 0;
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            String word = entry.getKey();
            int count = entry.getValue();
            if (count > maxCount || (count == maxCount && word.compareTo(mostFrequentWord) > 0)) {
                mostFrequentWord = word;
                maxCount = count;
            }
        }

        System.out.println(mostFrequentWord + " " + maxCount);

    }
}