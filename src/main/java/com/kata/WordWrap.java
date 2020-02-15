package com.kata;


public class WordWrap
{

    public static void main(String[] args) {
        System.out.println(new WordWrap().wrap("hello how are you", 11));
    }


    public String wrap(String phrase, int wrapWidth) {
        StringBuilder wrappedPhrase = new StringBuilder();
        wrappedPhrase.append(phrase);
        char insertNewLine = '\n';
        String space = " ";
        if (phrase.length() > wrapWidth) {
            int indexOfLastSpaceInLineToWrap = phrase.lastIndexOf(space,wrapWidth);
            wrappedPhrase.setCharAt(indexOfLastSpaceInLineToWrap, insertNewLine);
        }
        return wrappedPhrase.toString();
    }



}
