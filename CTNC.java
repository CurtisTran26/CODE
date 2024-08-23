
package ctnc;
import java.util.Scanner;
public class CTNC {


    public static void main(String[] args) {
         Scanner s = new Scanner(System.in);
        
        // Nhập hai số nguyên
        System.out.print("Nhap so nguyen thu nhat: ");
        int num1 = s.nextInt();
        System.out.print("Nhap so nguyen thu hai: ");
        int num2 = s.nextInt();

        // Thực hiện các phép toán
        int sum = num1 + num2;
        int difference = num1 - num2;
        int product = num1 * num2;
        int quotient = 0;
        int remainder = 0;

        // Kiểm tra chia cho 0
        if (num2 != 0) {
            quotient = num1 / num2;
            remainder = num1 % num2;
        } else {
            System.out.println("Khong the chia cho 0.");
        }

        // Hiển thị kết quả
        System.out.println("Tong: " + sum);
        System.out.println("Hieu: " + difference);
        System.out.println("Tich: " + product);
        if (num2 != 0) {
            System.out.println("Thuong: " + quotient);
            System.out.println("So du: " + remainder);
        }
        s.close();
        
    }
    
}
