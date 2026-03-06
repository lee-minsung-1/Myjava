package ch02_contro_statement;

public class Adulkcheck {
    static void main() {
        String name = "김철수";
        int _age = 12 ;
        int _gender = 3 ;
        String gender ; // 성별
        String age ; // 성인
        if (_gender == 1 || _gender == 3) {
           gender = "남자";
        }else {
            gender = "여자";
        }

        if ( _age >= 19 ) {
            age = "성인";
        }else{
            age = "미성년자";
        }

        // println 메소드 : 문자열을 출력하고 , 엔터키를 누르는 역할을 합니다 .
        // 메소드  역할=기능=함수
        System.out.println("이름 : " + name + "나이" + age);

        // 서식 지정자 : %s(문자열) %d(정수)
        // printf 메소드 : 서식 지정자를 이용한 출력, 앤터키(줄바꿈) 기능 없음.
          System.out.printf("이름 : %s, 나이:%d, 성별 : %s, 성인여부 : %s", name, _age, gender , age);
//        System.out.println("하하하");

    }
}
