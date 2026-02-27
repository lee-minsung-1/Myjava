package ch01_variable_operator;

public class assignment01 {
    static void main() {
        int x = 5 ; // 정수형 변수 x에 숫자 5를 대입/ 할당(assignment)해주세요.

        System.out.println("x : " + x );

        // x = 3 ; // 위의 값에 덮어쓰기
       x += 3 ; // x = x + 3 ; //(*단항 산술 이항 관계 비트 논리 조건 대입 순서임*) 누적(값을 더)해서 대입
        // += -= 같은 것들은 복합대입이라 함 (같은 대입연산자이긴 함)
        System.out.println("x : " + x );

        x *= 4 ;
        System.out.println("x : " + x );

        x %= 5 ;
        System.out.println("x : " + x );

        x -= 1 ;
        System.out.println("x : " + x );

        x += 5 ;
        System.out.println("x : " + x );

    }
}
