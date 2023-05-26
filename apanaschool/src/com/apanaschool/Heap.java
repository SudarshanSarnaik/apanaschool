package com.apanaschool;

import  java.util.*;
public class Heap {
//     static class Student  implements Comparable<Student>{
//         String name;
//         int rank;
//         public Student(String name, int rank){
//             this.name=name;
//             this.rank=rank;
//         }
//         @Override
//         public  int compareTo(Student s2){
//             return this.rank- s2.rank;
//         }
//     }
//
//    public static void main(String[] args) {
//        PriorityQueue<Student> pq=new PriorityQueue<>();
//      pq.add(new Student("Amar",8));
//        pq.add(new Student("Raghav",10));
//        pq.add(new Student("Sudarshan",1));
//        pq.add(new Student("Sangram",3));
//        pq.add(new Student("Rohan",6));
//        while (!pq.isEmpty()){
//            System.out.println(pq.peek().name+"->"+pq.peek().rank);
//            pq.remove();
//        }


//    public static void main(String[] args) {
//
////        for (int i = 0; i < str.length(); i++) {
////          boolean ch= true;
////
////            for (int j = 0; j < SB.length(); j++) {
////                if(str.charAt(i)==SB.charAt(j)){
////                    ch=false;
////            }
////             if(ch){
////                 SB.append(str.charAt(i));
////             }
////
////        }
//
////
////        String str="gfgf";
////        StringBuilder SB=new StringBuilder();
////        char[] charArr = str.toCharArray();
////        Arrays.sort(charArr);
////        for (int i = 0; i < charArr.length; i++) {
////            System.out.print(charArr[i]+" ");
////
////        }
////        int c=0;
////        SB.append(charArr[0]);
////        for (int i = 1; i < charArr.length; i++) {
////            if(charArr[c]!=charArr[i]){
////                SB.append(charArr[i]);
////        }
////            c++;
////
////
////        }
////        System.out.print(SB);
//
//        Stack<Integer> s=new Stack<>();
//        s.add(3);
//        s.add(5);
//        s.add(1);
//
//        int arr[]=new int[s.size()];
//        int i=0;
//        while(!s.isEmpty()){
//            arr[i]=s.peek();
//            s.pop();
//            i++;
//        }
////     ArrayList<Integer> ll=new ArrayList<>();
////     while(!s.isEmpty()){
////         ll.add(s.peek());
////         s.pop();
////     }
////     Collections.sort(ll);
//        Arrays.sort(arr);
//        for (int j = 0; j < arr.length ; j++) {
//            System.out.println(arr[j]);
//
//        }
//        for (int j = 0; j < arr.length; j++) {
//            s.push(arr[j]);
//
//
//        }
//        while (!s.isEmpty()){
//            System.out.println(s.peek());
//            s.pop();
//        }


//    }
public static void main(String[] args) {

//       LinkedList<Character> ll=new LinkedList<>();
//       ll.addFirst('g');
//       ll.addFirst('f');
//       ll.addFirst('g');
//       char arr[]=new char[ll.size()];
//        for (int i = 0; i < arr.length; i++) {
//           arr[i] =ll.get(i);
//
//        }
//        int start=0;
//        int end=arr.length-1;
//        while (start<end){
//            if(arr[start]!=arr[end]){
//                System.out.println("not palindrom");
//            }
//        }
//        System.out.println(" palindrom");


    ArrayList<Integer> ll=new ArrayList<>();

    ll.size();
    ll.add(1);
    ll.add(2);
    ll.add(3);
    ll.add(4);
    ll.add(5);
    ll.add(6);

    int k=3;
    int i=0;
    int j=k-1;
    while(i<j){
        int temp=ll.get(j);
       ll.add(ll.get(i));
       ll.add(i,temp);
        i++;
        j--;

}


}
