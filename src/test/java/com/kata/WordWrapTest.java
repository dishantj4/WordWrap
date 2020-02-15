package com.kata;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import com.kata.WordWrap;
import org.junit.Test;


public class WordWrapTest
{



    @Test
    public void shouldReturnPhraseInNewLineWhenPhraseExceedsMaxLength()
    {
        assertEquals(new WordWrap().wrap("hello how are you", 11), "hello how\nare you");
    }

}
