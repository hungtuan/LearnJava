import java.awt.*;
import java.util.Scanner;

public class Bai17_4 {
    public static void main(String[] args) {
        //viet pt
        //tim nhung so chia het cho 3 tu 10 den 50
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập vào n:");
        int n = sc.nextInt();
        for (int i = 10; i <= n; i++){
            if (i % 3 == 0){
                System.out.print(i+" ");
            }
        }
    }
}
