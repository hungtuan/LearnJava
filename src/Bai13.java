import java.util.Scanner;

public class Bai13 {
    public static void main(String[] args) {
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao mot so:");
        int a = sc.nextInt();
        //kiem tra so du
        int div = a % 2;
        switch (div) {
            case 0:
                System.out.println("Là số chẵn");
                break;
            default:
                System.out.println("Là số lẻ");
                break;
        }*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bấm số để chọn:");
        System.out.println("1. tìm theo tên");
        System.out.println("2. tìm theo tác giả");
        System.out.println("3. tìm theo nhà sản xuất");
        System.out.println("4. tìm theo tiêu đề");
        int num = sc.nextInt();
        //kiem tra
        switch (num) {
            case 1:
                System.out.println("Tìm theo tên");
                break;
            case 2:
                System.out.println("Tìm theo tác giả");
                break;
            case 3:
                System.out.println("Tìm theo nhà sản xuất");
                break;
            case 4:
                System.out.println("Tìm theo tiêu đề");
                break;
            default:
                System.out.println("Bạn nhập tào lao");
                break;
        }
    }
}
