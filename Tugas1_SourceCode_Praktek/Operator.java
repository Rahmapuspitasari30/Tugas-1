/* NIM	: 13020210093
   Nama	: Rahma Puspitasari
   Hari/Tanggal : Jum'at 02 Maret 2023
   Waktu Pengerjaan : 17.23 */

/* contoh pengoprasian variabel bertype dasar */

public class Operator {

	public static void main (String [] args) {
		//TODO Auto-generated method stub
		/* Kamus */
			boolean Bool1, Bool2, TF ;
			int i,j, hsl;
			float x,y,res;
		/* algoritma */
			System.out.println("Silahkan baca teksnya dan tambahkan perintah program di bawah ini untuk menampilkan output program");
			
			Bool1 = true; Bool2 = false;
			System.out.println("TF = Bool1 && Bool2 = "+(Bool1 && Bool2)) ;	/* Boolean AND */
			System.out.println("TF = Bool1 || Bool2 = "+(Bool1 || Bool2));	/* Boolean QR*/
			System.out.println("TF = ! Bool1	= "+ (!Bool1));		/* NOT */
			System.out.println("TF = Bool1 ^ Bool2	= "+(Bool1 ^ Bool2));	/* XOR */

			System.out.println("\nOperasi numerik dengan operator aritmatika");
			i = 5; 
			j = 2;
			System.out.println("hsl = i + j = "+(i + j));
			System.out.println("hsl = i - j = "+(i - j));
			System.out.println("hsl = i / j = "+(i / j));
			System.out.println("hsl = i * j = "+(i * j));
			System.out.println("hsl = i / j = "+(i * j));	/* pembagian bulat */
			System.out.println("hsl = i % j = "+(i % j)); 	/* sisa modulus */

			System.out.println("\nOperasi numerik dengan operator aritmatika");
			x = 5 ; 
			y = 5 ;
			System.out.println("res = x + y = "+ (x + y));
			System.out.println("res = x - y = "+ (x - y));
			System.out.println("res = x / y = "+ (x / y));
			System.out.println("res = x * y = "+ (x * y));

			System.out.println("\nOperasi relasional numerik dengan operator perbandingan");
			System.out.println("TF = (i==j)= " + (i==j));
			System.out.println("TF = (i!=j)= " + (i!=j));
			System.out.println("TF = (i < j)= "+ (i < j));
			System.out.println("TF = (i > j)= "+ (i > j));
			System.out.println("TF = (i <= j)= "+ (i <=j));
			System.out.println("TF = (i >= j)= "+ (i >=j));

			System.out.println("\nOperasi relasional numerik dengan operator perbandingan" );
			System.out.println("TF = (x != y)= "+ (x != y));
			System.out.println("TF = (x < y)= "+ (x < y));
			System.out.println("TF = (x > y)= "+ (x > y));
			System.out.println("TF = (x <= y)= "+(x <= y));
			System.out.println("TF = (x >= y)= "+(x >= y)); 


	}




}