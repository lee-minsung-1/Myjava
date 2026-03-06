package ch02_contro_statement;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class forpractice {
    //    static void main(String[] args) {
//        String message = "안녕하세요.";
//        int su = 5 ;
//        for (int i = 0; i < su ; i++) {
//            System.out.println(message);
//        }
//
//    }
//}
//    static void main() {
//        int dan = 3 ;
//        for (int i = 1; i <= 9 ; i++) {
//
//            System.out.println(dan + " * " + i + " = " + (dan * i));
//        }
//
//    }
//    static void main() {
//        int n = 5;
//        int total = 0;
//        for (int i = 0; i < 6 ; i++) {
//            total += i;
//        }
//        System.out.println(total);
//    }
//    static void main() {
//        int odd=0;
//        int even=0;
//
//        for (int i = 1; i <=10; i++) {
//            switch (i % 2) {
//                case 1:
//                    odd+=i;
//                    break;
//                case 0:
//                    even+=i;
//                    break;
//
//            }
//        }
//        System.out.println(even);
//        System.out.println(odd);
//        }

//    static void main() {
//        int star = 12;
//        for (int i = 1; i < 13 ; i++) {
//            System.out.print("*");
//            if (i%5==0) {
//                System.out.println();
//            }
//        }
//
//        }

//    static void main() {
//        int diff = 0;
//        int sumA = 0;
//        int sumB = 0;
//        for (int i = 1; i < 51; i++) {
//            switch (i % 3) {
//                case 0 :
//                    sumA += i;
//                    break;
//                case 1, 2 :
//                    sumB += i;
//                    break;
//            }
//        }
//        diff = ( sumB - sumA);
//        System.out.println(sumA);
//        System.out.println(sumB);
//        System.out.println(diff);
//    }}

    static void main() {
        int odd = 0, even = 0;
        int i=1;
        while (i<11){
            switch (i%2){
                case 0:
                    even += i;
                    break;
                case 1:
                    odd += i ;
                    break;
            }
        i++;
        }

        System.out.println(odd);
        System.out.println(even);
    }
}


