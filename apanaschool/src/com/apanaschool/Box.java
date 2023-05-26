package com.apanaschool;
import java.util.Scanner;
class Box {

////    public static void find(int numbers[]) {
////
////        int start = 0;
////        int end = numbers.length-1;
////
////        while (start < end) {
////            int mid = (start + end) / 2;
////
////            if (numbers[mid] == key) {
////                return mid;
////            }
////            if (numbers[mid] < key) {
////                start = mid + 1;
////            } else {
////                end = mid - 1;
////            }
////            int temp=numbers[start];
////            numbers[start]=numbers[end];
////           numbers [end]=temp;
////            start+=start+1;
////            end-=1;
////
////        }
////
////        for (int i = 0; i < numbers.length ; i++) {
////            System.out.print(numbers[i]+" ");
////
////        }
////
////    }
////
////    public static void main(String[] args) {
////
////        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 9};
//////        int key = 56;
//////        System.out.println("indecx for key is :" + find(numbers, key));
////
//
//
////        find(numbers);
////    }
//
//
//    public static int pair(int numbers[]) {
//        int count=0;
//        int latgest=Integer.MIN_VALUE;
//        int prefix[]= new int[numbers.length];
//        prefix[0]=numbers[0];
//
//
//        for (int i = 1; i <numbers.length ; i++) {
//            prefix[i]=prefix[i-1]+numbers[i];
//
//        }
//
//       for (int i = 0; i <numbers.length; i++) {
//           int currsum = 0;
//           for (int j = i; j < numbers.length; j++) {
//
//               currsum=  i==0 ? prefix[j] :prefix[j]-prefix[i-1];
//
//
//               }
//           if(currsum>latgest){
//               latgest=currsum;
//           }
//
//       }
//
//return latgest;
//
//    }
//    public static void kadan(int numbers[]){
//        int max=Integer.MIN_VALUE;
//        int cs=0;
//        for (int i = 0; i <numbers.length; i++) {
//            cs+=numbers[i];
//            if(cs<0){
//                cs=0;
//
//            }
//            max=Math.max(cs,max);
//
//        }
//
//        if(max==0){
//            max=Integer.MIN_VALUE;;
//            for (int i = 0; i < numbers.length ; i++) {
//                max=Math.max(max,numbers[i]);
//
//            }
//            System.out.println(max);
//
//        }
//        else {
//            System.out.println(max);
//        }
//
//    }
//    public static void trapwater(int numbers[]){
//        int trapWater=1;
//        int[] rightMax=new int[numbers.length];
//        int[] leftMax=new int[numbers.length];
//        leftMax[0]=numbers[0];
//        for (int i = 1; i <numbers.length ; i++) {
//            leftMax[i]=Math.max(numbers[i],leftMax[i-1]);
////            System.out.print(leftMax[i]);
//        }
//
//        rightMax[numbers.length-1]=numbers[numbers.length-1];
//        for (int i =numbers.length-2; i>=0; i--) {
//            rightMax[i]=Math.max(numbers[i],rightMax[i+1]);
//
//        }
//
//        int waterLevel=0;
//        for (int i = 0; i <numbers.length ; i++) {
//             waterLevel=Math.min(leftMax[i],rightMax[i]);
//             trapWater+=waterLevel-numbers[i];
//        }
//        System.out.println(trapWater);
//
//
//    }
//
//    public static boolean promler1(int numbers[]){
//        boolean result=false;
//        for (int i = 0; i <numbers.length ; i++) {
//            for (int j = 0; j < numbers.length ; j++) {
//                if (numbers[i]==numbers[j]){
//                    result=true;
//                    break;
//                }
//            }
//        }
//        return result;
//    }
//    public static void bubbleSort(int numbers[]){
//        int largest=numbers[0];
//        for (int j = 0; j < numbers.length; j++) {
//            for (int i = 1; i < numbers.length; i++) {
//                if (numbers[i - 1] > numbers[i]) {
//                    int temp = numbers[i];
//                    numbers[i] = numbers[i - 1];
//                    numbers[i - 1] = temp;
//                }
//            }
//        }
//        for (int i = 0; i < numbers.length ; i++) {
//            System.out.print(numbers[i]+" ");
//        }
//    }
//    public static void selection(int numbers[]){
//
//        int n=numbers.length;
//
//
//        for (int i = 0; i <n; i++) {
//            int minpos=i;
//            for (int j=i+1; j<n ; j++) {   //i+1
//             if(numbers[minpos]>numbers[j]){
//                 minpos=j;
//             }
//            }
//         int temp=numbers[i];
//            numbers[i]=numbers[minpos];
//            numbers[minpos]=temp;
//            System.out.print(numbers[i]+" ");
//        }
//
//    }
//// inserting wrong answerS
//public static void insertion(int num[])
//{
//    for (int i =1; i <num.length ; i++) {
//        int curr=i;
//        int prev=i-1;
//        while (prev>=0 && num[prev]>num[curr]){
//            num[prev+1]=num[prev];
//            prev--;
//        }
//        num[prev+1]=num[curr];
//
//      System.out.println(num[i]);
//    }
////    for (int i = 0; i < num.length; i++) {
////        System.out.println(num[i]);
////
////    }
//}
//
//// print function
//    public static void print(int arr[]){
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i]);
//        }
//        System.out.println("");
//    }
//
//// counting sort
//    public static void  countingsort(int numbers[]){
//        int largest =Integer.MIN_VALUE;
//        for (int i = 0; i <numbers.length; i++) {
//            largest=Math.max(largest,numbers[i]);
//        }
//        int count[]=new int[largest+1];
//
//        for (int i = 0; i < numbers.length; i++) {
//            count[numbers[i]]++;
//
//        }
//        int j=0;
//        for (int i = 0; i < count.length ; i++) {
//            while (count[i]>0){
//                numbers[j]=i;
//                j++;
//                count[i]--;
//            }
//
//        }
//    }
//
//    public static void TwoDArray(){
//        int smallest=Integer.MAX_VALUE;
//        Scanner Sc=new Scanner(System.in);
//        int matrix[][]=new int[3][3];
//        int n=matrix.length;
//        int m=matrix[0].length;
//        for (int i = 0; i <n ; i++) {
//            for (int j = 0; j <m ; j++) {
//                matrix[i][j]=Sc.nextInt();
//                smallest=Math.min(smallest,matrix[i][j]);
//            }
//        }
//        for (int i = 0; i <n ; i++) {
//            for (int j = 0; j <m ; j++) {
//
//                System.out.print(matrix[i][j]+" ");
//            }
//            System.out.println();
//        }
//
//        System.out.println("smallest Number="+ smallest);
//    }
//// sprial
//    public static void spiral(int[][] arr){
//        int startrow=0;
//        int endrow= arr.length-1;
//        int startcol=0;
//        int endcol=arr[0].length-1;
//        while (startrow<=endrow && startcol<=endcol){
//            //top
//            for (int i =startcol; i <=endcol ; i++) {
//                System.out.print  (arr[startrow][i]+" ");
//            }
//            //right
//            for (int i =startrow+1; i <=endrow ; i++) {
//                if(startrow==endrow){
//                    return;
//                }
//                System.out.print(arr[i][endcol]+" ");
//            }
//            //bottem
//            for (int i =endcol-1; i >=startcol ; i--) {
//                System.out.print(arr[endrow][i]+" ");
//
//            }
//            //left
//
//            for (int j =endrow-1; j >=startrow +1; j--) {
//                if (endrow==startrow){
//                    return;
//                }
//
//                System.out.print(arr[j][startcol]+" ");
//
//            }
//            startcol++;
//            startrow++;
//            endcol--;
//            endrow--;
//        }
//
//    }
//
//    public static void  sumToD(int arr[][]){
//        int sum1=0;
//        int sum2=0;
////        int count=1;
////        for (int i = 0; i <=arr.length-1; i++) {
////            for (int j = 0; j <=arr[0].length-1 ; j++) {
////                if (i==j){
////                    sum1+=arr[i][j];
////                }
////               if(i+j==arr.length-1 && i!=j){
////                   sum2+=arr[i][j];
////               }
////            }
////        }
////        int sum=sum1+sum2;
////        System.out.println(sum);
//        for (int i = 0; i < arr.length; i++) {
//            sum1+=arr[i][i];
//            if(i!=arr.length-1-i) {
//                sum1 += arr[i][arr.length - 1 - i];
//            }
//        }
//        System.out.println(sum1);
//
//    }
//    public static void main(String[] args) {
//       int arr[][]={ {1,2,3,11},
//                     {4,5,6,12},
//                     {7,8,9,13},
//                     {10,14,15,16}};
//       int[][] arrr={{1,2,3},{4,5,6},{7,8,9}
//       };
//       sumToD(arrr);
//
//   }

