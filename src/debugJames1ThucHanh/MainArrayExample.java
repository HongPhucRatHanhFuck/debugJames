package debugJames1ThucHanh;

import java.util.Scanner;

public class MainArrayExample {
    public static void main(String[] args) {
        ArrayExample arrayExample = new ArrayExample();
        Integer[] arr = arrayExample.createRandom();

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nVui long nhap chi so cua 1 phan tu bat ky: ");
        int x = scanner.nextInt();
        try{
            System.out.println("Gia tri cua phan tu co chi so 5" + x + " la " + arr[x]);

        }catch (IndexOutOfBoundsException e){
            System.out.println("Chi so vuot qua gioi han cua mang: ");
        }
    }
}
