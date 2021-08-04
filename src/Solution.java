import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
        int koll = 0;
        boolean x = false;
        do {
            x = false;
            try {
                Scanner input = new Scanner(System.in);
                System.out.print("Введите число страниц ");
                koll = input.nextInt();
                if (koll % 4 != 0) {
                    x = true;
                    System.out.println("Введите число которое делится на 4.");
                }
            } catch (Exception e) {
                System.out.println("Error");
                x = true;
            }
        } while (x);
        int[] mass = new int[koll];
        for (int i = 1; i <= koll; i++) {
            mass[i - 1] = i;
        }
        int[] array1 = new int[koll / 2];
        int[] array2 = new int[koll / 2];
        int[] array3 = new int[koll / 2];
        for (int i = 1; i <= koll / 2; i++) {
            if (i % 2 != 0) {
                array1[i - 1] = mass[koll - i];
                array1[i] = mass[i - 1];
            } else {
                array2[koll / 2 - i] = mass[i - 1];
                array2[koll / 2 - i + 1] = mass[koll - i];
                array3[i - 2] = mass[i - 1];
                array3[i - 1] = mass[koll - i];
            }
        }

        for (int i = 0; i < koll / 2; i++) {
            if (koll / 2 - 1 != i) {
                System.out.print(array1[i] + ", ");
            } else {
                System.out.println(array1[i]);
            }
        }
        System.out.println("Принтер 1:");
        for (int i = 0; i < koll / 2; i++) {
            if (koll / 2 - 1 != i) {
                System.out.print(array2[i] + ", ");
            } else {
                System.out.println(array2[i]);
            }
        }
        System.out.println("Принтер цвет:");
        for (int i = 0; i < koll / 2; i++) {
            if (koll / 2 - 1 != i) {
                System.out.print(array3[i] + ", ");
            } else {
                System.out.println(array3[i]);
            }
        }
        System.out.println("Конец");
    }
}