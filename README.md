![alt_text](https://github.com/pippom/ComputerScience/blob/master/ComputerScience.jpg)

# About this repository
The intent of this repository is to store some algorithms I used in labs and assignments from my Computer Science degree. The repository currently covers:

- Data Structures and Algorithm Analysis
    - Time complexity of algorithms
    - Big-O notation
    - Recursive functions

## Lab: Find the largest element in an unsorted array of integers:
    public class FindLargestInUnsortedArray
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

A faster, cleaner way using new stream API:
    
    public class FindLargestInUnsortedArray
    {
        public static void main(String[] args)
        {
             int[] array = {3, 4, 7, 1};
             int max = java.util.Arrays.stream(array).max().getAsInt();
             System.out.println("Largest number: " + max);
        }
    }
