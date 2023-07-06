package com.example.javafxproject;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class ProjectFileReader {
    int testint = 5;

    /**
     * @return
     * @throws IOException
     * this function will sort through a text document with exceptions to try to rule out HTML markup
     * and return a count of the top 20 most used words and how often they come up.
     */
    public String wordCounter() throws IOException {


        String newString = "";
        String wholeString = "";


        BufferedReader bufferedReader = new BufferedReader(new FileReader(WordCountController.textboxText));
        Map<String, Integer> wordCounts = new HashMap<>();

        String line;

        int t = 0;
        while ((line = bufferedReader.readLine()) != null) {

            String[] words = line.split("[\\s.;,?:!()\"]+");
            if(t > 97 && t < 277){
                for (String word : words) {
                    word = word.trim();
                    if (word.length() > 0) {
                        if (wordCounts.containsKey(word)) {
                            wordCounts.put(word, wordCounts.get(word) + 1);
                        } else {
                            wordCounts.put(word, 1);
                        }
                    }
                }

            }

            t++;
        }

        Map<String, Integer> sortedWordCounts = wordCounts.entrySet().stream()
                .sorted(Collections.reverseOrder(Entry.comparingByValue()))
                .collect(Collectors.toMap(Entry::getKey, Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));


        int top20 = 0;
        for (Map.Entry<String, Integer> entry : sortedWordCounts.entrySet()) {

            //removing this "if" statment will allow for all words to be counted
            if (top20 >= 20){
                continue;
            }else{
                if(!entry.getKey().equals("style=") && !entry.getKey().equals("<div") && !entry.getKey().equals("1em")
                        && !entry.getKey().equals(">") && !entry.getKey().equals("</div>") && !entry.getKey().equals("<br>")
                        && !entry.getKey().equals("0") && !entry.getKey().equals("1") && !entry.getKey().equals("</p>")
                        && !entry.getKey().equals("margin-left") && !entry.getKey().equals("20%") && !entry.getKey().equals("<span")
                        && !entry.getKey().equals("<p>") && !entry.getKey().contains("</span>") && entry.getKey().length() > 1
                        && !entry.getKey().contains("<br>")){
                    top20++;
                    System.out.printf(top20 + " " + "%-20s%10s\n", entry.getKey(), entry.getValue());
                    newString = "\n" + top20 + " \"" + entry.getKey() + "\" is repeated " + entry.getValue() + " Times";
                    wholeString =   wholeString + newString;
                }


            }

        }

        bufferedReader.close();
        return wholeString;
    }

}
