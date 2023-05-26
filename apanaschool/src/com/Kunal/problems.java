package com.Kunal;

import java.util.*;
import java.io.*;
public class problems {
//    public static boolean isprime(int m) {
//        if (m==2){
//            return true;
//        }
//        for (int i =2; i <= Math.sqrt(m); i++) {
//            if (m % i == 0) {
//           return false;
//            }
//        }
//        return true;
//    }
//    public static  void  primenumberinrange(int n){
//        for (int i = 2; i <n ; i++) {
//            if(isprime(i)){
//                System.out.println(i);
//            }
//        }
//        System.out.println(" ");
//
//    }
//    public static void main(String[] args) {
//        Scanner Sc=new Scanner(System.in);
//        int n=Sc.nextInt();
////        System.out.println(isprime(9));
//
//        primenumberinrange(n);

//
//    public static void main(String[] args) {
//        Scanner Sc=new Scanner(System.in);
//
//        int row=5;
//      int count=0;
//
//        for (int i = 1; i <=row ; i++) {
//            for (int j = 1; j <=i ; j++) {
//
////                System.out.print(count+ " ");
//               count=i+j;
//
//                if (count%2==0){
//                    System.out.print(1+" ");
//                }
//                else {
//                    System.out.print(0+" ");
//                }
//                count=0;
//
//
//
//            }
//            System.out.println(" ");

    //        }
//    }
//    public static void main(String[] args) {
//        int row = 5;
//        for (int i = 0; i <= row; i++) {
//            for (int j = 0; j <= i; j++) {
//                System.out.print("*" + " ");
//
//            }
//            for (int j = row - i; j > 0; j--) {
//                System.out.print(" " + " ");
//
//            }
//            for (int j = row - i; j > 0; j--) {
//                System.out.print(" " + " ");
//
//            }
//            for (int j = 0; j <= i; j++) {
//                System.out.print("*" + " ");
//
//            }
//                System.out.println("");
//            }
//        for (int i = 0; i <= row; i++) {
//            for (int j=row-i; j >0; j--) {
//                System.out.print("*" + " ");
//
//            }
//            for (int j = 0; j <=i; j++) {
//                System.out.print(" " + " ");
//
//            }
//            for (int j =0; j<=i; j++) {
//                System.out.print(" " + " ");
//
//            }
//            for (int j = row-i; j>0; j--) {
//                System.out.print("*" + " ");
//
//            }
//            System.out.println("");
//        }
//        }

    // program of linear search:

//   public static int getnumber(int number[], int key){
//
//      for (int i = 0; i < number.length; i++) {
//         if(number[i]==key){
//            return 1;
//         }
//
//
//      }
//      return -1;
//   }
//public static void main(String[] args) {
//
//      int number[]={2,4,7,3,8};
//      int key=5;
//
//   int index=getnumber(number,key);
//
//      if(index==1){
//         System.out.println("Number is Found");
//      }
//      else{
//         System.out.println("Number is Not Found");
//      }
//
//    }

    // binary searching in an array

//   public static int getnumber(int number[],int key){
//       int start=0;
//       int end=number.length-1;
//       while(start<=end){
//               int mid =(start+end)/2;
//               if (number[mid]==key){
//                   return mid;
//               }
//               if (key>number[mid]){
//                   start=mid+1;
//               }
//               else {
//                   end=mid-1;
//               }
//           }
//      return -1;
//   }
//   public static void main(String[] args) {
//      Scanner Sc= new Scanner(System.in);
//      int a[]={2,3,7,8,9};
//      int key=5;
//      int index=0;
//      System.out.println(getnumber(a,key));
//   }


//     reversing of an array

//    public static void reversed(int numbers[]) {
//        int start = 0, end = numbers.length - 1;
//        while (start < end) {
//
//            int temp = numbers[start];
//            numbers[start] = numbers[end];
//            numbers[end] = temp;
//
//            start++;
//            end--;
//        }
//    }public static boolean starecase(int[][] number,int key ){
//        int col=0;
//        int row=number.length-1;
//
//        while(row>=0 && col<number.length){
//          if(number[row][col]==key){
//              System.out.println("key is found  at "+"("+row+"," +col+")");
//              return true;
//          }
//          if(number[row][col]>key){
//              row--;
//
//          }
//            if(number[row][col]<key){
//                col++;
//
//            }
//        }
//        return false;
//
//    }
//    public static void sum(int nums[][]){
//        int sum=0;
//
//        for (int col = 0; col < nums.length ; col++) {
//            sum+=nums[1][col];
//        }
//
//        System.out.println(sum);
//    }


//        public static void main(String[] args) {
//            /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
//            Scanner sc=new Scanner(System.in);
//            int n=sc.nextInt();
//            int[] a=new int[10000];
//            for(int i=0;i<n;i++){
//                a[i]=sc.nextInt();
//            }
//            int c=0;
//            int s=0;
//            for(int i=0;i<n;i++){
//                s=a[i];
//                if(s<0){
//                    c++;
//                    System.out.println("s");
//                }
//                for(int j=i+1;j<n;j++){
//                    s+=a[j];
//                    if(s<0){
//                        c++;
//                        System.out.println("u");
//                    }
//                }
//            }
//            System.out.println(c);
////        }
//    public static boolean palindrom(String name){
//       int  Start=0;
//       int end=name.length()-1;
//       while(Start<=end){
//           if(name.charAt(Start)==name.charAt(end)){
//               Start++;
//               end++;
//           }
//           else {
//               return false;
//           }
//       }
//return true;
//    }
//
//
//    public static void main(){
//        String name="racecar";
//        if(palindrom(name)){
//            System.out.println("Name Is In Palindrom");
//        }
//        else {
//            System.out.println("name is not in PalindromS");
//        }
//   public static int fobi(int n){
//       if (n==0){
//           return n;
//
//       }
//       int sumnm1=fobi(n-1);
//
//       int sum=n+sumnm1;
//       return sum;
//   }
//
//    public static void main(String[] args) {
//        int n=3;
//        System.out.println(fobi(n));
//    }
public static int  fobi(int n){
    if(n==0 || n==1){

        return n;
    }
    int fib1=fobi(n-1);
    int fob2=fobi(n-2);
    int sum=fib1+fob2;
    return sum;

}

    public static void main(String[] args) {
        int n=26;
        System.out.println(fobi(n));
    }


   }





