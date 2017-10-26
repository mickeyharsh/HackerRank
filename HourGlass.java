import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        int ar[] = new int [16];
        int n=0;
        for(int arr_i=0; arr_i < 6; arr_i++){
            for(int arr_j=0; arr_j < 6; arr_j++){
                arr[arr_i][arr_j] = in.nextInt();
            }
        }
        for(int i=0;i<=3;i++)
        {
            for(int j=0;j<=3;j++)
            {
                    ar[n]=arr[i][j]+arr[i][j+1]+arr[i][j+2]+arr[i+1][j+1]+arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];
                    if(n<15)
		    n=n+1;
            }
        }
        int largest=ar[0];
        for(int i=0;i<=15;i++)
        {
            if(largest<ar[i])
            largest=ar[i];
        }
        System.out.println("Largest sum:"+largest);
        System.out.println("Hour Glass:");

        int k=(n-1)/4;

        int l=(n-1)%4;

        System.out.print(arr[k][l]);

        System.out.print(" ");

        System.out.print(arr[k][l+1]);

        System.out.print(" ");

        System.out.println(arr[k][l+2]);

        System.out.print("  ");

        System.out.print(arr[k+1][l+1]);

        System.out.println(" ");

        System.out.print(arr[k+2][l]);

        System.out.print(" ");

        System.out.print(arr[k+2][l+1]);

        System.out.print(" ");

        System.out.print(arr[k+2][l+2]); 
    }
}

