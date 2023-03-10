/* NIM	: 13020210093
   Nama	: Rahma Puspitasari
   Hari/Tanggal : Jum'at 02 Maret 2023
   Waktu Pengerjaan : 17.02 */

/* pemakaian beberapa operator terhadap RELATIONAL DAN bit */
public class Oper2 {

	public static void main (String[] args) {
		//TODO Auto-generated method stub
		/* KAMUS */
		char i, j;

		/* ALGORITMA */
			i = 3;	/* 00000011 dalam binner */
			j = 4;	/* 00000100 dalam binner*/

			System.out.println("i = "+ (int) i);
			System.out.println("j = "+ j);
			System.out.println("i & j = "+ (i & j));
			/* 0 : 00000000 dalam biner */
			
			System.out.println("i | j = "+ (i | j));
			/* 7 : 00000111 biner */

			System.out.println("i ^ j = "+ (i ^ j));
			/* 7 : 00000111 biner Ingat!!! operator "^" pada bahasa pada java bukan pangkat*/

			System.out.println(Math.pow(i, j));
			/* Class Math memiliki method pow(a,b) untuk pemangkatan*/

			System.out.println("~i = "+ ~i);
			/* -4: 11111100 biner */
			


	}



}