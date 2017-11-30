package com.example.javajokes;

import java.util.Random;

public class Jokes {

    /**
     * Generates random joke from 4 parts
     * @return
     */
    public static String getJoke() {
        Random random = new Random();
        String result = "";
        result += PART1[random.nextInt(PART1.length)];
        result += PART2[random.nextInt(PART2.length)];
        result += PART3[random.nextInt(PART3.length)];
        result += PART4[random.nextInt(PART4.length)];
        return result;
    }


    private static final String[] PART1 = {
            "When I was 5 I thought that ",
            "Unfortunately ",
            "Good news! "
    };

    private static final String[] PART2 = {
            "pigs can fly on Fridays. ",
            "sandwich is made from bread. ",
            "this is totally a funny joke. "
    };

    private static final String[] PART3 = {
            "And this is great, because ",
            "I cannot believe it, ",
            "Therefore "
    };

    private static final String[] PART4 = {
            "I was dreaming about it five years! ",
            "...never mind...",
            "I am old.",
            "you will not live forever."
    };
}
