package ch03_array;

public class Myarr01 {
    static void main() {
        int x = 3;
        int y = 5;

        // 배열 정의 : 정수 3개를 배열로 만들어봅니다.
        // 타입[] 배열이름 = new 타입 [요소개수].
        // 요소 개숫는 " 배열이름, length " 라는 메소드로 접근이 가능합니다.
        // new 연산자를 사용하여 배열 정의
        int[] arr = new int[3]; // arr은 배열 이름입니다.
        arr[0] = x - y + 6; // arr[0]에는 4가 들어가게된다.
        arr[2] = arr[0] + 3; // arr[2]에는 7가 들어가게된다.
        arr[1] = arr[0] + arr[2]; // arr[1]에는 11가 들어가게된다.
        for (int i = 0; i < arr.length ; i++) {
            System.out.println(arr[i]);
        }

        //방법02 : 초기화 기법
        int[] brr = {15, 30, 22};
        for (int i = 0; i < brr.length ; i++) {
            System.out.println(brr[i]);
        }
    }

    }

