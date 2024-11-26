package hust.soict.dsai.lab01;
//Ex6.5:Sắp xếp mảng
import java.util.Arrays;  // Thư viện dùng hàm sắp xếp
import java.util.Scanner; 

public class SortAndCalculateArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập kích thước của mảng từ người dùng
        System.out.print("Nhập số phần tử trong mảng: ");
        int n = scanner.nextInt();
        
        int[] array = new int[n];  // Khởi tạo mảng số nguyên

        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            System.out.print("Phần tử " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }
        
        Arrays.sort(array);  // Sắp xếp mảng

        int sum = 0;    // Tính tổng
        for (int num : array) {
            sum += num;
        }
       
        double average = (double) sum / n;// Tính giá trị trung bình
      
        System.out.println("Mảng sau khi sắp xếp: " + Arrays.toString(array));
        System.out.println("Tổng của " + n + " phần tử: "+ sum);
        System.out.println("Giá trị trung bình của " + n + " phần tử: " + average);

        scanner.close();
    }
}