public static String uppercase(String name){
    StringBuilder sb=new StringBuilder();
    char ch=Character.toUpperCase(name.charAt(0));
    sb.append(ch);
    for (int i = 1; i <name.length() ; i++) {
        if (name.charAt(i)==' ' && i<name.length()-1){
            sb.append(name.charAt(i));
            i++;
            if (name.charAt(i)!=' ') {
                sb.append(Character.toUpperCase(name.charAt(i)));
            }
            else {
                i--;
            }
        }
        else{
            sb.append(name.charAt(i));
        }
    }
    return sb.toString();
}

public static void find(int[] arr ,int key){
int sum=0;
    for (int i = 0; i <arr.length ; i++) {
        for (int j = i+1; j <arr.length; j++) {
            sum=arr[i]+arr[j];
            if(sum==key){
                System.out.println("["+i+","+j+"]");
            }
        }
    }
    Scanner Sc=new Scanner(System.in);
    for (int i = 0; i < arr.length; i++) {
        arr[i]=Sc.nextInt();

    }

    }
    public static int removeDuplicates(int[] nums) {
        // Length of the updated array
        int count = 0;
        // Loop for all the elements in the array
        for (int i = 0; i < nums.length; i++) {
            boolean result=true;

            // If the current element is equal to the next element, we skip
            if (i < nums.length - 1 && nums[i] == nums[i + 1]) {
                result=false;
                continue;

            }
            // We will update the array in place
            if(result!=false){

            nums[count] = nums[i];
            count++;}

        }
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]+" ");
        }
        return count;
    }
public static void removeDuplicates1(int num[]){


    }


public static String comp(String str) {
    String newStr = "";
    for (int i = 0; i < str.length(); i++) {
        Integer count = 1;
        while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
            count++;
            i++;
        }
        newStr += str.charAt(i);
        if (count > 1) {
            newStr += count.toString();
        }

    }
    return newStr;
}
    public static void main(String[] args) {
     String str="a,d,d,d,g,h,h,h,s";
     comp(str);
        System.out.println(comp(str));


    }

        }








