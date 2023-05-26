package com.apanaschool;
import java.util.*;

class DivideAndConqure {
    public static void printarr(int arr[]){
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+",");
        }
        System.out.println();
    }

    public static void mergeSort(int arr[],int si, int ei){
        if(si>=ei){
            return;
        }
        int mid=si+(ei-si)/2;
        mergeSort(arr,si,mid);
        mergeSort(arr,mid+1,ei);

        merge(arr,si,mid,ei);
    }
    public static void merge(int arr[],int si, int mid,int ei){
        int temp[]=new int[ei-si+1];
        int i=si;;
        int j=mid+1;
        int k=0;
         while(i<=mid && j<=ei){
             if(arr[i]<arr[j]){
                 temp[k]=arr[i];
                 i++;
             }
             else {
                 temp[k]= arr[j];
                 j++;
             }
             k++;
         }
         while(i<=mid){
             temp[k++]=arr[i++];
         }
         while (j<=ei){
             temp[k++]=arr[j++];
         }
        for ( k=0,i=si; k< temp.length; k++,i++) {
            arr[i]=temp[k];
        }

    }
//        public static String reverseString(String str){
//
//          StringBuilder sb=new StringBuilder();
//            for (int i = str.length()-1; i>=0 ; i--) {
//                sb.append(str.charAt(i));
//            }
//            return(sb.toString());
//        }


    public static void quickShort( int arr[],int si,int ei){
        if(si>=ei){
            return;
        }
        int pInx=partion(arr,si,ei);
        quickShort(arr,si,pInx-1);
        quickShort(arr,pInx+1,ei);


    }
    public static int partion(int arr[],int si, int ei){
      int pivot =arr[ei];
      int i=si-1;

        for (int j = si; j <=ei ; j++) {

            if(arr[j]<pivot){
                i++;
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
        i++;
        int temp=pivot;
        arr[ei]=arr[i];
        arr[i]=temp;
        return i;
    }
    public static void findSubset(String str, String  ans, int i){
        if(i==str.length()){
            System.out.println(ans);
            return;
        }
//        yes
        findSubset( str,ans+str.charAt(i),i+1);
//        no
        findSubset(str,ans,i+1);
    }

    public static void permutation(String str,String ans){
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        for (int i = 0; i <str.length() ; i++) {
            char current = str.charAt(i);
             String Newstr= str.substring(0,i)+str.substring(i+1);
            permutation(Newstr ,ans+current);

        }
    }
//----------------------------------------N-Queen--------------------------------------------
  public static boolean isSafe(char board[][], int row ,int col){
        //vertical up
        boolean var=true;
      for (int i=row-1; i>=0;i--) {
          if (board[i][col] == 'Q') {
             var=false;
          }
      }
      for (int i =row-1, j=col-1; i >=0 && j>=0 ; i--,j--) {
          if (board[i][j] == 'Q') {
           var= false;
          }
      }
      for (int i =row-1,j=col+1; i >=0 && j< board.length ; i--,j++) {
          if (board[i][j] == 'Q') {
            var=false;
          }
      }
      return var;
 }
    public static void findNQuens(char board[][], int row){
        if(row==board.length){
            Printbord(board);  // count++;
            return;
        }
        for (int j = 0; j < board.length; j++) {
            if(isSafe(board,row,j)) {
                board[row][j] = 'Q';
                findNQuens(board, row+1);
                board[row][j] = 'X';
            }

        }
    }


     public static void Printbord(char board[][]){
        System.out.println("-----------chess Board-------------");
        for (int i = 0; i < board.length ; i++) {
            for (int j = 0; j < board.length ; j++) {
                System.out.print(board[i][j]+" ");
            }
            System.out.println("");
        }
    }
//     to count number of N-Quen forms : static count=0;


    public static void PrintNumber(int n){
        if(n==0)
            return;
        PrintNumber(n-1);
        System.out.println(n);
    }

    void reverseInGroups(ArrayList<Integer> arr, int n, int k) {
        // code here

        for(int i=k-1; i>=0;i--){
            System.out.print(arr.get(i));
        }
        for(int j=arr.size()-1;j>=k;j-- ){
            System.out.print(arr.get(j));
        }
    }

//    ======================================================================================================================================
int n=4;
//        char board[][]=new char[n][n];
//        for (int i = 0; i <n ; i++) {
//            for (int j = 0;  j < n;  j++) {
//                board[i][j]='X';
//
//            }
//
//        }
//        findNQuens(board,0);

    //        int n=10;
//
//        PrintNumber(n)
//        int[] arr={4, 8, 12, 16};
//       int max=Integer.MIN_VALUE;
//        for (int i = 0; i < arr.length; i++) {
//
//            for (int j =i+1; j < arr.length; j++) {
//                int result=arr[i]&arr[j];
//                max=Math.max(result,max);
//============================================================================================================================================
    public static void  findMinMax(int[] arr) {
     int min=Integer.MAX_VALUE;
     int max=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            max=Math.max(max,arr[i]);
            min=Math.min(min,arr[i]);
        }
        System.out.println("max="+max+"min="+min);
    }

    public static int finddistance(int arr[],int x,int y){
      int start = 0;
      int end=0;
      int result=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==x){
                start=i;
            }
            if(arr[i]==y){
                end=i;
                break;
            }
        }
        if(start>end){
           result= start-end;
        }
        else {
            result=end-start;
        }

