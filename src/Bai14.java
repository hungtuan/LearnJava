import java.util.Scanner;

public class Bai14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập vào số nguyên từ 1-99:");
        int n = sc.nextInt();
        while (n<1 || n>99) {
            System.out.println("Nhập lại n, n chỉ được từ 1-99 thôi thím");
            n = sc.nextInt();
        }
        System.out.println("Bạn đã nhập xong n= "+n);


    }
}
