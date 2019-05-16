package com.stackroute.pe3;

import org.junit.*;

import static org.junit.Assert.*;

public class FirstThreeTest
{
    FirstThree ft;

    @Before
    public void setup() {
        //arrange
        ft = new FirstThree();
    }

    @After
    public void tearDown() {
        //arrange
        ft = null;
    }

    @Test
    public void evenOddTest() throws Exception {
        int[] arr = {4, 3, 7, 8};
        String[] result = ft.evenOdd(arr);
        String[] expected = {"even", "odd", "odd", "even"};
        assertArrayEquals(expected, result);
    }

    @Test
    public void evenOddTestFailure() throws Exception {
        int[] arr = {6, 1, 4, 9};
        assertNotEquals("1,4",ft.evenOdd(arr));
        assertNotNull("",ft.evenOdd(arr));
    }

    @Test
    public void removePrimeTest() throws Exception
    {
        int[] arr = {3, 12, 7, 1};
        int[] result = ft.removePrime(arr);
        int[] expected = {12, 1};
        assertArrayEquals(result, expected);
    }

    @Test
    public void removePrimeTestFailure() throws Exception
    {
        int[] arr = {5, 12, 8, 1};
        assertNotEquals("5,1",ft.removePrime(arr));
        assertNotNull("",ft.removePrime(arr));
    }

    @Test
    public void reverseArrayTest() throws Exception
    {

        int[] arr = {4, 3, 7, 8};
        int [] result = ft.reverseArray(arr);
        int [] expected = {8, 7, 3, 4};
        assertArrayEquals(expected, result);

    }

    @Test
    public void reverseArrayTestFailure() throws Exception
    {
        int[] arr = {5, 2, 9, 1};
        assertNotEquals("5,1,9,2",ft.reverseArray(arr));
        assertNotNull("",ft.reverseArray(arr));
    }

}