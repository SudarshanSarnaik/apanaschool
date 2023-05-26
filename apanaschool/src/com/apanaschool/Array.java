package com.apanaschool;
import  java.util.*;
public class Array {


    public static  int BinarySrearch(int arr[],int target) {
        int start=0;
        int end=arr.length-1;
        while(start <= end){
           int mid=(start+end)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]<target){
                start=mid+1;
            }
            else {
                end=mid-1;
            }
        }
        return  -1;
    }
    public static void printsubarr(int[] arr){
int max=Integer.MIN_VALUE;
       int sum=0;
 int[] preFixarr=new int[arr.length];
 preFixarr[0]=arr[1];
        for (int i =1; i <arr.length ; i++) {
            preFixarr[i]=preFixarr[i-1]+arr[i];
        }
        for (int i = 0; i <arr.length; i++) {
            for (int j =i; j <arr.length; j++) {
               sum= i==0 ? preFixarr[j]:preFixarr[j]- preFixarr[i-1];
                max=Math.max(max,sum);
//                for (int k = i; k <=j ; k++) {
//                    sum=sum+arr[k];
//                    System.out.print( arr[k]+" ");
//                    max=Math.max(max,sum);
//                }
//                System.out.print("   sum "+sum);
//                System.out.println(" ");
            }
        //    System.out.println("");

        }
       System.out.println("maximum Sum of an array="+max);
    }

    public static int kadanas(int arr[]){
        int maxsum=Integer.MIN_VALUE;
        int cursum=0;
        for (int i = 0; i <arr.length ; i++) {
            cursum=cursum+arr[i];
            if(cursum<0){
                cursum=0;
            }
            maxsum=Math.max(cursum,maxsum);
        }
        return  maxsum;
    }

    Vector<Integer> findRange(String str, int n) {
        // code here
        int count = 0;
        int l=-1;
        int r=-1;
        int max=0;
        int ansL=-1;
        int ansR=-1;
        for(int i=0; i<n; i++){
            if(str.charAt(i)=='0'){
                count++;

            }else {
                count--;
                if(count<0){
                    count=0;
                    l=-1;
                }
            }
            if(count==1 && l==-1){
                l=i;
            }
            if(count>max){
                max=count;
                ansL=l;
                ansR=i;
            }
        }
        Vector<Integer> ans=new Vector<>();
        if(ansL==-1){
            ans.add(-1);
        }
        else {
            ans.add(ansL);
            ans.add(ansR);
        }
        return ans;
    }
    public static int[] leadcode(int digits[]){
        int i = digits.length - 1;

        while (i >=0 && digits[i] == 9) {
            i --;
        }


        if (i == -1) {
            int[] result = new int[digits.length + 1];
            result[0] = 1;
            return result;
        }


        int[] result = new int[digits.length];

        result[i] = digits[i] + 1;
        for (int j = 0; j < i; j ++) {
            result[j] = digits[j];
        }

        return result;
    }
   public static  void stockprice(int[] price){
      int buyPricr=Integer.MAX_VALUE;

      int Maxprofit=Integer.MIN_VALUE;
       for (int i = 0; i < price.length; i++) {
           if(buyPricr<price[i]){
              int profit=price[i]-buyPricr;
               Maxprofit=Math.max(Maxprofit,profit);
           }
           else {
               buyPricr=price[i];
           }

       }
       System.out.println(Maxprofit);
   }
   public static void bubbleSort(int arr[]){
       for (int turns= 0; turns< arr.length-1 ; turns++) {
           for (int j =0; j < arr.length-1-turns ; j++) {
               if (arr[j] > arr[j + 1]) {
                   int temp = arr[j = 1];
                   arr[j + 1] = arr[j];
                   arr[j] = temp;
               }
           }
       }

   }
   public static void printArr(Integer arr[]) {
       for (int i = 0; i < arr.length; i++) {
           System.out.print(arr[i]);
       }
       System.out.println(" ");
   }
   public static void insertionSort(int arr[]){
       for (int i = 0; i < arr.length-1 ; i++) {
           int minpos=i;
           for (int j = i+1; j <arr.length ; j++) {
               if(arr[minpos]>arr[j]){
                   minpos=j;
               }
               int temp=arr[minpos];
               arr[minpos]=arr[i];
               arr[i]=arr[minpos];
           }

       }
   }
   public static String toUpperCase(String str){
        StringBuilder sb=new StringBuilder();
        char ch=Character.toUpperCase(str.charAt(0));
        sb.append(ch);
       for (int i = 1; i <str.length() ; i++) {
           if(str.charAt(i)==' '&& i<str.length()-1){
               sb.append(str.charAt(i));
               i++;
               sb.append(Character.toUpperCase(str.charAt(i)));
           }
           else{
               sb.append(str.charAt(i));
           }

       }
       return sb.toString();
   }
 public static String COUNTSRING(String str){
        StringBuilder sb=new StringBuilder();
     for (int i = 0; i <str.length() ; i++) {
  Integer count=1;
      while( i<str.length()-1 && str.charAt(i)==str.charAt(i+1) ){
          count++;
          i++;
      }
      sb.append(str.charAt(i));
      if(count>1){
          sb.append(count);
      }

     }
     return sb.toString();
 }
  public static void printnto1(int n){
      if (n==1) {
          System.out.println(n);
          return;
      }
      printnto1(n-1);
      System.out.println(n+" ");

  }
  public static int factorial(int n){
        if(n==0){
            return 1;
        }
        int fact1=factorial(n-1);
      int fact=n*fact1;
        return fact;
  }
  public static int sum(int n){
        if(n==1){
            return 1;
        }
        int sum1=n+sum(n-1);
        return sum1;
  }
  public static int opttoPower(int a,int i){
        if(i==0){
            return 1;
        }
        int halfPower=opttoPower(a,i/2);
        int power=2*halfPower;
        if(i%2!=0){
            power=a*power;
        }
        return power;
  }


  public static void removeDuplicaate(String str, int inx, StringBuilder newStr, boolean map[]){
        if(inx==str.length()){
            System.out.println(newStr);
            return;
        }
        char currentChar= str.charAt(inx);
        if(map[currentChar-'a']==true){
            removeDuplicaate(str,inx+1,newStr,map);
        }
        else {
            map[currentChar-'a']=true;
            removeDuplicaate(str,inx+1,newStr.append(currentChar),map);
        }
  }
