package hust.soict.dsai.lab01;
//Ex2.2.5: Tính tổng, hiệu, tích, thương
import java.util.Scanner;  

public class CalculateOperations {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);  // Tạo đối tượng để lấy dữ liệu từ ng dùng
       
        System.out.print("Nhập số thực thứ nhất: ");
        String strNum1 = scanner.nextLine();         // Lấy đầu vào là chuỗi
        double num1 = Double.parseDouble(strNum1);  // Chuyển chuỗi thành số thực

        System.out.print("Nhập số thực thứ hai: ");
        String strNum2 = scanner.nextLine();  
        double num2 = Double.parseDouble(strNum2);  

        double tong = num1 + num2;        // Tính tổng
        System.out.println("Tổng: " + tong);

        double hieu = num1 - num2;     // Tính hiệu
        System.out.println("Hiệu: " + hieu);
       
        double tich = num1 * num2;   // Tính tích
        System.out.println("Tích: " + tich);

        // Tính thương và kiểm tra nếu mẫu số khác 0
        if (num2 != 0) {
            double thuong = num1 / num2;
            System.out.println("Thương: " + thuong);
        } else {
            System.out.println("num1 = 0, khong the chia");
        }

        scanner.close(); 
    }
}
