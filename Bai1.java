package BaiTap_Tuan3;

import static java.lang.Math.sqrt;
import java.util.Scanner;

public class Bai1 {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Nhập sô lượng phần tử của mảng: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Nhập các phần tử của mảng: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        xuat(arr);
        tim_Max_Min(arr);
        dem_soChan(arr);
        xuat_songuyento(arr);
        sapxep_tang(arr);
        TimPhantu_Bangx(arr);
    }

    public static void xuat(int arr[]) {
        System.out.print("Các phần tử của mảng: ");
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void tim_Max_Min(int arr[]) {
        int max = arr[0], min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
            if (arr[i] < min)
                min = arr[i];
        }
        System.out.println("Phần tử lớn nhất: " + max);
        System.out.println("Phần tử nhỏ nhất: " + min);
    }

    public static void dem_soChan(int arr[]) {
        int dem = 0;
        for (int i = 0; i < arr.length; i++)
            if (arr[i] % 2 == 0) {
                dem++;
        }
        System.out.println("Số phần tử là số chẵn: " + dem);
    }

    public static boolean nguyento(int n) {
        if (n < 2)
            return false;
        int dem = 0;
        for (int i = 2; i <= sqrt(n); i++)
            if (n % i == 0)
                dem++;
        if (dem == 0)
            return true;
        else
            return false;
    }

    public static void xuat_songuyento(int arr[]) {
        System.out.print("Các phần tử là số nguyên tố: ");
        for (int i = 0; i < arr.length; i++)
            if (nguyento(arr[i]))
                System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void sapxep_tang(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++)
            for (int j = i + 1; j < arr.length; j++)
                if (arr[i] > arr[j]) {
                    int t = arr[i];
                    arr[i] = arr[j];
                    arr[j] = t;
                }
        System.out.print("Sắp xếp tăng dần: ");
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
    
    public static void TimPhantu_Bangx(int arr[]) {
        System.out.println("Nhập x: ");
        int x = sc.nextInt();
        System.out.print("Các phần tử bằng x: ");
        for(int i = 0; i < arr.length; i++)
            if(arr[i] == x)
                System.out.print(i + " ");
    }
}
