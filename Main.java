import java.util.Scanner;

public class Main {
    static void hitungluaspersegi(int a, int b){
        System.out.println("Luas Persegi panjang"+(a*b));

    }
    static int hitungkubus(int sisi){
        int hasil = sisi*sisi;
        return hasil;
    }

    static void showarray(int daftarangka[]){
        for (int i = 0; i < daftarangka.length-1; i++) {
            System.out.print(daftarangka[i]+ " ");

        }
    }
    static void rekursif  (int bilangan){
        if (bilangan == 1 )
            System.out.println(bilangan);
            else{
                System.out.print(bilangan+ " ");
                rekursif(bilangan-1);
            }
        }
    public static void main(String[] args) {
	int pilih, a, b, c;
        Scanner scan = new Scanner(System.in);
        System.out.println(" Rumus ");
        System.out.println("==========");
        System.out.println("1. persegi panjang");
        System.out.println("2. kubus");
        System.out.println("3. daftar angka");
        System.out.println(" pilih yang mana "); pilih = scan.nextInt();
        switch ( pilih){
        case 1:
        System.out.println("rumus persegi");
        System.out.println("Masukan Panjang");
        int panjang = scan.nextInt();
        System.out.println("Masukan Lebar ");
        int lebar = scan.nextInt();
        hitungluaspersegi(panjang, lebar);
        break;
        case 2:
        System.out.println("Kubus");
        int kubus = hitungkubus (9);
        System.out.println(" kubus " + hitungkubus(10));
        break;
            case 3:
                int array[] = {1,2,3,4,5,6,7,8,9};
                showarray(array);
                break;
            case 4:
                int rekursif = 10 ;
                rekursif(rekursif);
                break;

    }




    }
}
