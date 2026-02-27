package ch01_variable_operator;

// 주석(comment) : 프로그램 실행에 영향을 주지 않는 보조 설명 문구
/*
    작성자 : 이 민성
    작성일 : 2026/02/26
    내용 : 처음 만들어보는 자바 프로그램
 */



public class YourPrint {
    // main메소드는 프로그램 starting point
    static void main(String[] args) { // 중괄호는 예외로 세미클론을 적지 않아도 된다 중괄호의 명칭은 바디라고도 한다
        //모든 명령어는 바디 안에 이루어져야한다
        System.out.println("Hello,World");
        System.out.println("이민성"); // 내 이름을 작성합니다
        // 문자는 외따음표, 문자열은 쌍따음표
        //sop는 system.out.println()을 타이핑하기 위한 hot key
        //system.out.println()는 문자열을 출력하고, 엔텈를 눌러 줍니다.
        System.out.println("박"); // 성씨 출력
        System.out.println(); // 공백을 주고싶을 땐 그냥 sop만 적어주면 자동 엔터
        System.out.println("철"); // 이름 출력
        System.out.println("수"); // 이름 출력 // 모든 문장의 마무리는 ;(세미클론)으로 마무리한다
    }
}