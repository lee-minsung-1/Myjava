package ch02_contro_statement;

public class For03 {
    static void main(String[] args) {

        // 1 + 2 + 3 + ... + 50 = 1275
        // 2 + 4 + 6 + ... + 100 = 2550
        // 1 + 3 + 5 + ... + 99 = 2500
        // 100 + 95 + 90 + ... + 5 = 1050
        // 2² + 4² + 6² + ... + 20² = 1540
        // 5² + 10² + 15² + ... + 100²= 71750
//1번문제.
// int total ;
//total = 0;
//        for (int i = 0; i < 51 ; i++) {
//
//        total += i;
//        }
//            System.out.println(total);

//3번문제.
//    int total ;
//    total = 0;
//        for (int i = 1; i < 100 ; i += 2) {
//            total += i;
//        }
//        System.out.println(total);
//2번문제
//    int total;
//    total = 0;
//        for (int i = 2 ; i < 101 ; i+=2) {
//            total += i ;
//        }
//        System.out.println(total);
// 4번문제
//   int total;
//   total = 0;
//        for (int i = 100; i > 4 ; i -= 5) {
//            total += i;
//        }
//        System.out.println(total);
        // 2² + 4² + 6² + ... + 20² = 1540
//    int total = 0;
//    int i = 2;
//    while (i<21) {
//        total += i*i;
//        i+=2;
//    }
//        System.out.println(total);
        // 5² + 10² + 15² + ... + 100²= 71750
int total = 0;
int i = 5;
while (i<101){
    total += i * i;
    i += 5;
}
        System.out.println(total);

    }
}

