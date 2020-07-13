package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {
    public void enterNum() {


    }

    public static void check() {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter number");
            int num = sc.nextInt();


        } catch (InputMismatchException e){
            System.out.println("Error");
            check();
        }
    }
}
