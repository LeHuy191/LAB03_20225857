package hust.soict.dsai.lab01;
//Ex2.2.6: hệ phương trình 
import java.util.Scanner;
public class PTBH {


    public static void solve(double a11, double a12, double b1, double a21, double a22, double b2) {
        double D = a11 * a22 - a21 * a12;   // Định thức của hệ phương trình
        double D1 = b1 * a22 - b2 * a12;     // Định thức D1
        double D2 = a11 * b2 - a21 * b1;     // Định thức D2
        
        if (D != 0) {
            double x = D1 / D;  // Tính nghiệm x1
            double y = D2 / D;  // Tính nghiệm x2
            System.out.printf("Hai nghiệm là: x1 = %.2f và x2 = %.2f\n", x, y);
        } else {
            if (D1 == 0 && D2 == 0) {
                System.out.println("Hệ phương trình có vô số nghiệm.");
            } else {
                System.out.println("Hệ phương trình vô nghiệm.");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Nhập các hệ số cho phương trình 1
        System.out.println("Nhập các hệ số của phương trình 1 (a11, a12, b1): ");
        double a11 = sc.nextDouble();
        double a12 = sc.nextDouble();
        double b1 = sc.nextDouble();
        
        // Nhập các hệ số cho phương trình 2
        System.out.println("Nhập các hệ số của phương trình 2 (a21, a22, b2): ");
        double a21 = sc.nextDouble();
        double a22 = sc.nextDouble();
        double b2 = sc.nextDouble();
        
        solve(a11, a12, b1, a21, a22, b2);   //giải

        sc.close();
    }
}
