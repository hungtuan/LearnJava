import java.util.Scanner;

public class Bai17_ChanleA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số a:");
        int a = sc.nextInt();
        int tong = 0;
        if (a % 2 == 0) {
            for (int i = 0; i <= a; i++) {
                if (i % 2 == 0) {
                    tong += i;
                }
            }
            System.out.println("Tổng số chẵn là: " + tong);
        } else {
            System.out.println("Tôi không tính số lẻ");
        }

    }
}
