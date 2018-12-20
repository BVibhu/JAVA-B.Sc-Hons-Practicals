

import java.util.Scanner;

public class prog9 {

    public static void main(String[] args) {

        Double inches;

        Scanner in = new Scanner(System.in);

        System.out.println("please enter inches:");
        inches = in.nextDouble();

        double feet = inches / 12;

        System.out.println(feet + " feet");

    }}

