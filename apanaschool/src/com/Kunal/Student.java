package com.Kunal;

import java.util.*;

public class Student {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner Sc=new Scanner(System.in);
        int count=0;
        int[] arr=new int[4];

        for (int i = 0; i <= 4; i++) {
            arr[i]=Sc.nextInt();
            if(arr[i]>=10){
                count+=1;
            }
        }
        System.out.println(count);







        }
    }


