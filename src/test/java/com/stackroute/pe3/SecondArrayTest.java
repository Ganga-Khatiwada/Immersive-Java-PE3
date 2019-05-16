package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.lang.Object;

import static org.junit.Assert.*;

public class SecondArrayTest {

    SecondArray sa;

    @Before
    public void setup() {
        //arrenge
        sa = new SecondArray();
    }

    @After
    public void tearDown() {
        //arrenge
        sa = null;
    }

    @Test
    public void ElementsTest(){

     String array1[]=new String[] {"We","are","here","at","Stackroute"};
     String array2[]=new String[] {"We","are","here","at","Stackroute"};
     String expected="The array elements in both the arrays are equal";
     String actual=sa.Elements(array1,array2);
     assertEquals(expected,actual);

    }

    @Test
    public void ElementsTestFailure(){

        String array1[]=new String[] {"g","h","i","j","k"};
        String array2[]=new String[] {"g","i","k","m","o"};
        assertNotEquals("The array elements in both the arrays are equal",sa.Elements(array1,array2));

    }

    @Test
    public void removeDuplicate()
    {
        String[] array1 = { "a" , "b" , "a" , "d" , "e"};
        String[] array2 = { "f" , "g" , "h" , "g" , "j"};
        String[] actual1 = sa.removeDuplicateElements(array1);
        String[] expected1 = {"a" , "b" , "d" , "e"};
        assertArrayEquals(expected1, actual1);
        String[] actual2 = sa.removeDuplicateElements(array2);
        String[] expected2 = {"f" , "g" , "h" , "j"};
        assertArrayEquals(expected2, actual2);
    }

    @Test
    public void removeDuplicateFailure()
    {
        String[] array1 = { "a" , "b" , "a" , "d" , "e"};
        String[] array2 = { "f" , "g" , "h" , "g" , "j"};
        assertNotEquals("a, b, a, d, e", sa.removeDuplicateElements(array1));
        assertNotEquals("f, g, h, g, j", sa.removeDuplicateElements(array2));
    }

    @Test
    public void Append(){


        String array1[]=new String[] {"a","b","c","d","e"};
        String array2[]=new String[] {"f","g","h","i","j"};
        String expected[]={"a","f","g","h","i","j"};
        String actual[]=sa.Append(array1,array2);
        assertArrayEquals(expected,actual);

    }

    @Test
    public void AppendFailure(){
        String array1[]=new String[] {"a","b","c","d","e"};
        String array2[]=new String[] {"f","g","h","i","j"};
        assertNotEquals("c,f,g,h,i,j",sa.Append(array1,array2));
        assertNotNull("",sa.Append(array1,array2));
    }


    @Test
    public void PrependMid()
    {
        String[] array1 = { "a" , "b" , "c" , "d" , "e"};
        String[] array2 = { "f" , "g" , "h" , "i" , "j"};
        String[] actual = sa.PrependMidElement(array1, array2);
        String[] expected = { "h" , "a" , "b" , "c" , "d" , "e"};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void PrependMidElementFailure(){
        String array1[]=new String[] {"a","b","c","d","e"};
        String array2[]=new String[] {"f","g","h","i","j"};
        assertNotEquals("c,f,g,h,i,j",sa.PrependMidElement(array1,array2));
        assertNotNull("",sa.PrependMidElement(array1,array2));
    }
}
