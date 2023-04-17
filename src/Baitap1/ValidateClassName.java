package Baitap1;

import java.util.Scanner;

public class ValidateClassName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên lớp: ");
        String name = scanner.nextLine();
        String nameExcample = "^[CAP||cap]([0-9]{4})*[GHIKLM||ghiklm]$";
        if (name.matches(nameExcample)){
            System.out.println("Tên lớp hợp lệ !");
        }else {
            System.out.println("Tên lớp không hợp lệ!");
        }
    }


}
