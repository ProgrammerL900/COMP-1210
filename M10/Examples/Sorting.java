//********************************************************************
//  Sorting.java       Author: Lewis/Loftus
//
//  Demonstrates the selection sort and insertion sort algorithms.
//********************************************************************

public class Sorting<T extends Comparable<T>>
{
//-----------------------------------------------------------------
//  Sorts the specified array of objects using the selection
//  sort algorithm.
//-----------------------------------------------------------------
   public void selectionSort(T[] list)
   {
      int min;
      T temp;
   
      for (int index = 0; index < list.length-1; index++)
      {
         min = index;
         for (int scan = index+1; scan < list.length; scan++)
            if (list[scan].compareTo(list[min]) < 0)
               min = scan;
      
      // Swap the values
         temp = list[min];
         list[min] = list[index];
         list[index] = temp;
      }
   }

//-----------------------------------------------------------------
//  Sorts the specified array of objects using the insertion
//  sort algorithm.
//-----------------------------------------------------------------
   public void insertionSort(T[] list)
   {
      for (int index = 1; index < list.length; index++)
      {
         T key = list[index];
         int position = index;
      
      //  Shift larger values to the right
         while (position > 0 && key.compareTo(list[position-1]) < 0)
         {
            list[position] = list[position-1];
            position--;
         }
         
         list[position] = key;
      }
   }
}
