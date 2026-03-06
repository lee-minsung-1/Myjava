package ch02_contro_statement;

public class For01 {
    static void main(String[] args) {

        int total = 0 ;

        for (int i = 1; i < 97 ; i += 5) {

            total += i * i ;
        }


        System.out.println("총합02 : " + total );



    }
}

