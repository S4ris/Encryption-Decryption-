package com.company;

public class Encryption {

    public void encryption(String text, int key){

        Alogorithm alg = new Alogorithm();

        String newText = "";
        char[] chars = text.toCharArray();

        int newKey = alg.seed(key);

        for(char c : chars){
            c += newKey;
            newText += c;
        }

        System.out.println(newText);
    }

}
