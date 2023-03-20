import java.util.Scanner;

public class Bai11_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int thang;
        System.out.println("Nhập vào tháng trong năm:");
        thang = sc.nextInt();
        if (thang >= 1 && thang <= 12) {
            if (thang == 1 || thang == 2 || thang == 3) {
                System.out.println("Tháng " + thang + " thuộc Quý 1");
            } else if (thang == 4 || thang == 5 || thang == 6) {
                System.out.println("Tháng " + thang + " thuộc Quý 2");
            } else if (thang == 7 || thang == 8 || thang == 9) {
                System.out.println("Tháng " + thang + " thuộc Quý 3");
            } else if (thang == 10 || thang == 11 || thang == 12) {
                System.out.println("Tháng " + thang + " thuộc Quý 4");
            }

        } else {
            System.out.println("Bạn nhập sai tháng");
        }
    }
}

