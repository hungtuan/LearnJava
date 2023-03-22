import java.util.Scanner;

public class Bai21_Giaiptbac2 {
    public static String GiaiPT(double a, double b, double c) {
        //neu a=0 thi pt tro thanh bac 1
        if (a == 0) {
            if (b == 0 && c == 0) {
                return "Pt bậc nhất vô số nghệm";
            } else if (b == 0 && c != 0) {
                return "Pt bậc nhất vô nghiệm";
            } else
                return "Pt bậc nhất có nghiệm: " + (-c / b);
        } else {
            //gai ptb2
            double delta = (b * b) - (4 * a * c);
            if (delta < 0)
                return "pt bac 2 vô nghiệm";
            else if (delta == 0) {
                double x = -b / (2 * a);
                return "PT bậc 2 có nghiệm kép x = " + x;
            } else {
                double x1 = (-b + Math.sqrt(delta) / (2 * a));
                double x2 = (-b - Math.sqrt(delta) / (2 * a));
                return "pt bậc 2 có 2 nghiệm x1 = " + x1 + " ; x2 = " + x2;
            }
        }
    }


    public static void main(String[] args) {
        String kq1 = GiaiPT(1, 2, 3);
        String kq2 = GiaiPT(1, 2, 1);
        String kq3 = GiaiPT(1, 2, -3);
        System.out.println(kq1);
        System.out.println(kq2);
        System.out.println(kq3);

        //nang cao cho nhap a,b,c
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào a:");
        double a = sc.nextDouble();
        System.out.println("Nhập vào b:");
        double b = sc.nextDouble();
        System.out.println("Nhập vào c:");
        double c = sc.nextDouble();
        String kq4 = GiaiPT(a, b, c);
        System.out.println(kq4);


    }
}
