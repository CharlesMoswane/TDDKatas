package com.umuzi;

import org.testng.Assert;
import org.testng.annotations.Test;

public class StringCalculatorTest{

    @Test(expectedExceptions = RuntimeException.class)
    public final void whenMoreThan2NumbersAreUsedThenExceptionIsThrown(){
        StringCalculator.add("1,2,3");
    }

    @Test
    public final void when2NumbersAreUsedThenNoExceptionIsThrown() {
        StringCalculator.add("1,2");
        Assert.assertTrue(true);
    }

    @Test(expectedExceptions = RuntimeException.class)
    public final void whenNonNumberIsUsedThenExceptionIsThrown() {
        StringCalculator.add("1,X");
    }

    @Test
    public final void whenEmptyStringIsUsedThenReturnValueIs0(){
        Assert.assertEquals(0,StringCalculator.add(""));
    }

    @Test
    public final void whenOneNumberIsUsedThenReturnValueIsThatSameNumber(){
        Assert.assertEquals(3,StringCalculator.add("3"));
    }

    @Test
    public final void whenTwoNumbersAreUsedThenReturnValueIsTheirSum(){
        Assert.assertEquals(3+6,StringCalculator.add("3,6"));
    }

}


