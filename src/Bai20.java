public class Bai20 {
    public static void main(String[] args) {
        int a = 10;
        int b = 2;


        try {
            int c = a/b;
            System.out.println("c = "+c);

        }

        catch (Exception ex){
            System.out.println("Có lỗi rồi u nó ơi...");
            ex.printStackTrace();
        }
        finally {
            System.out.println("Có lỗi hay không lỗi đều làm");
        }
        System.out.println("Đoạn code phía sau");
    }
}
