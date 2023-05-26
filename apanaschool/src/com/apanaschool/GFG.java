package com.apanaschool;
import java.util.*;
public class GFG {
    public static int MissingNumber(int array[], int n) {

        // Your Code Here

        Arrays.sort(array);
        int ans = 0;
        for (int i = 0; i < n; i++) {
            if (array.length > i) {
                if (array[i] != i + 1) {
                    ans = i + 1;
                    break;
                }
            } else {
                ans = i + 1;
            }
        }

        return ans;


    }


    public static int MissingElement(int arr[]) {
        Arrays.sort(arr);
        for (int i = 1; i <= arr.length - 1; ) {
            int a = i;
            if (arr[i] != a) {
                return i;
            }
            i++;
        }
        return -1;
    }


    public static void ll(int arr[], int arr1[], int m, int n) {
        int size = n + m;
        int arr2[] = new int[size];
        int k = 0;
        for (int i = 0; i < arr2.length; i++) {
            if (i < m) {
                arr2[i] = arr[i];
            } else {
                arr2[i] = arr1[k];
                k++;
            }

        }
        Arrays.sort(arr2);
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");

        }

    }
//        public static void main (String args[]){
//            int arr[] = {1, 3, 3, 5, 4};
//            int arr1[]={1,56,7,9};
////            System.out.println(MissingElement(arr));
//ll(arr,arr1,5,4);
//        }
//    }

    //   public static void main(String[] args) {
//        int tree[]={3,5,7,8,2};
//        int k=4;
//        int maxHight=Integer.MIN_VALUE;
//        for (int i = 0; i < tree.length; i++) {
//            maxHight=Math.max(maxHight,tree[i]);
//        }
//
//        int h=-1;
//        int start=0;
//
//        int end=maxHight;
//        while (start<=end){
//            int mid=start+(end-start)/2;
//            if(fun(tree[],mid)==k){
//                return mid;
//            }
//            else if(fun(tree[],mid)<k){
//                end=mid-1;
//            }
//            else if(fun(tree[],mid)>k){
//                start=mid+1;


    //  }
    //     }


//    }
//    public static int fun(int tree[],int mid){
//      int collectWood=0;
//        for (int i = 0; i < tree.length ; i++) {
//            if (tree[i]>mid){
//                collectWood+=tree[i]-mid;
//
//
//        }
//        return collectWood;
//    }
//
//}
  public static void print(int n){
        if(n==0){
            System.out.println(0);
            return;
        }
      System.out.println(n);
        print(n-1);
  }

    public static void main(String[] args) {
       int n=5;
       print(n);
    }
}


    //++++++++++++++++++++++++++++++++++++++++++++++????????????????????????+++++++++++++++++++

