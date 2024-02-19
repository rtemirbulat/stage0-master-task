package com.epam.langSyntax;

public class NumberReverter {

    public void revert(int number) {
        String s = String.valueOf(number);
        StringBuilder s2 = new StringBuilder(s).reverse();
        System.out.println(s2);
    }

}
