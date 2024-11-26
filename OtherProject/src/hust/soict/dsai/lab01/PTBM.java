package hust.soict.dsai.lab01;
//Ex2.2.6: Phương trình bậc một
import java.util.Scanner;

public class PTBM {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);  
       
        System.out.print("Nhập a: ");
        String strNum1 = scanner.nextLine();         // Lấy đầu vào là chuỗi
        double a = Double.parseDouble(strNum1);  // Chuyển chuỗi thành số thực

        System.out.print("Nhập b: ");
        String strNum2 = scanner.nextLine();  
        double b = Double.parseDouble(strNum2);
	
        // Kiểm tra giá trị của a
		if (a == 0) {
			if (b == 0) {
				System.out.println("Phương trình có vô số nghiệm.");
			}
			else {
				System.out.println("Phương trình vô nghiệm.");
			}
		}
		else {
			double res = -b / a;  // Tính nghiệm
			System.out.printf("Nghiệm của phương trình là: %.2f\n", res);
		}

		scanner.close();  
	}
}
