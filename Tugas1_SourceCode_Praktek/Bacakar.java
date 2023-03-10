/* NIM	: 13020210093
   Nama	: Rahma Puspitasari
   Hari/Tanggal : Kamis 02 Maret 2023
   Waktu Pengerjaan : 18.30   */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.Scanner;	/* import package class Scanner */
import javax.swing.*;		/* import package class  JOptionPane*/
import java.io.*;		/* import package class console*/

public class Bacakar {

	public static void main(String[] args) throws IOException {
		//TODO Auto-generated method stub

		/* Kamus */
		char cc; int bil;
		
		InputStreamReader isr = new
		InputStreamReader(System.in);
		BufferedReader dataIn = new BufferedReader(isr);
		// atau
		BufferedReader datAIn = new BufferedReader(new InputStreamReader(System.in));
		
		/* Algoritma */
		System.out.print ("hello\n");
		System.out.print("baca 1 karakter : ");

		// perintah baca karakter cc
		cc =dataIn.readLine().charAt(0);
		System.out.print("baca 1 bilangan : ");

		// perintah baca bil
		bil =Integer.parseInt(datAIn.readLine());
		

		/* String kar = JOptionPane.showInputDialog("Karakter 1 : ");System.out.println(kar);*/


		System.out.print (cc +"\n" +bil+"\n");
		
		/* Tambahkan program membaca / input data menggunakan Class Scanner,Class Console dan Class JOptionPane */	
		
		// program membaca/input data menggunakan Class Scanner
		System.out.println("\nBerikut adalah penggunaan Class Scanner");
		System.out.println("Masukkan Nilai : ");
		Scanner masukan = new Scanner(System.in);
		int a = masukan.nextInt();
		System.out.println("Nilai yang dimasukkan adalah : "+a);

		// program membaca/input data menggunakan Class Console
		System.out.println("\nBerikut adalah penggunakan Class Console");
		System.out.println("Masukkan nilai : ");
		Console input = System.console();
		String b= input.readLine();
		System.out.println("Nilai yang dimasukkan adalah : "+b);

		// program membaca/input data menggunakan Class JOptinPane
		JOptionPane.showMessageDialog(null,"Hello, \nBerikut adalah penggunaan Class JOptionPane");
		String kar = JOptionPane.showInputDialog("Masukkan karakter : ");
		System.out.println("\nBerikut adalah penggunaan Class JOptionPane \nkarakter yang baru saja dimasukkan : "+kar);


		System.out.print ("bye \n");

	}



}