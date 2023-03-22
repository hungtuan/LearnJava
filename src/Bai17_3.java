import java.util.Scanner;

public class Bai17_3 {
    public static void main(String[] args) {
        int n;
        int tong = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập n:");
        n = sc.nextInt();
        if (n % 2 != 0) {
            for (int i = 1; i <= n; i += 2) {
                if (i == 3) {
                    continue;//bo qua gia tri
//                    break;
                } else
                    tong += i;
            }
            System.out.println("Tổng số lẻ = " + tong);//1,3,5,7,9,11,13
        }


    }
}
