package com.example.daniel.mycompsciworkspace;

import com.example.daniel.mycompsciworkspace.School.Games.GuessingGame;
import com.example.daniel.mycompsciworkspace.School.Situations.WordAndCharCount;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void Calc_Works() throws Exception{
        assertEquals(5,(WordAndCharCount.genCount("Hello My Name is Daniel!")));
    }


    @Test
    public void GuessTest() throws Exception{
        int ans = GuessingGame.runTest(0,1000,8);
        assertEquals(8 , ans);
    }
}