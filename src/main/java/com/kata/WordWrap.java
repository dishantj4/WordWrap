package com.kata;


public class WordWrap
{

    public static void main(String[] args) {
        System.out.println(new WordWrap().wrap("hello how are you", 11));
    }


    public String wrap(String phrase, int wrapWidth) {
        StringBuilder wrappedPhrase = new StringBuilder();
        wrappedPhrase.append(phrase);
        if (phrase.length() > wrapWidth) {
            String insertNewLine = "\n";
            wrappedPhrase.insert(wrapWidth - 1, insertNewLine);
        }
        return wrappedPhrase.toString();
    }



}
