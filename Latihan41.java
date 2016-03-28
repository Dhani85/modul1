import java.util.Scanner;
import java.util.ArrayList;

public class Latihan41 
{
 public static Scanner input = new Scanner(System.in);
 public static ArrayList<String> daftar = new ArrayList<>();
 public static Scanner scan = new Scanner(System.in);
  
 public static void entridata()
 {
  System.out.println(" ");
  System.out.print("Nomor Induk Mahasiswa : ");
  String input1 = scan.nextLine();
  daftar.add(input1);

  String Str = new String(input1);
  String kode = Str.substring(0,3);
  daftar.add(kode);

  String tahun = Str.substring(4,8);
  daftar.add(tahun);

  String no = Str.substring(9,14);
  daftar.add(no);

  System.out.print("Nama Lengkap : ");
  String input2 = scan.nextLine();
  daftar.add(input2);

  System.out.print("Alamat Tinggal Mahasiswa : ");
  String input3 = scan.nextLine();
  daftar.add(input3);

  System.out.print("Alamat Asal Mahasiswa : ");
  String input4 = scan.nextLine();
  daftar.add(input4);

  System.out.print("No. Telp / HP : ");
  String input5 = scan.nextLine();
  daftar.add(input5);

  System.out.print("Jenis Kelamin : ");
  String input6 = scan.nextLine();
  daftar.add(input6);
 }

 public static void caridata()
 {
  System.out.println(" ");
  System.out.print("Masukan NIM  : ");	
  String nm = scan.next();
  System.out.println(" ");	
  for (String name : daftar) 
  {
   if (name.equals(nm))			
     System.out.println("N I M  : " + input);

     if (name.equals("A11"))
        {
         System.out.println("Program Studi : Tehnik Informatika (S1)");
        } 
     else if (name.equals("A12"))
        {
         System.out.println("Program Studi : Sistem Informasi (S1)");
        } 
     else if (name.equals("A13"))
        {
         System.out.println("Program Studi : Tehnik Informatika (D3)");
        } 
     else if (name.equals("A14"))
        {
         System.out.println("Program Studi : Sistem Informasi (D3)");
        }

     //System.out.println("Tahun Masuk : "+name);
     //System.out.println("No Urut : "+name);
     //System.out.println("Nama : "+name);
     //System.out.println("Alamat Tinggal : "+name);
     //System.out.println("Alamat Asal : "+name);
     //System.out.println("Telp/HP : "+name);
     //System.out.println("Jenis Kelamin : "+name);	
   else	
     System.out.println(name);
  }
 }

 public static void main(String[] args) 
 {
  int pilih;
  do
   {
    System.out.println("\nMENU");
    System.out.println(" ");
    System.out.println("1.Entry Data Mahasiswa");
    System.out.println("2.Cari Data Mahasiswa");
    System.out.println("3.Keluar/Exit");
    System.out.print("Masukkan Pilihan Anda : ");
    pilih =input.nextInt();
    switch(pilih)   
    {
     case 1 : entridata();
              break;
     case 2 : caridata();
              break;
     case 3 : break;
    }
     System.out.println(" ");
   }
   while ((pilih!=3)||(pilih>3));
   System.out.println("Terima Kasih!!!");
 }
}
