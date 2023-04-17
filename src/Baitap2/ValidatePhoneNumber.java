package Baitap2;

import java.util.Scanner;

public class ValidatePhoneNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số điện thoại: ");
        String name = scanner.nextLine();
        String nameExample = "0[0-9]{9}$";
        if (name.matches(nameExample)){
            System.out.println("Số điện thoại hợp lệ!");
        }else {
            System.out.println("Số điện thoại không hợp lệ!");
        }
    }
}
