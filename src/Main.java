import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Kuvveti alınacak sayıyı giriniz:");
        int num = in.nextInt();
        System.out.println("kuvvet değerini giriniz:");
        int pow = in.nextInt();
        System.out.println( num + " sayısının "+ pow + " kuvveti : " + pow(num, pow));
    }
    static int pow(int n, int r)
    {
        if (r != 1)
        {
           n*= pow(n, r-1);
        }
        return n;
    }
}