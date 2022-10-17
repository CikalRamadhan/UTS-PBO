package Java;

import java.util.Scanner;

public class UTS_soal3 {
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args){
        int [] array1 = new int[10];

        int number;
        int total = 10;
        for(int i = 0; i<10; i++){
            System.out.print(" Masukkan Inputan : ");
            number = s.nextInt();
            array1[i]=number;
            total = total + array1[i];
        }

        int average =total /10;
        System.out.println(average + " Average ");
    }

}