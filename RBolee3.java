package com.company;//Программа, вычисляющая число слов в произвольном текстовом файле, каждое из которых содержит не менее трех символов 'r'.
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
public class RBolee3 {
    public static void main(String[] args) throws Exception {
        /*FileReader fr = new FileReader("C:\\Users\\User\\Desktop\\Новая папка\\Text.txt");
        //Scanner scan = new Scanner(fr);
        //String text = new String();
        int R = 0;
        int data = fr.read();
        while(data != -1) {
            data = fr.read();
            System.out.println("%d", data);
        }
        fr.close();*/
        FileInputStream file = new FileInputStream("C:\\Users\\User\\Desktop\\Новая папка\\Text.txt");
        byte[] str = new byte[file.available()];
        file.read(str);
        String text = new String(str);
        int n = 0;
        int r = 0;
        for (int i = 0; i < text.length(); i++) {
            if ((text.charAt(i) == 'r') && (text.charAt(i) != ' ')) {
                r++;
            }
            if (text.charAt(i) == ' ' || text.charAt(i) == '\n') {
                if (r >= 3) {
                    n++;
                    r = 0;
                }
                else {
                    r = 0;
                }
            }
        }
        if (r >= 3) {
           n++;
        }
        //if (n != 0) {
            System.out.println("Количество слов содержащих более 3-х 'r' = " + n);
        //}
        /*if (n == 0){
            System.out.println("Нет слов содержащих 3 'r' ");
        }*/
    }
}
