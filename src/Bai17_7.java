import java.util.Scanner;

public class Bai17_7 {
    public static void main(String[] args) {
//        Viet chuong trinh nhap vao so nguyen tu ban phim
//        Cho biet đó có phải là số nguyên tố
//        (so ng to la so >1, va chia het cho 1 va chinh no)
        //Neu ket thuc chuong trinh hoi nguoi dung: Ban co muon tiep tuc su dung phan men khong?
        //neu chon khong thi thoat chuong trinh
        Scanner sc = new Scanner(System.in);
        int a;
        while (true){
            System.out.println("Mời nhap vao so nguyen a:");
            a = sc.nextInt();
            // check dieu kien dam bao nguoi dung a >0
            while (a <= 0) {
                System.out.println("Nhập lại a, a phải > 0 ");
                a = sc.nextInt();
            }
            System.out.println("Bạn đã nhập a thành công a = " + a);
            //ktra so nguyen to(So nguyen to co dung 2 uoc)
            int demUoc = 0;
            for (int i = 1; i <= a; i++) {
                if (a % i == 0) {
                    demUoc++;
                }
            }
            if (demUoc==2){
                System.out.println(a+" là số nguyên tố");
            }else System.out.println(a+ " không phải là số nguyên tố");

            System.out.println("Bạn có muốn thoát không(Y/y): ");
            String traloi = new Scanner(System.in).nextLine();
            if (traloi.equals("y") || traloi.equals("Y"))
                break;

        }
    }
}
