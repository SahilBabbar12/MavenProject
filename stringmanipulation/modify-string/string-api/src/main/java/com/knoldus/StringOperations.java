package com.knoldus;

public class StringOperations {
    // function to return the reversedString of a given string
    String reverseString(String originalstring){
        String reversedString="";
        for(int index=originalstring.length()-1;index>=0;index--)
        {
            reversedString+=originalstring.charAt(index);
        }
        return reversedString;
    }
    // function to return the Length of a given string
    int calculateLength(String originalString){
        int count =0;
        for (int index=0;index<originalString.length();index++)
        {
            count++;
        }
        return  count;
    }
}