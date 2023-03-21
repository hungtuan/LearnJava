public class Bai17 {
    public static void main(String[] args) {
        //tinh tong tu 1-5 bo qua so 3 1 2 3 4 5
        int tong = 0;
        for (int i=0;i<=5;i++){
            if(i==3){
                continue;//bo qua
            }else {
                tong+=i;
            }
        }
        System.out.println("tổng = "+tong);
        //break
        int n=0;
        while (n<100){
            System.out.println("n= "+n);
            if (n==15)
                break;
            n++;
        }
    }
}
