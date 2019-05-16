package com.stackroute.pe3;

public class StudentMarks {

    public String Students(int numOfStudents,int stuGrades[]){

        String result="";
        for (int i = 0; i<numOfStudents; i++) {

            if (stuGrades[i] > 0 && stuGrades[i] < 100)
                result = "True";

            else if (stuGrades[i] > 100)
                result = "Error:Input Should be less than 100";

            else if(stuGrades[i]<0)
                result = "Error:Input should be greater than 0";
            if(result=="Error:Input Should be less than 100" || result=="Error:Input should be greater than 0")
                break;
        }
        return result;

    }
}