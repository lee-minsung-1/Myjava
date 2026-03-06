package ch02_contro_statement;

public class Switch03 {
    static void main(String[] args) {
        String name = "김철수";
        String grade = "B"; //고객 등급 (ABC중 하나)
        String present = "";// 등급에 따른 선물

        switch (grade) {
            case "A":
                present += "강남빌딩";
            case "B":
                present += " 껌 ";
            case "C":
                present += "두쫀쿠";

        }
        String message = ("%s님의 성적은 "+grade+"이기에 경품은%s입니다");
        System.out.printf(message,name,present);

        double average = 74.666666666666 ;
        message = "평균 : %f";
        System.out.printf(message, average);

    }
}