return result+1;
    }
//=============================================================================================================================================
//public static void main(String[] args) {
////      int arr[]={4,8,2,5,1};
//////
////        System.out.println(finddistance(arr,8,5));
//    String str="56479";
////        int[] arr={3,7,4,2,5,6};
////          char[]  str1=str.toCharArray();
////          Arrays.sort(str1);
////       String str2=String.valueOf(str1);
////        System.out.println(str2);
//    String str="56479";
//    int[] arr=new int[str.length()];
//    for (int i = 0; i < str.length(); i++) {
//
//        arr[i]=Integer.parseInt(String.valueOf(str.charAt(i)));
//    }
//
//    Arrays.sort(arr);
//
//    String str2="" ;
//
//    for (int i = 0; i < str.length(); i++) {
//        System.out.println(arr[i]);
//    }
//    //  System.out.println(str2);
//}

//===========================================================================================================================================
    public static void maximumTrapWater(int arr[]) {
//        int arr[]={3,1,2,4,5};
        int area=0;
        int maxArea=Integer.MIN_VALUE;
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j < arr.length; j++) {
                int length=Math.min(arr[i],arr[j]);
                area=length*(j-1);
                maxArea=Math.max(area,maxArea);
            }
        }
        System.out.println(maxArea);
    }

    public static int brutMaximumTrapWater(int arr[]){
        int lp=0;
        int rp=arr.length-1;

        int maxArea=0;
        while (lp<rp){
            int length=Math.min(arr[lp],arr[rp]);
            int Area=length*(rp-lp);
            maxArea=Math.max(maxArea,Area);
            if(arr[lp]<arr[rp]){
                lp++;
            }
            else {
                rp--;
            }

        }
        return maxArea;
    }

    public static int problem(String s,String x){

            // Your code here
            int ans=-1;
            for(int i=0; i<=s.length(); i++){
                for(int j=0;j<x.length();j++)
                    if(s.charAt(j)==x.charAt(j)){
                        if(i==x.length()){
                            ans=i-(x.length()-1);
                        }
                    }
            }
            return ans;

    }


    public static int getPairsCount(int[] arr,  int k) {
        // code here
        Arrays.sort(arr);
        int lp=0;
        int rp=arr.length-1;
        int count=0;

        while(lp<rp){

            if(arr[lp]+arr[rp]==k){
                count++;
                lp++;
            }
            if(arr[lp]+arr[rp]>k){
                rp--;
            }
            if(arr[lp]+arr[rp]<k){
                lp++;
            }
        }
        return count;
    }

    public static void main(String[] args) {

    }
}
