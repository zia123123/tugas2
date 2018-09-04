package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// pertama masukan variable variable untuk volume prisma
        int tinggialas;
        int panjangalas;
        double a;
        double luasalas;
        int volume;
        int tinggiPrisma;

        a = 0.5;
        Scanner scan = new Scanner(System.in);
        System.out.print("Menghitung Volume\n");
        System.out.print("Masukan Tinggi Alas :");
        tinggialas = scan.nextInt();
        System.out.print("Masukkan Panjang Alas :");
        panjangalas = scan.nextInt();
        System.out.print("Masukkan Tinggi Prisma :");
        tinggiPrisma = scan.nextInt();


        luasalas = ( a*tinggialas*panjangalas );
        System.out.print("Volume Prisma = " + luasalas*tinggiPrisma);
    }
}
