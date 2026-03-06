package ch03_array;

import java.util.Scanner;

public class Evenodd {
    static void main() {
        Scanner scan = new Scanner(System.in);

        System.out.print("배열 요소 개수 입력 : ");
        int size =scan.nextInt();

        int[] jumsu = new int[size];
        int odd = 0 ,even = 0 ; // 합산 변수를 반복하기 전에 정의


        for (int i = 0; i < jumsu.length ; i++) {
            System.out.println(i);
            System.out.print(i + "번째 정수 입력:");
            jumsu[i] = scan.nextInt() ;
            if (jumsu[i]%2==0){
                even += jumsu[i];
            }else {
                odd += jumsu[i];
            }
            // arr {0,1,2}
            //arr 이라는 공간에 0번째 방 , 1번째 방 , 2번째 방
        }
        System.out.println("홀수의 총합=" + odd);
        System.out.println("짝수의 총합=" + even);
    }
}
