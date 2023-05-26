package com.apanaschool;
import java.util.*;
import java.util.LinkedList;

public class QueueB {
//    static  class Queue{
//        static  int arr[];
//        static  int size;
//        static  int rear;
//
//        Queue(int n){
//            arr =new int[n];
//            size=n;
//            rear=-1;
//        }
//        public static boolean isEmpty(){
//            return rear==-1;
//
//        }
//        public static void add(int data){
//            if(rear==size-1){
//                System.out.println("Queue is full ");
//                return;
//            }
//            rear = rear+1;
//            arr[rear]=data;
//        }
//        public static int remove(){
//            if(isEmpty()){
//                return -1;
//            }
//            int front =arr[0];
//            for (int i = 0; i <rear ; i++) {
//                arr[i]=arr[i+1];
//            }
//            rear =rear-1;
//            return  front;
//        }
//
//        public static int peek(){
//            if(isEmpty()){
//                return -1;
//            }
//            return arr[0];
//
//        }
//    }

    // circular Queue
//static  class Queue{
//    static  int arr[];
//    static  int size;
//    static  int rear;
//    static  int front;
//
//
//
//    Queue(int n){
//        arr =new int[n];
//        size=n;
//        rear=-1;
//        front=-1;
//    }
//    public static boolean isEmpty(){
//        return rear==-1 && front==-1;
//
//    }
//    public  static boolean isFull(){
//        return  (rear+1)%size==front;
//    }
//
//    public static void add(int data){
//        if(isFull()){
//            System.out.println("Queue is full ");
//            return;
//        }
//        if(front==-1){
//            front=0;
//        }
//        rear = (rear+1)%size;
//        arr[rear]=data;
//    }
//    public static int remove(){
//        if(isEmpty()){
//            return -1;
//        }
//        int result =arr[front];
//
//     // removing last element
//        if(rear==front){
//           rear=front=-1;
//
//        }else {
//            front=(front+1)%size;
//        }
//        return  result;
//    }
//
//    public static int peek(){
//        if(isEmpty()){
//            return -1;
//        }
//        return arr[front];
//
//    }
//}
//    static  class Node{
//    int data ;
//    Node next;
//    Node(int data){
//        this.data=data;
//        this.n
//    }
//
//
//}
//    static  class Queue {
//        static int arr[];
//        static int size;
//        static int rear;
//        static int front;
//
//
//        Queue(int n) {
//            arr = new int[n];
//            size = n;
//            rear = -1;
//            front = -1;
//        }
//
//        public static boolean isEmpty() {
//            return rear == -1 && front == -1;
//
//        }
//
//        public static boolean isFull() {
//            return (rear + 1) % size == front;
//        }
//
//        public static void add(int data) {
//            if (isFull()) {
//                System.out.println("Queue is full ");
//                return;
//            }
//            if (front == -1) {
//                front = 0;
//            }
//            rear = (rear + 1) % size;
//            arr[rear] = data;
//        }
//
//        public static int remove() {
//            if (isEmpty()) {
//                return -1;
//            }
//            int result = arr[front];
//
//            // removing last element
//            if (rear == front) {
//                rear = front = -1;
//
//            } else {
//                front = (front + 1) % size;
//            }
//            return result;
//        }
//
//        public static int peek() {
//            if (isEmpty()) {
//                return -1;
//            }
//            return arr[front];
//
//        }
//    }
//    public static void main(String[] args) {
//        Queue q = new Queue();
//        q.add(1);
//        q.add(2);
//        q.add(3);
////        System.out.println(q.remove());
////        q.add(4);
////        System.out.println(q.remove());
////        q.add(5);
//
//        while (!q.isEmpty()){
//            System.out.println(q.peek());
//            q.remove();
//        }
//
//
//    }

public static String firstNonRepeting(String str){
    Queue<Character> q=new LinkedList<>();
    int freq[]=new int[26];
    StringBuilder strb=new StringBuilder();
    for (int i = 0; i < str.length(); i++) {
        char ch=str.charAt(i);
        q.add(ch);
        freq[ch-'a']++;
        while (!q.isEmpty() && freq[q.peek()-'a']>1) {
            q.remove();
        }
        if(q.isEmpty()){
            strb.append('#');
        }else {
            strb.append(q.peek());
        }

    }


  return strb.toString();
}
    public static void main(String[] args) {
        String str="aabc";
        System.out.println(firstNonRepeting(str));
    }
}