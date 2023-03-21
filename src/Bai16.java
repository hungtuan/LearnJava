public class Bai16 {
    public static void main(String[] args) {
        //i=i+2
        /*for (int i = 12; i >= 0; i -= 3) {
            System.out.println("i = " + i);
        }*/
        //tinh tong cac so chan tu 0-10
        int tong = 0;
        for (int i = 0; i <= 10; i++) {
            tong += i;// tong = tong +i
        }
        System.out.println("Tổng = " + tong);
    }
}
