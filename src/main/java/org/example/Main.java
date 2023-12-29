package org.example;

public class Main {
    public static void main(String[] args) {
        String str = "ciao sono Claudio";
        lenghtOfString(str);

    }
    public static void lenghtOfString(String str) {
        if (str.length() > 10) {
            System.out.println("la stringa è piu lunga di 10 caratteri");
        } else if (str.length() < 10) {
            System.out.println("la stringa è piu corta di 10 caratteri");
        } else if (str.length() == 10) {
            System.out.println("la stringa è lunga 10 caratteri");
        }
    }
}
