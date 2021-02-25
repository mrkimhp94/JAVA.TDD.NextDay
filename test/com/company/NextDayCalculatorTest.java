package com.company;

import org.junit.jupiter.api.Test;

import java.util.Calendar;

import static org.junit.jupiter.api.Assertions.*;

class NextDayCalculatorTest {
    @Test
    void NextDayCalculatorTest1(){
int day =1;
int month = 2;
int year = 2008;
String expected = "02/02/2008";
String result = NextDayCalculator.add(day,month,year);
assertEquals(expected,result);
    }
    @Test
    void NextDayCalculatorTest2(){
        int day =28;
        int month = 2;
        int year = 2008;
        String expected = "29/02/2008";
        String result = NextDayCalculator.add(day,month,year);
        assertEquals(expected,result);
    }

}