public static int find(int n){

        // code here
        int sum=0;
        for(int i=1; i<=n;i++){
            sum=sum+i;
            if(sum==n){
                return i;
            }

        }
        return -1;

    }
    public static int numOfOcc(int arr[],int k){
        Arrays.sort(arr);
        int count=1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==arr[i+1]){
                count++;
                i++;
            }
            if(count==k){
                return arr[i];
            }

        }
        return -1;
    }
    public static boolean binaryString(String str){
     
        for (int i = 0; i <str.length(); i++) {
            if(str.charAt(i)!='0' && str.charAt(i)!='1'){
                return  false;
            }

        }
        return true;
    }

//    public static void main (String[] args) {
//       // String str= "apanacollege";
//       // System.out.println('z'-1);
//      // removeDuplicaate(str,0,new StringBuilder(""),new boolean[26]);
////        int arr[]={2,2,5,7,7,7,2,9,4};
////        System.out.println(numOfOcc(arr,2));
//        String str="108676";
//        System.out.println(binaryString(str));
//        }

    public static void main(String[] args) {
        int arr[]={1,-2,6,-1,3};
        int maxSum=Integer.MIN_VALUE;
        int currentSum=0;
        int prefix[]=new int[arr.length];
        prefix[0]=arr[0];

        for (int i = 1; i < prefix.length; i++) {
            prefix[i]=prefix[i-1]+arr[i];
        }

        for (int i =0; i < arr.length; i++) {
            int start=i;
            for (int j = i; j < arr.length; j++) {
                int end=j;
                currentSum= start == 0 ? prefix[end] : prefix[end]-prefix[start-1];
             maxSum=Math.max(maxSum,currentSum);

            }
        }
        System.out.println(">>"+maxSum);
    }


    }


















