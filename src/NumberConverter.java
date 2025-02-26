import java.util.Scanner;

public class NumberConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("===== Konversi Bilangan =====");
            System.out.println("1. Integer ke Biner");
            System.out.println("2. Integer ke Oktal");
            System.out.println("3. Integer ke Hexadecimal");
            System.out.println("4. Biner ke Integer");
            System.out.println("5. Oktal ke Integer");
            System.out.println("6. Hexadecimal ke Integer");
            System.out.println("7. Biner ke Oktal");
            System.out.println("8. Biner ke Hexadecimal");
            System.out.println("9. Keluar");
            System.out.print("Pilih opsi: ");
            choice = scanner.nextInt();

            if (choice == 1) {
                System.out.print("Masukkan Integer: ");
                int decimal = scanner.nextInt();
                String binary = "";
                while (decimal > 0 || binary.length() < 8) {
                    binary = (decimal % 2) + binary;
                    decimal = decimal / 2;
                }
                System.out.println("Hasil Biner: " + binary);
            } else if (choice == 2) {
                System.out.print("Masukkan Integer: ");
                int decimal = scanner.nextInt();
                String octal = "";
                while (decimal > 0) {
                    octal = (decimal % 8) + octal;
                    decimal = decimal / 8;
                }
                System.out.println("Hasil Oktal: " + octal);
            } else if (choice == 3) {
                System.out.print("Masukkan Integer: ");
                int decimal = scanner.nextInt();
                String hex = "";
                char[] hexChars = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
                while (decimal > 0) {
                    hex = hexChars[decimal % 16] + hex;
                    decimal = decimal / 16;
                }
                System.out.println("Hasil Hexadecimal: " + hex);
            } else if (choice == 4) {
                System.out.print("Masukkan Biner: ");
                String binary = scanner.next();
                int decimal = 0;
                for (int i = 0; i < binary.length(); i++) {
                    decimal = decimal * 2 + (binary.charAt(i) - '0');
                }
                System.out.println("Hasil Integer: " + decimal);
            } else if (choice == 5) {
                System.out.print("Masukkan Oktal: ");
                String octal = scanner.next();
                int decimal = 0;
                for (int i = 0; i < octal.length(); i++) {
                    decimal = decimal * 8 + (octal.charAt(i) - '0');
                }
                System.out.println("Hasil Integer: " + decimal);
            } else if (choice == 6) {
                System.out.print("Masukkan Hexadecimal: ");
                String hex = scanner.next();
                int decimal = 0;
                for (int i = 0; i < hex.length(); i++) {
                    char hexChar = hex.charAt(i);
                    int hexValue;
                    if (hexChar >= '0' && hexChar <= '9') {
                        hexValue = hexChar - '0';
                    } else {
                        hexValue = hexChar - 'A' + 10;
                    }
                    decimal = decimal * 16 + hexValue;
                }
                System.out.println("Hasil Integer: " + decimal);
            } else if (choice == 7) {
                System.out.print("Masukkan Biner: ");
                String binary = scanner.next();
                int decimal = 0;
                for (int i = 0; i < binary.length(); i++) {
                    decimal = decimal * 2 + (binary.charAt(i) - '0');
                }
                String octal = "";
                while (decimal > 0) {
                    octal = (decimal % 8) + octal;
                    decimal = decimal / 8;
                }
                System.out.println("Hasil Oktal: " + octal);
            } else if (choice == 8) {
                System.out.print("Masukkan Biner: ");
                String binary = scanner.next();
                int decimal = 0;
                for (int i = 0; i < binary.length(); i++) {
                    decimal = decimal * 2 + (binary.charAt(i) - '0');
                }
                String hex = "";
                char[] hexChars = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
                while (decimal > 0) {
                    hex = hexChars[decimal % 16] + hex;
                    decimal = decimal / 16;
                }
                System.out.println("Hasil Hexadecimal: " + hex);
            } else if (choice == 9) {
                System.out.println("Keluar dari program.");
            } else {
                System.out.println("Pilihan tidak valid.");
            }
            System.out.println();
        } while (choice != 9);
        scanner.close();
    }
}