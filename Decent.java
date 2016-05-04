import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        System.out.println("T: "+t);
        for(int i = 0; i < t;i++){ //loop through T, # test cases
          // int p = in.nextInt();
          // System.out.println(p+": "+decent(p));
          System.out.println(decent(in.nextInt()));
        }
    }
    public static int decent(int n){

      if(n<3||n==4){
        return -1;
      }
      if(n==3){
      return 555;
      }
      if(n==5){
        return 33333;
      }
      else{
        int x = decent(n-3);
        System.out.println("x: "+String.valueOf(x));
        int y = decent(n-5);
        System.out.println("y: "+String.valueOf(y));
        if(x!= -1){
          x = Integer.parseInt("555"+String.valueOf(x));
        }
        if(y!=-1){
          y = Integer.parseInt("33333"+String.valueOf(y));
          System.out.println("y: "+y);
        }
        System.out.println("max: "+ Math.max(x,y));
        return Math.max(x,y);
      }
    }
}
