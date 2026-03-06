package ch02_contro_statement;

public class Text00 {

    static void main() {
//        이름 : Saymessage
//        "안녕하세요."라는 문구
//        를 "5번"
//        출력해 보세요.
//                String message = "안녕하세요.";
//        int su = 5 ;
//
//        예시:
//        안녕하세요.
//                안녕하세요.
//                안녕하세요.
//                안녕하세요.
//                안녕하세요.

//        String m = "안녕하세요.";
//       int i =0;
//       while ( i < 5 ){
//
//           System.out.print(m);
//           i++;
//
//       }
//        System.out.println();
//        for (int j = 1; j <= 5 ; j++) {
//            System.out.println(j);
//        }
//        이름 : Gugudan
//        int dan = 3 ;
//        3단을 출력해는 프로그램 작성
//
//        예시:
//        3 * 1 = 3
//        3 * 2 = 6
//...
//        3 * 9 = 27

//        int dan = 3;
//        for (i=1;i<10;i++){
//
//            System.out.println(dan+"x"+i+"="+i*dan);
//            System.out.printf("%d * %d = %d",dan,i, (dan*i) );
//      }

//        이름 : Difference
//        1부터 50까지의 정수 중에서
        //"3의 배수의 총합
        //3의 배수가 아닌 정수의 총합
        //차이

//        int diff = sumA - sumB ;
//        System.out.println("3의 배수의 총합 : " + sb ); // 408
//        System.out.println("3의 배수가 아닌 정수의 총합 : " + sa ); // 867
//        System.out.println("차이 : " + diff ); // 459
//        int sa=0,sb=0;
//
//        for (int i = 1 ; i < 51 ; i++ ){
//            if (i%3==0){
//                sb+=i;
//            }else {
//                sa+=i;
//            }
//        }
//        System.out.println("3의배수가아닌총합"+sa);
//        System.out.println("3의배수총합"+sb);
//        System.out.println("차이" + (int)Math.abs(sb-sa) );
//
//        이름 : While02
//        while 구문과
//        switch 구문을 사용하여
//
//        반복은 ? 1부터 10까지00000
//        조건은?  짝수와 홀수의 합을 "각각" 구해주세요.
//        int odd = 0, even = 0 ;00000

//
//        int od = 1; //얘는 반복을 위한 초기값을 담을 변수
//        int ev = 0 , en = 0; // 짝수와 홀수의 합을 담을 변수
//        while (od<11){
//            switch (od%2){
//                case 0:
//                    ev+=od;
//                    break;
//                case  1:
//                    en+=od;
//                    break;
//                default:
//                    System.out.println("잘못된 입력임 ㅅㄱ");
//            }
//            od++;
//        }
//        System.out.println(ev+"lujuhuh"+en);

//1단2단 ~ 9단까지
        // 구구단 출력
        //예시 1 x 1 = 1  1x2=2

//        int dan = 3;
//        for (i=1;i<10;i++){
//
//            System.out.println(dan+"x"+i+"="+i*dan);
//            System.out.printf("%d * %d = %d",dan,i, (dan*i) );
//      }

        for (int i = 1 ; i < 10 ; i++ ){
            System.out.println(i+"단");
            for (int j = 1 ; j < 10 ; j++){
                System.out.println(i+" x "+j+" = "+ (i*j) );
            }

        }
    }

}
