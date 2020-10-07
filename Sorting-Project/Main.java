import java.util.*;
public class Main
{
  //Array.sort method took 4 seconds. The selection sort method took 56 seconds. The insertion sort method took 21 seconds.
//The fastest method is the Array.sort.
  public static void main(String args[])
  {
    int[] arr = new int[10000];
     //sort(arr);
     //selection(arr);
     insertion(arr);
  }
  public static void sort(int[] arr)
  {
    System.out.println("This is the unsorted Array");
    for(int i = 0; i < 10000;i++)
    {
      arr[i] = (int)(Math.random() * ((10000) + 1));
    }
     for(int i : arr)
    {
      System.out.print(i + " ");
    }
     System.out.println();
     System.out.println();
     System.out.println();
     long time = System.currentTimeMillis(); 
     Arrays.sort(arr);
     time = System.currentTimeMillis() - time;
     System.out.println("This is the sorted Array");
      for(int i : arr)
    {
      System.out.print(i + " ");
    }
      System.out.print("The array.sort method took " + time + " seconds");
  }
  public static void selection(int[] arr)
  {
    System.out.println("This is the unsorted Array");
     for(int i = 0; i < 10000;i++)
    {
      arr[i] = (int)(Math.random() * ((10000) + 1));
    }
     for(int i : arr)
    {
      System.out.print(i + " ");
    }
     System.out.println();
     System.out.println();
     System.out.println();
     long time = System.currentTimeMillis(); 
    for (int i = 0; i < arr.length - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < arr.length; j++)
                if (arr[j] < arr[index]) 
                    index = j;
      
            int smallerNumber = arr[index];  
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }
   time = System.currentTimeMillis() - time;
   System.out.println("This is the sorted Array");
      for(int i : arr)
    {
      System.out.print(i + " ");
    }
      System.out.print("The selection sort method took " + time + " seconds");
  }
  
  public static void insertion(int[] arr)
  {
    System.out.println("This is the unsorted Array");
     for(int i = 0; i < 10000;i++)
    {
      arr[i] = (int)(Math.random() * ((10000) + 1));
    }
     for(int i : arr)
    {
      System.out.print(i + " ");
    }
     System.out.println();
     System.out.println();
     System.out.println();
     long time = System.currentTimeMillis(); 
    int n = arr.length; 
        for (int i = 1; i < n; ++i) { 
            int key = arr[i]; 
            int j = i - 1; 
            while (j >= 0 && arr[j] > key) { 
                arr[j + 1] = arr[j]; 
                j = j - 1; 
            } 
            arr[j + 1] = key; 
        } 
        time = System.currentTimeMillis() - time;
        System.out.println("This is the sorted Array");
      for(int i : arr)
    {
      System.out.print(i + " ");
    }
      System.out.print("The insertion sort method took " + time + " seconds");
}
}