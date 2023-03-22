import java.util.Scanner;

public class Bai17_2 {
    public static void main(String[] args) {
        //viet pt nhap vao a
        //neu a chan thi tinh tong cac so chan tu 0 -> a
        //neu a le thi in ra dong chu "toi khong tinh tong le"
        int a;
        int tong = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào a: ");
        a = sc.nextInt();
        if (a % 2 != 0) {
            System.out.println("Tôi không tính tổng số lẻ");
        }else {
            for (int i = 0; i <= a; i+=2){
                tong+=i;
            }
            System.out.println("Tổng các số chẵn từ 0 đến "+a+" = "+tong);
        }
    }
}
