package com.may29.multipleInheritance;



class OutPut2
{
    public static void main(String [] args)
    {
        Count3 count = new Count3();
        count.count();
    }
}

class Count1 extends Count3
{
    Count1()
    {

    }
}
class Count3
{
    void count()
    {
        int i = 5;
        System.out.print("Output = ");

        for (int x = 0; x <= (i % 7); x += 1)
        {
            System.out.print(" " + x);
        }
    }
}