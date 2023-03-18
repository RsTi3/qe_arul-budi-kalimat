package Arul;

public class BasicProgramming {
        public static void main(String[] args) {

            int n = 5;
            printAsterisk(n);
            System.out.println();
            drawXYZ(5);

            // SOAL PRIORITAS 1

            // segitiga
            float alas = 20;
            float tinggi = 25;
            double luasSegitiga = 0.5 * (alas*tinggi);
            System.out.println("\nLuas Segitiga : " + luasSegitiga);

            // TODO: hitung luas segitiga

            // persegi panjang
            float panjang = 40;
            float lebar = 6;
            double luasPersegiPanjang = panjang * lebar;
            System.out.println("\nLuas Persegi Panjang : " + luasPersegiPanjang);

            //TODO: hitung luas persegi panjang

            // lingkaran
            double jari2 = 7;
            double luasLingkaran = 3.14 * (jari2*jari2);
            System.out.println("\nLuas Persegi Panjang : " + luasLingkaran);

            //TODO: hitung luas lingkaran


                    int hargaBeli = 15000;
                    int hargaJual = 30000;

            if (hargaBeli < hargaJual) {
                System.out.println("\nUntung! Dengan Keuntungan " + (hargaJual - hargaBeli));
            } else if (hargaBeli > hargaJual) {
                System.out.println("\nRugi :( Dengan Kerugian " + (hargaJual - hargaBeli));
            } else {
                System.out.println("\nSama saja.");
            }
        }

                    // TODO: cek apakah hasil penjualan mengalami keuntungan / kerugian


        public static void drawXYZ(int n) {
            //TODO: complete this code
            for (int i = 1; i <= n*n; i++){
                if (i%3 == 0) {
                    System.out.print("X");
                } else if (i%2 == 1) {
                    System.out.print("Y");
                } else {
                    System.out.print("Z");
                }
                if (i%n == 0){
                    System.out.println();
                }
            }
        }

        public static void printAsterisk(int n) {
            // TODO: complete this code
            for (int i=0; i<n; i++) {
                for (int j=n-i; j>1; j--) {
                    System.out.print(" ");
                }
                for (int j=0; j<=i; j++ ) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }

}
