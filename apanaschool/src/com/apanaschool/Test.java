package com.apanaschool;

//Java code for using 'this' keyword to
    //refer current class instance variables
//output
//a = 10 b = 20
//        a = 23 b = 545
//        23
//        545

  public class  Test
    {
       static   int a;
       static int b;

        // Parameterized constructor
        Test(int c, int d)
        {
            this.a = c;
            this.b = d;
        }

        void display()
        {
            //Displaying value of variables a and b
            System.out.println("a = " + a + " b = " + b);
        }

        public static void main(String[] args)
        {
            Test object1 = new Test(10, 20);
            object1.display();
            Test Object2=new Test(35,355);

            Object2.display();
            System.out.println(a);
            System.out.println(b);
        }
    }


