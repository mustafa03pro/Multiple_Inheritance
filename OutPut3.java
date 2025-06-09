package com.may29.multipleInheritance;


class OutPut3
{
    public static void main(String [] args)
    {
        Count4 count = new Count4();
        count.count5();
    }
}

class Count5 extends Count4
{
    Count5()
    {

    }
}
class Count4
{
    void count5()
    {
        int i = 5;
        System.out.print("Output = ");

        for (int x = 0; x <= (i % 7); x += 1)  //i=6 7  x =1
        {
            System.out.print(" " + x); //0 1
            i++;
        }
    }
}