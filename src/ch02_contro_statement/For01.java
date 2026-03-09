package ch02_contro_statement;

public class For01 {
    static void main(String[] args) {

        int total = 0 ; // 지역변수는 반드시 값을 초기화(최초 값을 할당)해서 출력한다

        for (int i = 1; i < 97 ; i += 5) {

            total += i * i ;
        }


        System.out.println("총합02 : " + total );



    }
}

