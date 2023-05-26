package com.Kunal;
public class Sudarshan {

//    find even or odd;
public static void evenorodd(int n){
    int bitmask=1;
    if((n&bitmask)==0){
        System.out.println("Number is Even");
    }
    else {
        System.out.println("Number is odd");
    }
}
// find getbit
public static int  getbit(int n, int i) {
    int bitmask=1<<i;
    if( (n&bitmask)==0){
        return  0;
    }else {
        return 1;
    }
    }

    // find set bit;
    public static int setit(int n ,int i){
        int bitmask=1<<i;
        return  n | bitmask;


    }
    public static int clear(int n, int i){
    int bitmask=~(1<<i);
    return n & bitmask;
    }
    public static int clearIbits(int n,int i){
    int bitmask=~(0)<<i;
    return  n&bitmask;
    }

    public static void main(String[] args) {

        System.out.println(clearIbits(7,2));

    }
}
