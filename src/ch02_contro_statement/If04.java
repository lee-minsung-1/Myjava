package ch02_contro_statement;

public class If04 {
    static void main() {
        int su = 4;
        int a = 7;
        int month = 3;
        if (su % 3 == 0) {
            System.out.println(su);
        }

        if (a % 7 == 0) {
            System.out.println(a * a);
        } else {
            System.out.println(a + 3);
        }

        if (month >= 3 && month <= 5) {
            System.out.println("spring");
        } else if (month >= 6 && month <= 8) {
            System.out.println("summer");
        } else if (month >= 9 && month <= 11) {
            System.out.println("authum");
        } else if (month == 12 || month == 1 || month == 2) {
            System.out.println("winter");

        }
    }
}




