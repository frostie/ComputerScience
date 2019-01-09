package com.PhilMarcoccia;

public class FindLargest
{
    public static void main(String[] args)
    {
        int[] arr = new int[]{45, 56, 77, 24, 12, 98};
        int max = arr[0];
        for(int i = 1; i < arr.length; i++)
        {
            if(arr[i] > max)
            {
                max = arr[i];
            }
        }
        System.out.println("Largest number: " + max);
    }
}
