package ch01_variable_operator;

public class condition {
    static void main() {

        int x = 10, y = 20;
        // 2개의 숫자 중에서 큰 수 고르기
        // 타입 result = 조건식 ? 참일때처리 : 거짓일때처리 ;
        int result = x >= y ? x : y ;

        System.out.println( "result : " + result);
    }
}
