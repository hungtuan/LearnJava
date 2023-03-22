import java.util.Scanner;

public class Bai19 {

    public static String PhepTinh(double a, double b, String pheptinh) {
        if(pheptinh.equals("+")){
            return "Kết quả = "+(a+b);
        } else if (pheptinh.equals("-")) {
            return "Kết quả = "+(a-b);
        } else if (pheptinh.equals("*")) {
            return "Kết quả = "+(a*b);
        }else if (pheptinh.equals("/")){
            if (b != 0) {
                return "Kết quả "+(a/b);
            }else {
                return "Không chia được cho không";
            }
        }else {
            return "Bạn nhập linh tinh";
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào a:");
        double a = sc.nextDouble();
        System.out.println("Nhập vào b:");
        double b = sc.nextDouble();
        System.out.println("Mời nhập vào phép tính(+,-,*,/):");
        String pheptinh = new Scanner(System.in).nextLine();
        String result = PhepTinh(a, b, pheptinh );
        System.out.println(result);
    }
}
