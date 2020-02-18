package com.kata;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import com.kata.WordWrap;
import org.junit.Test;


public class WordWrapTest {


    @Test
    public void shouldReturnPhraseInNewLineWhenPhraseExceedsMaxLength() {
        assertEquals(new WordWrap().wrap("hello how are you", 11), "hello how\nare you");
    }


    @Test
    public void shouldReturnPhraseInOneLineWhenPhraseIsLessThanMaxLength() {
        assertEquals(new WordWrap().wrap("how are you", 11), "how are you");

    }

    @Test
    public void shouldReturnWrappedPhraseEvenWhenThereIsNoSpace() {
        assertEquals(new WordWrap().wrap("Shakespeare", 9), "Shakespea\nre");
    }

    @Test
    public void shouldReturnWrappedPhraseForEveryLineInPhrase() {
        assertEquals(new WordWrap().wrap("hi hello how are you, I am good thank you", 9), "hi hello\nhow are\nyou, I am\ngood\nthank you");
    }
}
