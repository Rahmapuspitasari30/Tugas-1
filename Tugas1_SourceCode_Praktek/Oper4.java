/* NIM	: 13020210093
   Nama	: Rahma Puspitasari
   Hari/Tanggal : Jum'at 02 Maret 2023
   Waktu Pengerjaan : 17.23 */

/*	operator terner */
public class Oper4 {

	public static void main (String [] args) {
		//TODO Auto-generated method stub
		  /* KAMUS */
	
		int i = 0;	/* perhatikan int i,j=0 bukan seperti ini */
		int j = 0;	
	
		char c = 8; char d = 10;
		int e = (((int) c > (int)d) ? c : d);
		int k = ((i>j) ? i : j);
		/* ALGORITMA */

		System.out.println ("Nilai e = "+ e);
		System.out.println("\nNilai k = "+ k);
		i = 2;
		j = 3;
		k = ((i++>j++) ? i: j) ;
		System.out.print ("\nNilai k = "+ k);

	}



}