package org.example;

public class Main {
    public static void main(String[] args) {
        Work obj = new Work();
        boolean res = obj.func(3, 18, 10, 8);

        String msg=res?"At least one sum aliquot to 2":"There are no aliquot values";
        System.out.println(msg);
    }
}