public class Bai21 {

    public static int Cong(int x, int y, int z) {
        return x + y + z;
    }

    //ham thu tuc
    public static void Xinchao(String gioitinh) {
        if (gioitinh.equals("female"))
            System.out.println("Tôi là nhân viên nữ");
        else if (gioitinh.equals("male")) {
            System.out.println("Xin chào tôi là nhân viên nam");
        }else
            System.out.println("Tôi không hiểu");

    }

    public static void main(String[] args) {
        int kq1 = Cong(1, 2, 3);
        int kq2 = Cong(5, 6, 3);
        //goi ham Xin chao
        Xinchao("male");
        Xinchao("femaledádsa");
        System.out.println("Tổng các số là= " + kq1);
        System.out.println(kq2);
    }

}
