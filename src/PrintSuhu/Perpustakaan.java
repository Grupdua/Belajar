package src.main.java;

import main.java.buku.Buku;

import java.util.Scanner;

public class Perpustakaan {
    public static void main(String[] args) {
        System.out.println("Welcome To Jakarta Library");
        boolean exit = true;
        Scanner scan = new Scanner(System.in);
        int method = 0;
        while (exit) {
            System.out.println("Choose Method");
            System.out.println("1. Add Buku");
            System.out.println("2. Show All Buku");
            System.out.println("2. Add Mahasiswa");
            System.out.println("3. Add Librarian");
            System.out.println("4. Add Rak Buku");
            System.out.println("5. Keluar");
            System.out.print("Method Number : ");
            method = scan.nextInt();

            switch (method) {
                case 1 :
                    System.out.println("Masukkan Id Buku : ");
                    String idBuku = scan.next();
                    System.out.println("Masukkan Nama Buku : ");
                    String namaBuku = scan.next();
                    System.out.println("Masukkan Penulis : ");
                    String penulis = scan.next();
                    System.out.println("Masukkan Penerbit : ");
                    String penerbit = scan.next();
                    System.out.println("Masukkan Harga Buku : ");
                    int harga = scan.nextInt();
                    System.out.println("Masukkan Jumlah Halaman : ");
                    int jumlahHalaman = scan.nextInt();
                    System.out.println("Masukkan Covered : ");
                    String covered = scan.next();
                    System.out.println("Masukkan Jumlah Buku : ");
                    int jumlahBuku = scan.nextInt();
                    boolean isAvailable = true;
                    Buku buku = new Buku(idBuku, namaBuku, penulis, penerbit, harga, jumlahHalaman, covered, isAvailable, jumlahBuku);
                    Buku.addBuku(buku);
                    System.out.println("Buku berhasil ditambahkan");
                    break;
                case 5:
                    System.out.println("Berikut list buku yang telah ditambahkan: ");
                    Buku.showAllBuku();
                    break;
                case 8:
                    exit = true;
                    break;
            }
        }
    }
}
