package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int b = scanner.nextInt();
        UnaryOperator<Double> unaryOperator = a -> Math.sqrt(a);
        System.out.println(unaryOperator.sqrt(b));
    }


}
