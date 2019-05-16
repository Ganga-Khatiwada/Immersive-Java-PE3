package com.stackroute.pe3;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SecondArray {


    //comparing string array
       public String Elements(String array1[],String array2[])
       {
           String  result="";
            boolean flag=true;
           for (int i=0;i<array1.length;i++ ){
               flag=array1[i].equals(array2[i]);

               if(flag==false) {
                   result = "The array elements in both the arrays are not equal";
                   break;
               }
           }
            if (flag==true)
                result="The array elements in both the arrays are equal";

           return result;
       } //end of comparing string array


    //Loop through each array, to remove any duplicate elements.
        public String[] removeDuplicateElements(String[] str)
         {
            String[] result = new String[str.length-1];
            int i, j, count=0;
            for(i=0; i<str.length; i++)
            {
                for(j=0; j<count; j++)
                {
                    if(str[i]==result[j])
                    {
                        break;
                    }

                }
                if(j==count)
                {
                    result[count] = str[i];
                    count++;
                }
            }
            return result;
         }//End of removeDuplicateElements


        //Append first element of array1 to array2
        public String[] Append(String s1[], String s2[])
        {
            String[] result=new String[s2.length+1];
            result[0]=s1[0];
            int j=0;
            for(int i=1;i<result.length;i++)
            {
                result[i]=s2[j];
                j++;
            }

            return result;
        }    //end of append


        //PrependMidElement
         public String[] PrependMidElement(String[] s1, String[] s2)
         {
            String[] result= new String[s1.length+1];
            int pos = s2.length/2,j=0;

            result[0] = s2[pos];

            for (int i=1; i<result.length; i++)
            {
                result[i]=s1[j];
                j=j+1;

            }
            return result;
         }//End of PrependMidElement

    } //end of class
