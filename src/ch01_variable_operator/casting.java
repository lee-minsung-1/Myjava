package ch01_variable_operator;

public class casting {
    static void main() {
        double d = 100; // 암시적 형변환 (casting=casting연산자=형변환, 같은 뜻)
        System.out.println("d : " + d);

        int i =(int)3.14 ; // 명시적 형변환 (형변환연산자)3.14
        System.out.println("i : " + i);

        System.out.println(14/5);

        // (double)14/5 => (명시적형변환으로 인해) 14.0/5
        // => (암시적형변환으로 14.0이랑 계산하기 위한 5.0캐스팅) 14.0/5.0
        System.out.println((double)14/5); // (14/5.0)처럼 분모에 소수점을 넣어 표현해도 결과는 같지만 가독성이 떨어짐

        // 단산이관비논조대 중 산술이 먼저 실행되므로 14/5를 먼저 계산 => 2 =>그 다음 괄호안에 있는 double이 명시적형변환을 함
        // =>2.0
        System.out.println((double)(14/5)) ;

        int kor= 50, eng = 60, math = 80 ;
        int total = kor+eng+math ;
        System.out.println( " 총점 : " + total);

        double eve = (double)total/3;
        System.out.println("평균:" +  eve);

        char ch1 = 'c'; // 아스키코드 : a(97) , A(65), 0(48)
        char ch2 = 'a';
        boolean bool1 = ch1 > ch2 ;

        System.out.println("bool1:" + bool1);

        int result = ch1-ch2+5;
        System.out.println(result);

        char ch3 = 'D';
        String str =  ch3 >= 'A' && ch3 <= 'Z'     ? "대문자" : "대문자아님";
        System.out.println(str);
    }
}
