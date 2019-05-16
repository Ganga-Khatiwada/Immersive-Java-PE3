package com.stackroute.pe3;

public class NumberSeries
{
    public String getConsecutiveNumbers(int[] series)
    {
        String result;
        int count1=0;
        for (int i=0; i< series.length-1; i++)
        {

            if (series[i+1] - series[i] == 1)
            {
                count1++;
            }
        }
        if (series[count1] == series[series.length-1])
            result = "consecutive";
        else
            result = "non consecutive";

        return result;
    }


    public String getConsecutiveNumbers2(int[] series)
    {
        String result;
        int count2 = series.length - 1;
        for (int i = series.length - 1; i > 0; i--)
        {
            if (series[i] - series[i - 1] == 1)
            {
                count2--;
            }

        }

        if (series[count2] == series[series.length-1])
            result = "consecutive";

        else
            result = "non consecutive";


        return result;
    }

}