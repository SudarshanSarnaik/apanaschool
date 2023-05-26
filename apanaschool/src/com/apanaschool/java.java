package com.apanaschool;
import java.util.*;

public class java {
    public static void main(String[] args) {
       Stack<Integer> s=new Stack<>();
       s.push(7);
       s.push(12);
       s.push(4);
       s.push(7);
       fun(s);
        System.out.println();
    }

    public static void fun(Stack stack1) {
        if (stack1.isEmpty()) {
            return ;
        }
        else {
            Stack s1 = new Stack();
            while (!stack1.isEmpty()) {
                s1.push(stack1.pop());
                s1.push(s1.pop() * s1.pop());
            }
        }
    }
}
