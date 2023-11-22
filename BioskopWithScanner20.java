import java.util.Scanner;

public class BioskopWithScanner20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int baris, kolom;
        String nama, next;

        String[][] penonton = new String[4][2];
        for (int i = 0; i > -1; i++) {
            System.out.print("Pilih Menu = \n1.Input data penonton\n2.Tampilkan daftar penonton\n3.Exit\nPilihan : ");
            int pilihmenu = sc.nextInt();
            if (pilihmenu == 1) {
                while (true) {
                    System.out.print("Masukkan nama: ");
                    nama = sc.next();
                    System.out.print("Masukkan baris: ");
                    baris = sc.nextInt();
                    System.out.print("Masukkan kolom: ");
                    kolom = sc.nextInt();
                    sc.nextLine();

                    if (baris > 4 || kolom > 2) {
                        System.out.println("Baris tidak tersedia");
                        continue;
                    }

                    if (penonton[baris - 1][kolom - 1] != null) {
                        System.out.println( "============= WARNING =============\nKursi sudah terisi oleh penonton lain, silahkan masukkan lagi !");
                        continue;
                   
                    }

                    penonton[baris - 1][kolom - 1] = nama;

                    System.out.print("input penonton lainnya? (y/n): ");
                    next = sc.nextLine();

                    if (next.equalsIgnoreCase("n")) {
                        break;
                    }
                }

            } else if (pilihmenu == 2) {
                for (int j = 0; j < penonton.length; j++) {
                    for (int j2 = 0; j2 < penonton[j].length; j2++) {
                        if (penonton[j][j2] == null) {
                            penonton[j][j2] = "***";
                        }
                        System.out.println("Penonton pada baris ke " + (j + 1) + " deret ke " + (j2 + 1) + " adalah "
                                + penonton[j][j2]);
                    }
                }
            } else if (pilihmenu == 3) {
                break;
            }
        }
    }
}
// while (true) {
// System.out.print("Masukkan nama: ");
// nama = sc.nextLine();
// System.out.print("Masukkan baris: ");
// baris = sc.nextInt();
// System.out.print("Masukkan kolom: ");
// kolom = sc.nextInt();
// sc.nextLine();

// penonton[baris-1][kolom-1] = nama;

// System.out.print("input penonton lainnya? (y/n): ");
// next = sc.nextLine();

// if (next.equalsIgnoreCase("n")) {
// break;
// }
// for (int j = 0; j < penonton.length; j++) {
// if (penonton[j][0] == null) {
// penonton[j][0] = "***";
// }
// }
// System.out.println(penonton[0][0]);
// System.out.println(penonton[0][1]);
// System.out.println(penonton[1][0]);
// System.out.println(penonton[1][1]);
// System.out.println(penonton[2][0]);
// System.out.println(penonton[2][1]);
// System.out.println(penonton[3][1]);

// System.out.print("Pilih Menu = \n1.Input data penonton\n2.Tampilkan daftar
// penonton\n3.Exit\nPilihan : ");
// int pilihmenu = sc.nextInt();
// if (pilihmenu == 1) {
// while (true) {
// System.out.print("Masukkan nama: ");
// nama = sc.next();
// System.out.print("Masukkan baris: ");
// baris = sc.nextInt();
// System.out.print("Masukkan kolom: ");
// kolom = sc.nextInt();
// sc.nextLine();

// penonton[baris - 1][kolom - 1] = nama;

// System.out.print("input penonton lainnya? (y/n): ");
// next = sc.nextLine();

// if (next.equalsIgnoreCase("n")) {
// break;
// }
// }

// } else if (pilihmenu == 2) {
// for (int i = 0; i < penonton.length; i++) {
// System.out.println(penonton[i]);
// }
// }