//package com.apanaschool;
//
//        import java.util.*;
//        import java.util.LinkedList;
//
//public class Patterns {
//    //    public static void main(String[] args) {
////     Scanner sc=new Scanner(System.in);
////     int n=4;
////     String[] sr=new String[4];
////     int count =0;
////        for (int i = n; i >0; i--) {
////            for (int j = 0; j < n-i; j++) {
////
////                 sr[n-i]=" ";
////            }
////
////            for (int j = 0; j < 2*i-1; j++) {
////
////                sr[n-i]="*";
////            }
////            System.out.println();
////
////
////
////        }
////        for (int i = 0; i <n ; i++) {
////            System.out.print(sr[i]);
////        }
//////public static void main(String[] args) {
//////    int n=4;
//////    char ch='A';
//////    for (int i = 1; i <=n ; i++) {
//////        for (int j = 0; j <i ; j++) {
//////            System.out.print(ch);
//////            ch++;
////
//////
//////        }
//////        System.out.println();
//////
//////    }
//    public static void reverseStack(Stack<Integer> s){
//        Stack<Integer> newStack=new Stack<>();
//        while (!s.isEmpty()){
//            int top=s.pop();
//            newStack.push(top);
//
//        }
//        while (!newStack.isEmpty()){
//            System.out.println(newStack.peek());
//            newStack.pop();
//        }
//    }
//    //    public static void main(String[] args) {
////  Stack<Integer> s=new Stack<>();
////  s.push(1);
////  s.push(2);
////  s.push(3);
////  s.push(4);
////  s.push(5);
////
////reverseStack(s);
////
////}
////    public static void nextGreater(int arr[]){
////        Stack<Integer> s= new Stack<>();
////        int[] nextGreElem=new int[arr.length];
////        for (int i = arr.length-1; i >=0 ; i--) {
////            while(!s.isEmpty() && arr[s.peek()]<=arr[i]){
////                s.pop();
////        }
////            if(s.isEmpty()){
////                nextGreElem[i]=-1;
////
////            }
////            else {
////                nextGreElem[i]=arr[s.peek()];
////            }
////        s.push(i);
////    }
////        for (int i = 0; i <nextGreElem.length ; i++) {
////            System.out.print(nextGreElem[i]+",");
////
////        }
////
////
////
////    }
////    public static void main(String[] args) {
////        int[] arr={6,9,11,6,7,3,4};
////        nextGreater(arr);
////}
//    public static boolean isValid(String str){
//        Stack<Character> s=new Stack<>();
//        for (int i = 0; i <str.length() ; i++) {
//            char ch =str.charAt(i);
//            //opening
//            if(ch =='{' || ch=='(' || ch=='['){
//                s.push(ch);
//            }
//            else {
//                if(s.isEmpty()){
//                    return  false;
//                }
//                if(  (s.peek()=='{' && ch=='}')
//                        ||(s.peek()=='[' && ch==']')
//                        ||(s.peek()=='(' && ch==')')){
//                    s.pop();
//
//                }
//                else {
//                    return false;
//                }
//            }
//        }
//        if(s.isEmpty()){
//            return true;
//        }
//        else
//            return false;
//    }
//    //        public static void main(String[] args) {
////        String str="{(())}";
////            System.out.println(isValid(str));
////}
//    public static boolean isDupplicate(String str){
//        Stack<Character> s=new Stack<>();
//        for (int i = 0; i < str.length(); i++) {
//            char ch=str.charAt(i);
//
////         closing
//            if(ch==')'){
//                int count=0;
//                while (s.peek()!='('){
//                    s.pop();
//                    count++;
//                }
//                if(count<1){
//                    return  true;
//                }
//                else {
//                    s.pop();
//                }
//            }
//            else {
//                s.push(ch);
//            }
//
//        }
//        return false;
//    }
//
//    //    public static void main(String[] args) {
////        String str="(b+c-d+(c))";
////        String Str1="(a+b)";
////        System.out.println(isDupplicate(str));
//////        System.out.println(isDupplicate(Str1));
////
////    }
//    public static void  maxArear(int arr[]){
//        int maxArea=0;
//        int nsr[]=new int[arr.length];
//        int nsl[]=new int[arr.length];
//
//        //Next Smallest right
//        Stack<Integer> s=new Stack<>();
//        for (int i =arr.length-1; i >=0 ; i--) {
//            while(!s.isEmpty() && arr[s.peek()] >= arr[i]){
//                s.pop();
//            }
//            if(s.isEmpty()){
//                nsr[i]=arr.length;
//            }
//            else {
//                nsr[i]=s.peek();
//            }
//            s.push(i);
//
//        }
//
//
//        // Next Smallest Left
//        s=new Stack<>();
//        for (int i =0; i <arr.length ; i++) {
//            while(!s.isEmpty() && arr[s.peek()]>=arr[i]){
//                s.pop();
//            }
//            if(s.isEmpty()){
//                nsl[i]=-1;
//            }
//            else {
//                nsl[i]=s.peek();
//            }
//            s.push(i);
//
//        }
//
//        //current Area width  nsr-nsl-1
//        for (int i = 0; i < arr.length ; i++) {
//            int hight=arr[i];
//            int width= nsr[i]-nsl[i]-1;
//            int currArea=hight*width;
//            maxArea=Math.max(currArea,maxArea);
//
//        }
//        System.out.println(maxArea);
//    }
//
////    public static void main(String[] args) {
////       Scanner sc=new Scanner(System.in);
////       int n=sc.nextInt();
////        for (int i = 0; i <n ; i++) {
////            for (int j = 0; j <n ; j++) {
////                System.out.print("*");
////
////            }
////            System.out.println();
////
////        }
////
////    }
//
//
//    //+++++++++++++++++++++++wrong solution  interleave to string +++++++++++++++++++++++
////    public static boolean interleave(String a, String b,String c){
////        Queue<Character> q1=new LinkedList<>();
////        Queue<Character> q2=new LinkedList<>();
////        StringBuilder str=new StringBuilder();
////        int size=a.length()+b.length();
////        for (int i = 0; i <b.length() ; i++) {
////            q1.add(b.charAt(i));
////        }
////        while (!q1.isEmpty()){
////            System.out.println(q1.peek());
////        }
////        for (int i = 0; i <a.length() ; i++) {
////            q2.add(a.charAt(i));
////        }
////        while (!q2.isEmpty()){
////            System.out.println(q2.peek());
////        }
////        while (!q2.isEmpty()) {
////            q1.add(q2.remove());
////            q1.add(q1.remove());
////        }
////
//////        while (!q1.isEmpty()){
//////            System.out.println(q1.peek());
//////        }
////        for (int i = 0; i <size; i++) {
////            str.append(q1.remove());
////        }
////        String result=str.toString();
////   if (result.equals(c)){
////      return true;
////   }
////    else {
////      return false;
//// }
////    }
////
////    public static void main(String[] args) {
////        String a="abc";
////        String b="xyz";
////        String c="abcxyz";
////        System.out.println(interleave(a,b,c));
////    }
//
//
////    public static void main(String[] args) {
////        Queue<Integer> q=new LinkedList<>();
////        q.add(1);
////        q.add(2);
////        q.add(3);
////        q.add(4);
////        q.add(5);
////
////        Stack<Integer> s=new Stack<>();
////        while (!q.isEmpty()){
////            s.push(q.remove());
////        }
////        while (!s.isEmpty()){
////            q.add(s.pop());
////        }
//
//
////    }
////public static int activitySelection(int start[], int end[])
////{
////    // add your code here
////    Arrays.sort(end);
////    int maxAct=1;
////    int lastend=end[0];
////    for (int i = 1; i <end.length ; i++) {
////        if(start[i]>=lastend){
////            maxAct++;
////            lastend=end[i];
////        }
////
////    }
////    return maxAct;
////
////
////
////}
////
////    public static void main(String[] args) {
////        int start[]={7 ,2, 2, 3};
////        int end[]={8, 4, 7, 10};
////        System.out.println(activitySelection(start,end));
////    }
//
////
////    public static void main(String[] args) {
////        Scanner sc=new Scanner(System.in);
////        int n=4;
//
////        for (int i = 0; i <n ; i++) {
////            for (int j = 1; j <n-i ; j++) {
////                System.out.print(" ");
////            }
////            char ch='A';
////            for (int j = 0; j <= i; j++) {
////                System.out.print(ch);
////                ch++;
////            }ch--;
////            for (int j = 0; j <i ; j++) {
////                ch--;
////
////                System.out.print(ch);
////
////
////            }
//
//
////            System.out.println();
////        }
////        int n=5;
////        char ch='A';
////        char value='A';
////        for (int i = 1; i <5 ; i++) {
////           value= ch++;
////        }
////
////          ch=value;
////        for (int i = 0; i <n ; i++) {
////            for (int j = 0; j <=i ; j++) {
////                System.out.print(ch);
////                ch--;
////            }
////
////        }
//
//    public static void main(String[] args) {
//        ArrayList<Integer> seq=new ArrayList<>();
//        int arr[]=seq.toArray();
//
//        int value[]={60,100,120};
//        int weight[]={10,20,30};
//        int w=50;
//        double ratio[][]=new double[value.length][2];
//        for (int i = 0; i < value.length; i++) {
//            ratio[i][0]=i;
//            ratio[i][1]=value[i]/(double)weight[i];
//        }
//        Arrays.sort(ratio,Comparator.comparing(o->o[1]));
//        int capacity=w;
//        int finalValue=0;
//        for (int i = 0; i <ratio.length ; i++) {
//            int idx=(int)ratio[i][0];
//            if(capacity>=weight[i]){
//                finalValue+=value[i];
//                capacity-=weight[i];
//
//            }
//            else {
//                finalValue+=(ratio[i][1]*capacity);
//                capacity=0;
//                break;
//            }
//        }
//    }
//
//
//}
//
//
//
//
