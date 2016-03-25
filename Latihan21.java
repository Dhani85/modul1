import java.util.Scanner;
import java.util.Calendar;

public class Latihan21 {

  public static void main(String... args) {
    Calendar cal = Calendar.getInstance();
    System.out.print("Masukan Nomor Induk Pegawai : ");
    Scanner scan = new Scanner(System.in);
    String input1 = scan.nextLine();
    String Str = new String(input1);
    int y = Integer.parseInt(Str.substring(7,11));
    System.out.print("Nama Lengkap : ");
    String input2 = scan.nextLine();
    //System.out.print("Usia : ");
    int year = cal.get(Calendar.YEAR);
    int input3 = (year-y); //scan.nextInt();
    System.out.print("Jenis Kelamin : ");
    char input4 = scan.next().charAt(0);
    System.out.print("Nilai IPK : ");
    double input5 = scan.nextDouble();
    System.out.println(" ");
    System.out.println("NIP : "+input1);
    System.out.println("Nama : "+input2);
    System.out.println("Umur : "+input3);
    System.out.println("Jenis Kelamin : "+input4);
    System.out.println("IPK : "+input5);
  }
}