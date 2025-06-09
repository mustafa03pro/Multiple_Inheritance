package com.may29.multipleInheritance;


class OutPut5
{
    public static void main(String args[])
    {
        int i = 2;
        B1 b = new B1();
       b.execute();
    }
}

class A1
{
    A1()
    {
        int i = 1;
    }
}

class B1 extends A1
{
    void execute()
    {
        System.out.println("i = " + i);
    }
}