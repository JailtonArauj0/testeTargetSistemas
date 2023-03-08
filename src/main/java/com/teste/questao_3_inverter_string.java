package com.teste;

import java.util.ArrayList;

public class questao_3_inverter_string {
    public static void main(String[] args) {

        String str = "Target Sistemas";
        char[] charArray = str.toCharArray();
        int i = 0;
        int j = charArray.length - 1;
        while (j > i) {
            char temp = charArray[i];
            charArray[i] = charArray[j];
            charArray[j] = temp;
            i++;
            j--;
        }
        String stringReversa = new String(charArray);
        System.out.println(stringReversa);
    }
}
