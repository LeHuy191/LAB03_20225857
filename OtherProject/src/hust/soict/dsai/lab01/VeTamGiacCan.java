package hust.soict.dsai.lab01;
//Ex6.3: Vẽ tam giác cân với n=5
import java.util.Scanner;
public class VeTamGiacCan {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Nhập chiều cao của tam giác n = ");
			int n = scanner.nextInt();
			
			for (int i = 1; i <= n; i++) {			    
			    for (int j = i; j < n; j++) {
			        System.out.print(" ");
			    }
			    		
			    for (int k = 1; k <= (2 * i - 1); k++) {
			        System.out.print("*");
			    }
     
			    System.out.println();// chuyển dòng
			}
		}       
    }
}