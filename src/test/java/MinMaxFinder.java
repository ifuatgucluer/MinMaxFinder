import java.util.Scanner;

    public class MinMaxFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan dizi boyutunu alma
        System.out.print("Kaç tane sayı girmek istiyorsunuz? ");
        int n = scanner.nextInt();

        int[] numbers = new int[n];
        System.out.println("Sayıları giriniz:");

        // Diziyi doldurma
        for (int i = 0; i < n; i++) {
            System.out.print((i + 1) + ". sayı: ");
            numbers[i] = scanner.nextInt();
        }

        // En büyük ve en küçük sayıyı bulma
        int max = numbers[0];
        int min = numbers[0];

        for (int num : numbers) {
            if (num > max) max = num;
            if (num < min) min = num;
        }

        // Sonuçları yazdırma
        System.out.println("En büyük sayı: " + max);
        System.out.println("En küçük sayı: " + min);

        scanner.close();
    }
}
