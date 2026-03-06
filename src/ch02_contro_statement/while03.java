package ch02_contro_statement;

import java.util.Scanner;

public class while03 {
    static void main() {
        Scanner scan = new Scanner(System.in);
        while (true) { // endless while loop
            int ans = 40; // 맞춰야하는 정답
            System.out.println("1부터 100사이의 정답을 입력하세여.");
            int i = scan.nextInt(); // 입력되는 숫자
            System.out.println("입력한 숫자 :" + i);
            if (ans == i) {
                System.out.println("정답입니다");
                break;
            } else if (i<ans) {
                System.out.println("오답입니다,업하세요,");
            }else if (i>ans){
                System.out.println("오답입니다,다운하세요");
            }

        }
    }
}


