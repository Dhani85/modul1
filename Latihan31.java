import java.util.Scanner;

public class Latihan31{

  public static void main (String[] args){
    Scanner scan = new Scanner(System.in);
    System.out.print("Nomor Induk Mahasiswa : ");
    String input1 = scan.nextLine();
    String Str = new String(input1);
    String kode = Str.substring(0,3);
    String tahun = Str.substring(4,8);
    String no = Str.substring(9,14);
    System.out.print("Nama Lengkap : ");
    String input2 = scan.nextLine();
    System.out.print("Alamat Tinggal Mahasiswa : ");
    String input3 = scan.nextLine();
    System.out.print("Alamat Asal Mahasiswa : ");
    String input4 = scan.nextLine();
    System.out.print("No. Telp / HP : ");
    String input5 = scan.nextLine();
    System.out.print("Jenis Kelamin : ");
    char input6 = scan.next().charAt(0);

    System.out.println(" ");
    System.out.println("NIM : "+input1);

    if (kode.equals("A11")){
      System.out.println("Program Studi : Tehnik Informatika (S1)");
    } else if (kode.equals("A12")){
      System.out.println("Program Studi : Sistem Informasi (S1)");
    } else if (kode.equals("A13")){
      System.out.println("Program Studi : Tehnik Informatika (D3)");
    } else if (kode.equals("A14")){
      System.out.println("Program Studi : Sistem Informasi (D3)");
    }
     
    System.out.println("Tahun Masuk : "+tahun);
    System.out.println("No Urut : "+no);
    System.out.println("Nama : "+input2);
    System.out.println("Alamat Tinggal : "+input3);
    System.out.println("Alamat Asal : "+input4);
    System.out.println("Telp/HP : "+input5);
    System.out.println("Jenis Kelamin : "+input6);
 }
}