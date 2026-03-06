package ch02_contro_statement;

public class If02 {
    static void main() {
        // 짝수이면 하하하를 홀수이면 호호호를 출력해주세요
        int a = 4;
        // 양자 택일 구문
        if (a%2==0) { // 짝수일 경우
            System.out.println("하하하");
            System.out.println(a + "는 짝수");

        } else{ // 홀수일 경우
            System.out.println("호호호");
            System.out.println(a + "는 홀수");

        }
    }
}
