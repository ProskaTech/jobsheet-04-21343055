/*
Nama : Muhamad Fathur Rahman
Nim  : 21343055
Prodi: Teknik Informatika
*/

package Latihan;

public class kondisiOperator {
    public static void main(String[] args){
        String status ="";
        int grade = 50;

        //mendapatkan status pelajar
        status = (grade >= 60) ? "Passed" : "Fail";
        
        //print status
        System.out.println(status);
    }
}
