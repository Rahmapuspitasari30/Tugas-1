/* NIM	: 13020210093
   Nama	: Rahma Puspitasari
   Hari/Tanggal : Kamis 02 Maret 2023
   Waktu Pengerjaan : 18.30   */


import java.util.Scanner;

/* contoh membaca integer menggunakan Class Scanner*/
   public class BacaData {

	public static void main (String[] args) {
		//TODO Auto-generated method stub
		/* Kamus */
		int a;
		Scanner masukkan;
		/* Program */
		System.out.print ("Contoh membaca dan menulis,ketik nilai integer: \n");
		masukkan = new Scanner (System.in);
		a = masukkan.nextInt(); /* coba ketik :masukan.nextInt(); Apa akibatnya ?*/
		System.out.print ("Nilai yang dibaca : "+a);


	}



}