package lab2;

import java.util.*;

class Q2
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number");
        int n=s.nextInt();
        
        int l = (""+n).length();
        int sq=n*n;
        int end = sq % (int)Math.pow(10,l);
        
        if(n==end)
            System.out.println("It is Automorphic Number");
        else
            System.out.println("It is not Automorphic Number");
    }
}
