package com.kata;


public class WordWrap {


    public String wrap(String phrase, int wrapWidth) {
        StringBuilder wrappedPhrase = new StringBuilder();
        wrappedPhrase.append(phrase);
        char insertNewLine = '\n';
        String space = " ";
        int pointerInPhrase = 0;
        int indexValueWhenNoSpaceInPhrase = pointerInPhrase - 1;
        while (pointerInPhrase + wrapWidth < phrase.length()) {
            int indexOfLastSpaceInLineToWrap = phrase.lastIndexOf(space, pointerInPhrase + wrapWidth);

            if (indexOfLastSpaceInLineToWrap == indexValueWhenNoSpaceInPhrase) {
                wrappedPhrase.insert(wrapWidth, insertNewLine);
                pointerInPhrase = pointerInPhrase + wrapWidth;
                indexValueWhenNoSpaceInPhrase++;
            } else {
                wrappedPhrase.setCharAt(indexOfLastSpaceInLineToWrap, insertNewLine);
                pointerInPhrase = indexOfLastSpaceInLineToWrap + 1;


            }


        }
        return wrappedPhrase.toString();
    }


}
