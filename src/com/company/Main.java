package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	package com.company;

    import java.util.Scanner;

        public class Main {

            public static void main(String[] args) {
                int number;
                int a = 0;
                int b = 0;
                Scanner in = new Scanner(System.in);
                System.out.print("Введите число: ");
                number = in.nextInt();
                b = number;
                while (b != 0){
                    b = b/10;
                    a++;
                }
                int[] array = new int[a];
                for (int i = 0; i < array.length; i++){
                    array[array.length -1 - i] = number%10;
                    number = number/10;
                }
                System.out.print("Преобразование в массив: ");
                for (int i = 0; i < array.length; i++){
                    System.out.print(array[i] + ", ");
                }
            }
        }
    }
}
