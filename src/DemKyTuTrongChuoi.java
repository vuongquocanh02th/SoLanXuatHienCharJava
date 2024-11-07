import java.util.Scanner;

public class DemKyTuTrongChuoi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Bước 1: Khai báo một chuỗi và gán giá trị cho nó
        String str = "Hello, world!";

        // Bước 2: Khai báo một biến ký tự và gán hoặc nhập từ bàn phím một giá trị
        System.out.print("Nhập ký tự bạn muốn đếm: ");
        char characterToCount = scanner.next().charAt(0); // Đọc ký tự đầu tiên từ bàn phím

        // Bước 3: Khai báo biến count và gán giá trị 0 để lưu số ký tự đếm được trong chuỗi
        int count = 0;

        // Bước 4: Duyệt qua từng ký tự trong chuỗi
        for (int i = 0; i < str.length(); i++) {
            // Nếu ký tự trong chuỗi bằng ký tự nhập vào, tăng biến đếm lên 1
            if (str.charAt(i) == characterToCount) {
                count++;
            }
        }

        // Bước 5: In ra giá trị của biến đếm
        System.out.println("Ký tự '" + characterToCount + "' xuất hiện " + count + " lần trong chuỗi.");

        scanner.close();
    }
}
