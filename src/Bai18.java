public class Bai18 {
    public static void main(String[] args) {
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 7; j++) {
                System.out.print(i + "" + j + "\t");
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("");
        System.out.println("");

        //ve chu n
//        for (int i = 1; i <= 7; i++) {
//            for (int j = 1; j <= 7; j++) {
//                if (j == 1 || j == 7 || i == j) {
//                    System.out.print("*" + "\t");
//                } else System.out.print(" " + "\t");
//
//            }
//            System.out.println("");
//        }

        //ve chu vuong
//        for (int i = 1; i <= 7; i++) {
//            for (int j = 1; j <= 7; j++) {
//                if (j == 1 || j == 7 || i == 1 || i ==7) {
//                    System.out.print("*" + "\t");
//                } else System.out.print(" " + "\t");
//
//            }
//            System.out.println("");
//        }
        //ve hinh cheo
//        for (int i = 1; i <= 7; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print(i + "" + j + "\t");
//            }
//            System.out.println("");
//        }
//       ve hinh cheo rong
//        for (int i = 1; i <= 7; i++) {
//            for (int j = 1; j <= 7; j++) {
//                if (j == 1 || i == 7 || i == j) {
//                    System.out.print("*" + "\t");
//                } else System.out.print(" " + "\t");
//
//            }
//            System.out.println("");
//        }
//        ve hinh cheo tren
        for (int i = 7; i >=1; i--) {
            for (int j = 1; j <=i; j++) {

                        System.out.print(i + "" + j + "\t");


            }
            System.out.println("");
        }

    }
}
