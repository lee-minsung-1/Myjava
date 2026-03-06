package ch02_contro_statement;

import java.util.Scanner;

public class while04 {
    static void main(String[] args) {
        int to = 0;//총점
        double ave = 0.0; // 평균
        int counter = 0 ; // 카운터 변수
        Scanner scan = new Scanner(System.in);


        while (true) {

            System.out.println("점수를 입력하세요.");
            int jum = scan.nextInt();
            if (jum < 0) {
                System.out.println("음수이므로 종료합니다.");
                break;
            }

            to += jum; counter++;
            if (counter >= 3)break;


            System.out.println("총점은:"+to);

            }
        System.out.println(counter +"-----"+ to);
        System.out.println("평균은 : " + (to/counter));

    }
}

