![alt_text](https://github.com/pippom/ComputerScience/blob/master/ComputerScience.jpg)

# ComputerScience
A repository for some algorithms from my Computer Science degree

## Currently Covers:
- Data Structures and Algorithm Analysis

### Algorithm: find the largest element in an unsorted array of integers:
    package com.PhilMarcoccia;

    public class Main
    {
        public static void main(String[] args)
        {
            int[] arr = new int[]{45, 56, 77, 24, 12, 98}; // O(1)
            int max = arr[0]; // O(1)
            for(int i = 1; i < arr.length; i++) // O(n)
            {
                if(arr[i] > max) // O(n)
                {
                    max = arr[i]; // O(1)
                }
            }
            System.out.println("Largest number: " + max); // O(1)
        }
    }
