package com.company;
//Программа, которая вычисляет количество символов 'r' в произвольном файле.
import java.io.IOException;
import java.io.FileInputStream;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
        FileInputStream file = new FileInputStream("C:\\Users\\User\\Desktop\\Новая папка\\Text.txt");
        byte[] str = new byte[file.available()];
        file.read(str);
        String text = new String(str);
        int cout = 0;
        for(int i = 0; i < str.length; i++) {
            if(text.charAt(i) == 'r') {
                cout++;
            }
        }
        if (cout == 0) {
            System.out.println("Нет'r'.");
        }
        else {
            System.out.println("Количество 'r'" + cout);
        }
    }
}

