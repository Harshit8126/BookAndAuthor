package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no of book");
        int a = sc.nextInt();
        if (a==0) {
            System.out.println("N/A");
        }
        else{
            while(a-->0){
                sc.skip("\n");
                System.out.println("enter the book name");
                String b = sc.nextLine();
                System.out.println("enter the author name");
                String c = sc.nextLine();
                System.out.println("enter the ISBN no");
                String d = sc.nextLine();
                System.out.println("-------------------------------");
                System.out.println("Book name \t"+b);
                System.out.println("Author name : \t"+c);
                System.out.println("ISBN no : \t"+d);
                System.out.println("-------------------------------");
            }

        }
    }

}
