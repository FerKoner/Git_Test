package Fer.company;

import java.util.ArrayList;

public class StringPractice {
    public static String getLongestString(ArrayList<String> stringsArray){

        String longest = "";
        for(String word : stringsArray){
            if(word.length() > longest.length())
                longest = word;
        }
        return longest;
    }
}
