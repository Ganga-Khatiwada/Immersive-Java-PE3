package com.stackroute.pe3;

public class FirstThree
{
    // finding even and odd
    public String[] evenOdd(int a[])
    {
        String[] result = new String[a.length];
        for (int i = 0; i < a.length; i++)
        {
            if (a[i] % 2 == 0)
            {
                result[i] = "even";
            }
            else
            {
                result[i] = "odd";
            }
        }
        return result;
    }  // end of finding even and odd


    //removing prime numbers
    public int [] removePrime(int arr[])
    {
        int i = 0;
        int j = 0;
        int k = 0;
        int countc = 0;
        int countp = 0;

        for(i = 0; i < arr.length; i++)
        {
            if(isPrime(arr[i]))
                countp++;
            else
                countc++;
        }
        int prim[] = new int[countp];
        int com[] = new int[countc];
        for(i = 0; i < arr.length; i++)
        {
            if(isPrime(arr[i]))
                prim[j++] = arr[i];
            else
                com[k++] = arr[i];
        }

        int result[] = new int[com.length];
        int m=0;

        for(i = 0; i < com.length; i++)
        {

            result[m]+=com[i];
            m++;
        }
        return result;
    }
    public static boolean isPrime(int n)
    {
        int f = 0;
        for(int i = 1; i <= n; i++)
            if(n % i == 0)
                f++;
        if(f == 2)
            return true;
        return false;
    }  // end of removing prime numbers


    //reversing the array elements
    public int[] reverseArray(int a[])

    {
        int b[]=new int[a.length];
        int j=0;
        for (int i=(a.length)-1; i>=0; i--)
        {
            b[j]+=a[i];
            j++;
        }
        return b;
    }   // end of reversing the array elements
}