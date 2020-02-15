package com.kata;


public class WordWrap
{

    public static void main(String[] args) {
        System.out.println(new WordWrap().wrap("shakespeare", 9));
    }


    public String wrap(String phrase, int wrapWidth) {
        StringBuilder wrappedPhrase = new StringBuilder();
        wrappedPhrase.append(phrase);
        char insertNewLine = '\n';
        String space = " ";
        int indexValueWhenNoSpaceInPhrase = -1;
        if (phrase.length() > wrapWidth) {
            int indexOfLastSpaceInLineToWrap = phrase.lastIndexOf(space,wrapWidth);
            if (indexOfLastSpaceInLineToWrap == indexValueWhenNoSpaceInPhrase)
                wrappedPhrase.insert(wrapWidth, insertNewLine);
            else
            wrappedPhrase.setCharAt(indexOfLastSpaceInLineToWrap, insertNewLine);
        }
        return wrappedPhrase.toString();
    }



}
