public class Bai17_5 {
    public static void main(String[] args) {
        //Tinh tong S = 1!+2!+3!+...+10!
        int gt = 1;
        int tong = 0;
        for (int i = 1; i <= 10; i++) {
            gt *= i;
            tong += gt;
        }
        System.out.println("Tổng cần tính = "+tong);
    }
}
