package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Encryption encrpt = new Encryption();
        Decryption deccrpt = new Decryption();

        System.out.println("Put the text:");
        String text = sc.nextLine();

        System.out.println("Put the key:");
        int key = sc.nextInt();

        System.out.println("Do you want to encrypt or decrypt the message?");
        System.out.println("1. Encrypt");
        System.out.println("2. Decrypt");
        int v = sc.nextInt();

        switch(v){
            case 1:
                encrpt.encryption(text,key);
                break;
            case 2:
                deccrpt.decryption(text,key);
                break;
            default:
                System.out.println("Wybrano nie poprawną wartość");
        }
    }
}
