package hust.soict.dsai.lab01;
//Ex6.5:Hiển thị số ngày trong 1 tháng năm nhập vào
import java.util.Scanner;

public class DaysOfMonth {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
			int year = -1;
			String monthInput = "";
			int month = 0;

			// Nhập năm hợp lệ từ người dùng
			while (year < 0) {
			    System.out.print("Nhập năm (là số không âm, ví dụ: 1999): ");
			    if (scanner.hasNextInt()) {
			        year = scanner.nextInt();
			        if (year < 0) {
			            System.out.println("Năm phải là số không âm. Vui lòng thử lại.");
			        }
			    } else {
			        System.out.println("Đầu vào không hợp lệ. Vui lòng nhập năm hợp lệ.");
			        scanner.next(); // Xóa đầu vào không hợp lệ
			    }
			}

			// Nhập tháng hợp lệ từ người dùng
			scanner.nextLine(); // Xóa dòng còn lại trong bộ đệm
			while (month == 0) {
			    System.out.print("Nhập tháng (dạng số, tên đầy đủ, hoặc viết tắt): ");
			    monthInput = scanner.nextLine();
			    month = getMonthNumber(monthInput);

			    if (month == 0) {
			        System.out.println("Tháng không hợp lệ. Vui lòng thử lại.");
			    }
			}
			
			boolean isLeapYear = isLeapYear(year);   // Xác định năm nhuận

			int days = getDaysInMonth(month, isLeapYear);  // Lấy số ngày trong tháng

			System.out.println("Năm: " + year + ", Tháng: " + monthInput + ", Số ngày: " + days);
		}
    }

    // Phương thức chuyển đổi tên tháng sang số tháng
    public static int getMonthNumber(String month) {
        month = month.toLowerCase();
        switch (month) {
            case "january":
            case "jan.":
            case "jan":
            case "1":
                return 1;
            case "february":
            case "feb.":
            case "feb":
            case "2":
                return 2;
            case "march":
            case "mar.":
            case "mar":
            case "3":
                return 3;
            case "april":
            case "apr.":
            case "apr":
            case "4":
                return 4;
            case "may":
            case "5":
                return 5;
            case "june":
            case "jun.":
            case "jun":
            case "6":
                return 6;
            case "july":
            case "jul.":
            case "jul":
            case "7":
                return 7;
            case "august":
            case "aug.":
            case "aug":
            case "8":
                return 8;
            case "september":
            case "sept.":
            case "sep":
            case "9":
                return 9;
            case "october":
            case "oct.":
            case "oct":
            case "10":
                return 10;
            case "november":
            case "nov.":
            case "nov":
            case "11":
                return 11;
            case "december":
            case "dec.":
            case "dec":
            case "12":
                return 12;
            default:
                return 0;
        }
    }

    // Phương thức kiểm tra năm nhuận
    public static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0;
            } else {
                return true;
            }
        }
        return false;
    }

    // Phương thức trả về số ngày trong tháng dựa trên năm nhuận
    public static int getDaysInMonth(int month, boolean isLeapYear) {
        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
                return isLeapYear ? 29 : 28;
            default:
                return 0;
        }
    }
}
