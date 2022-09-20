/*
Nama : Muhamad Fathur Rahman
Nim  : 21343055
Prodi: Teknik Informatika
*/

package Tugas;

public class Tugas2 {
    public static void main (String[] args){
        int num1 = 10;
        int num2 = 23;
        int num3 = 5;

        int rumus = (num1 > num2) ? (num1 > num3 ? num1 : num3) : (num2 > num3 ? num2 : num3);

        System.out.println("Number 1 = " + num1);
        System.out.println("Number 2 = " + num2);
        System.out.println("Number 3 = " + num3);
        System.out.println("Nilai tertingginya adalah angka = " + rumus);
    }
}
