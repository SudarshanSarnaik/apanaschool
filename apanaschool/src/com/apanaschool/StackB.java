package com.apanaschool;

import java.util.*;

//public class StackB {
//
//    static class  StackS {
//
////        static ArrayList<Integer> list = new ArrayList<>();
//
////        public static boolean isEmpty() {
////            return list.size() == 0;
////        }
////
////        public static void push(int data) {
////            list.add(data);
////
////        }
////
////        public static int pop() {
////            if(isEmpty()){
////                return -1;
////            }
////            int top = list.get(list.size() - 1);
////            list.remove(list.size() - 1);
////            return top;
////        }
////
////        public static int peek() {
////            if(isEmpty()){
////                return -1;
////            }
////            return list.get(list.size() - 1);
////        }
////    }
//
////        public static void main(String[] args) {
////            StackS s =new StackS();
////            s.push(1);
////            s.push(2);
////            s.push(3);
////
////            while (!s.isEmpty()){
////                System.out.println(s.peek());
////                s.pop();
////            }
// public  static  void pushAtBottm(Stack<Integer> s, int data){
//        if(s.isEmpty()){
//            s.push(data);
//            return;
//        }
//        int top=s.pop();
//        pushAtBottm(s,data);
//        s.push(top);
// }
//
////    public static void main(String[] args) {
////        Stack<Integer> s = new Stack<>();
////            s.push(1);
////            s.push(2);
////            s.push(3);
////pushAtBottm(s,4);
////            while (!s.isEmpty()){
////                System.out.println(s.peek());
////                s.pop();
////            }
//
////    }
//    public static String reversedString(String str){
//        Stack<Character> s=new Stack<>();
//        int idx=0;
//        while(idx<str.length()){
//            s.push(str.charAt(idx));
//            idx++;
//
//        }
//
//        StringBuilder result=new StringBuilder("");
//        while (!s.isEmpty()){
//            char curr=s.pop();
//            result.append(curr);
//
//        }
//        return result.toString();
//
//
//    }
//
////    public static void main(String[] args) {
////   String str="GeekForGeeks";
////   String result=reversedString(str);
////        System.out.println(result);
////
////    }
//}
//
//
//
//
















//======================================================
//    public static ArrayList<Integer> valueEqualToIndex(int arr[], int n) {
//        ArrayList<Integer> newarr = new ArrayList<>();
//        int idx = 1;
//        for (int i = 0; i < arr.length; i++) {
//            if (idx == arr[i]) {
//                newarr.add(i);
//            }
//            idx++;
//        }
//        System.out.println(newarr);
//        return newarr;
//    }
//
//    public static void palindrom(int n) {
//        ArrayList<Integer> arr = new ArrayList<>();
//
//        while (n > 10) {
//            int result = n % 10;
//            arr.add(result);
//        }
//        int start = 0;
//        int end = arr.size();
//        while (start < end) {
//            if (arr.get(start) != arr.get(end)) {
//                System.out.println("not Palindrom");
//            }
//            start++;
//            end--;
//        }
//        System.out.println("palindrom");
//    }
//
//    public static void strpalinddrom(int n) {
//        String s = String.valueOf(n);
//        System.out.println(s);
//        int start = 0;
//        int end = s.length();
//        while (start < end) {
//            if (s.charAt(start) != s.charAt(end)) {
//                System.out.println("not palindrom");
//                return;
//            }
//            start++;
//            end--;
//        }
//        System.out.println("palindrom");
//    }
//
//
//    public static  ArrayList<Integer> duplicate(int arr[]){
//        ArrayList<Integer> dups=new ArrayList<>();
//         int temparr[]=new int[arr.length];
//        dups.add(-1);
//
//
//        for (int i = 0; i <arr.length ; i++) {
//            temparr[arr[i]]++;
//
//        }
//        for (int i = 0; i < temparr.length ; i++) {
//            if(temparr[i]>1){
//                dups.add(i);
//            }
//        }
//    return  dups;
//    }
//    public  static void combine(int arr1[], int arr2[]){
//        ArrayList<Integer> Final=new ArrayList<>();
//
//        for (int i = 0; i < arr1.length; i++) {
//            Final.add(arr1[i]);
//        }
//        for (int i = 0; i < arr2.length; i++) {
//            Final.add(arr2[i]);
//        }
//       Collections.sort(Final);
//        System.out.println(Final);
//        int ind=0;
//        int ind2=0;
//        int arr[]=new int[Final.size()];
//        for (int i = 0; i <Final.size() ; i++) {
//
//            if(Final.get(ind-1)!=Final.get(ind)){
//               arr[ind2] =Final.get(ind);
//               ind2++;
//            }
//            ind++;
//        }
////        Stack<Integer> s=new Stack<>();
////        for (int i = Final.size(); i >0 ; i--) {
////            if(s.peek()!=Final.get(i)){
////               s.push(Final.get(i));
////            }
////
////        }
////        ArrayList<Integer> newFinal=new ArrayList<>();
////        for (int i = 0; i <Final.size() ; i++) {
////            System.out.println(newFinal.add(s.pop())); ;
////        }
//
//
//
//    }
//    public static void main(String[] args) {
//        int arr[]= {3,46,7,89,0,3,7};
//        int arr1[]={43,56,7,8,9,5,3,};
//         combine(arr,arr1);
//
//
//
//        }

//    public static int findPeek(int arr[]){
//       int n=arr.length;
//       if(arr.length==1){
//           return 0;
//
//
//       }
//
//
//
//        int idx=0;
//        while (idx< arr.length-2){
//
//
//            if(arr[idx]>arr[idx+1]){
//                peek=arr[idx];
//
//              break;
//
//            }
//            idx++;
//        }
//      return peek;
//
//    }
//public static void main(String[] args) {
//
//int arr[]={10,11,5,6,7,8};
//    System.out.println(findPeek(arr));
//}