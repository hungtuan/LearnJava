import java.util.Scanner;

public class Bai17_Nhapn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số nguyên n:");
        int n = sc.nextInt();
        //tinh n!

        //vong for
        /*int giaithua = 1;
        for (int i = 1; i <= n; i++) {
            giaithua *= i;
        }
        System.out.println(""+n+"! = "+giaithua);*/

        //while
        int i = 1;
        int giaithua = 1;
        while (i<=n){
            giaithua*=i;
            i++;
        }
        System.out.println(""+n+"! = "+giaithua);
    }
}
