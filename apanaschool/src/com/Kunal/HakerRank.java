package com.Kunal;
import java.util.Scanner;
public class HakerRank {
//    public static void main(String[] args) {
////        Scanner sc=new Scanner(System.in);
//        int num[]={-1,0,1,2,-1,-4};
//       int sum=0;
////        for (int i = 0; i < num.length ; i++) {
////            num[i]=sc.nextInt();
////        }
//        System.out.println("[");
//        for (int i = 0; i < num.length ; i++) {
//            for (int j = i; j < num.length; j++) {
//                if (j!=i){
//                    for (int k = j; k < num.length ; k++) {
//                        if(k!=i && k!=i){
//                            sum=num[i]+num[j]+num[k];
//                            if(sum==0){
//                                System.out.println("["+num[i]+","+num[j]+","+num[k]+"]");
//                            }
//                        }  //-1,0,1,2,-1,-4
//                    }
//                }
//            }
//
//        }
//        System.out.println("]");
//
//    }
    public static boolean palindrom(String name){
        int  Start=0;
        int end=name.length()-1;
        while(Start<=end){
            if(name.charAt(Start)==name.charAt(end)){
                Start++;
                end--;
            }
            else {
                return false;
            }
        }
        return true;

//        main part of this question
//        if(palindrom(name)){
//            System.out.println("Name Is In Palindrom");
//        }
//        else {
//            System.out.println("Name is not in Palindrom");
//        }
    }
    public static float distance( String Path){
        int x=0;
        int y=0;
        for (int i = 0; i <Path.length(); i++) {
            char dir =Path.charAt(i);
        if(dir =='N'){
            y++;
        }
        else if (dir =='S'){
            y--;
        }
        else if (dir =='W'){
            x--;
        }
        else {
            x++;
        }
        }
        int X2=x*x;
        int Y2=y*y;
        return (float)Math.sqrt(X2+Y2) ;
    }
    public static String compr(String str){

      String newstr="";
        for (int i = 0; i <str.length() ; i++) {
            Integer count =1;
            while (i<str.length()-1  && str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;
            }
            newstr +=str.charAt(i);
            if(count>1){
               newstr +=count.toString();
            }

        }
        return  newstr;
    }
    public static void main(String[] args) {
        String str="a,a,a,a,f,f,h,h,h,b,c,d";
        System.out.println(compr(str));;
    }
}





////extr code


//package com.Kunal;
//        import java.util.Arrays;
//        import java.util.Scanner;
//        import java.lang.*;
//class solution {
//       int[] arr={1,1,1,0,0,1};
//       int count=0;
//       int name;
//        for (int i = 0; i <arr.length ; i++) {
//            if(count>)
//            if(arr[i]==1){
//                 count+=1;
//            }
//            else{
//                name=count;
//
//            }
//            if(count<name){
//                count=0;
//            }
//
//        }
//        System.out.println(count);
//
//    public static void main (String[] args) throws java.lang.Exception {
//        try {
//
//            Scanner Sc = new Scanner(System.in);
//            int t=Sc.nextInt();
//            for (int i = 0; i <t ; i++) {
//
//
//                int X = Sc.nextInt();
//                int Y = Sc.nextInt();
//                int Gmax = Math.max(X, Y);
//                int Gmin = Math.min(X, Y);
//
//                int sub = Gmax - Gmin;
//                System.out.println(sub);
//            }
//        } catch (Exception e){
//            return;
//        }
//
//
//    }
//
//
// }


