public class Bai17_6 {
    public static void main(String[] args) {
        //so hoan hao la so: tong cac uoc thuc cua no bang chinh no
        //VD: 6 = 1+2+3
        //Tim tat ca nhung so hoan thien trong pham vi 1-1000

//        int n = 7;
//        int tong = 0;
//        for (int i = 1; i < n; i++) {
//            if (n % i == 0){
//                tong+=i;
//            }
//        }
//        if (tong==n){
//            System.out.println(n+" là số hoàn hảo");
//        }else
//            System.out.println(n+" là khong phai số hoàn hảo");
        for (int n = 1; n <= 1000; n++) {
            int tong = 0;
            for (int i = 1; i < n; i++) {
                if (n % i == 0) {
                    tong += i;
                }
            }
            if (tong == n) {
                System.out.println(n + " là số hoàn hảo");
            }
        }
    }
}
