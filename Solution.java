import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {



    public static void insertIntoSorted(int[] ar) {
        // Fill up this function
        int temp = ar[ar.length-1]; //save last element of array
        int indexOfValue=0;
        if(ar.length==1){ //if array is single element, print that element
          return ar;
        }
        for(int i = ar.length-1;i>0;i--){ //loop backwards through array
          if(temp<ar[i-1]){ //if array element at i smaller than that at i-1
            ar[i]=ar[i-1]; //move i-1 over
            if(i==1){ //if temp is smaller than the last index: insert as well
              ar[indexOfValue] = temp; //insert
            }
          }else{
            indexOfValue= i;
            break;
          }
        }
        ar[indexOfValue] = temp; //insert
        return ar;
    }


/* Tail starts here */
     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
         for(int i=0;i<s;i++){
            ar[i]=in.nextInt();
         }
         for(int i=1;i<s;i++){
           int[] sub = Arrays.copyOfRange(ar,0,i);
           sub = insertIntoSorted(sub);
           insertIntoSorted(ar);
         }
    }


    private static void printArray(int[] ar) {
      for(int n: ar){
         System.out.print(n+" ");
      }
        System.out.println("");
   }


}
