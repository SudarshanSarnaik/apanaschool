package com.apanaschool;
import  java.util.*;
//
//
////==========================================================================
//import java.util.*;
////class Tester {
////
////
////    public static int is_palindrome(int n)
////    {
////        // Code here
////        String S=String.valueOf(n);
////        int start=0;
////        int end=S.length()-1;
////        while(start<=end){
////            if(S.charAt(start)==S.charAt(end)){
////                start++;
////                end--;
////            }
////            else{
////                return 0;
////            }
////        }
////        return 1;
////
////    }
////
////    public static void main(String[] args) {
////        // Implement your code here
////
////        // Scanner sc=new Scanner(System.in);
////        //	int n= sc.nextInt();
////        int n=1331;
////
////        if(is_palindrome(n)==1){
////            System.out.println(n+"is a palindrom");
////        }
////
////        if(is_palindrome(n)==0){
////            System.out.println(n+"is not a palindrom");
////        }
////    }
////}
//
//
//
//
public class Infytq {
//
//
//
////    public static void main(String[] args) {
////
////        Scanner sc=new Scanner(System.in);
////        int n= sc.nextInt();
////
////        System.out.println("Food Type=");
////       String food=sc.nextLine();
////        System.out.println("Quentity=");
////        int orderQuentity=sc.nextInt();
////        System.out.println( "distance=");
////        int distance=sc.nextInt();
////        int amount= 0;
////        if(food.equals("V")){
////            amount=amount+(orderQuentity*12);
////        }
////
////        if(food.equals("N")) {
////            amount=amount+(orderQuentity*15);
////
////        }
////        if(3<distance && distance<=6 ){
////            amount+=(distance-3);
////        }
////        if(distance>6){
////            amount+=3;
////            amount+=(distance-6)*2;
////
////        }
////        System.out.println("amount="+amount);
////    }
////
////
//
//
//    public static void main(String[] args) {
//
//    }
//
//
//
//
//
//
//
//
//    }
//
//  class A[A a=new A();]


//  public static void main(String[] args) {
//    int a=20,p=3;
//    for (int i = 0; i <=10; i+=2) {
//      p=p* i;
//      a-= p;
//      p/= 2;
//    }
//    System.out.println(a);
//    System.out.println("sjgf");
//    }
//
//

//  public static void main(String[] args) {
//    int x=10,y=3;
//    while (x>0){
//      y+=2;
//      y-=x%10;
//      x/=10;
//
//    }
//    System.out.println(y);
//  }


//  public static void main(String[] args) {
////
//    try {
//
//        System.out.println("Hello"+" "+1/0);
//
//
//    }
//    finally {
//      System.out.println("world");
//
//
//    }
//  }
  public static int waterStore(int arr[],int n) {
    int trapWater=0;

    //calculate left max

    int leftMax[]=new int[n];
    leftMax[0]=arr[0];
    for (int i = 1; i < n; i++) {
      leftMax[i]=Math.max(arr[i],leftMax[i-1]);
    }

    //calculate rightMax
    int rightMax[]=new int[n];
    rightMax[n-1]=arr[n-1];
    for (int i = n-2; i >=0; i--) {
      rightMax[i]=Math.max(arr[i],rightMax[i+1]);
    }

    for (int i = 0; i <n ; i++) {
      int waterlevel=Math.min(leftMax[i],rightMax[i]);
      trapWater+=waterlevel-arr[i];

    }

    return trapWater;
  }
public static int bAs(int price[]){
    int n= price.length;
    int buyPrice=Integer.MAX_VALUE;
    int maxProfit=0;
    for (int i = 0; i <n ; i++) {
      if(buyPrice<price[i]){
        int profit =price[i]-buyPrice;
        maxProfit=Math.max(profit,maxProfit);
      }
      else {
        buyPrice=price[i];
      }

  }
    return  maxProfit;
}


  public static void stockBuySell(int[] price, int n) {
    int low=0;
    int high=low;
    int flag=0;

    while(high < n-1){
      //profits, move ahead
      while((high < n-1) && (price[high+1] > price[high])){
        high++;
      }

      //save
      if(low!=high){
        flag=1;
        System.out.print("("+low+" "+high+") ");
      }

      //reset pointers
      low=high+1;
      high=low;
    }

    if(flag==0){
      System.out.print("No Profit");
    }
    System.out.println();

  }
  public static void removeDuplicate(int[] arr , int n){
    Arrays.sort(arr);

  ArrayList<Integer> arrL=new ArrayList<>();
    arrL.add(arr[0]);
    int count=1;
    for (int i = 1; i <n ; i++) {
      if(arrL.get(count)!=arr[i]){
        arrL.add(arr[i]);
        count++;
      }
      else {
        continue;
      }
    }

    System.out.println(arrL);
  }
  public static  String firstRepChar(String s)
  {
    // code here
    char[] str=new char[s.length()];

    for(int i=0; i<s.length();i++ ){
      str[i]=s.charAt(i);
    }
    Arrays.sort(str);
    for(int i=0; i<str.length;i++ ){
      if( str[i]==str[i+1]){

  return new String(String.valueOf(str[i]));

      }
    }
    return "-1";
  }


  public static String countSourting(String str){
   char[] strA=str.toCharArray();
   Arrays.sort(strA);
   String  newString=new String((strA));
   return newString;
  }
  public  static void zizZag(int arr[]) {
    boolean operator = true;
    for (int i = 0; i < arr.length - 1; i++) {
      if (operator) {
        if (arr[i] > arr[i + 1]) {
          int temp = arr[i + 1];
          arr[i + 1] = arr[i];
          arr[i] = temp;
        }

      } else {
        if (arr[i] < arr[i + 1]) {
          int temp = arr[i + 1];
          arr[i + 1] = arr[i];
          arr[i] = temp;

        }
        operator = !operator;
        System.out.println(operator);
      }
    }
  }

//public static void main(String[] args) {
//
//
// int arr[] =  {4, 3, 7, 8, 6, 2, 1};
// //zizZag(arr);
//  boolean operator = true;
//  for (int i = 0; i < arr.length - 1; i++) {
//    if (operator) {
//      if (arr[i] > arr[i + 1]) {
//        int temp = arr[i + 1];
//        arr[i + 1] = arr[i];
//        arr[i] = temp;
//      }
//
//    } else {
//      if (arr[i] < arr[i + 1]) {
//        int temp = arr[i + 1];
//        arr[i + 1] = arr[i];
//        arr[i] = temp;
//
//      }
//
//    }
//    operator = !operator;
//
//  }
//  for (int i = 0; i < arr.length; i++) {
//    System.out.print(arr[i]);
//  }
//  System.out.println();
////  //System.out.println(bAs(arr));
////  int n = arr.length;
//////  System.out.println(waterStore(arr,n));
////
////// stockBuySell(arr,n);
//////}
////removeDuplicate(arr,n);
//  ArrayList<Integer> ll=new ArrayList<>();
//
//
//
//}


  public static void main(String[] args) {
    int arr[] = {1, 2, 3, 4, 5, 6, 7};
    int shift=3;

    for (int i = 0; i < arr.length-1; i++) {
      int opt=i+shift;
      if(opt> arr.length-1){
        int temp=arr[i];
        arr[i]=arr[i+1];
        arr[i+1]=temp;
      }
      else {
        int temp=arr[i];
        arr[i]=arr[opt];
        arr[opt]=temp;
      }


    }

    for (int i = 0; i < arr.length ; i++) {
      System.out.print(arr[i]+",");

    }
  }


  }



