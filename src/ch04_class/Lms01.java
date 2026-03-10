package ch04_class;
//우리는매일매일, 김민재 감독, 100분 , 12000원, 멜로

public class Lms01 {
    private String title;
    private String director;
    private int time = 100 ;


    public Lms01 (String title, String director, int time){
        this.title = title;
        this.director = director;
        this.time = time ;
    };
    public Lms01 (String title, String director){
        this.title = title;
        this.director = director;

    };
    public void display(){
        System.out.println("제목:"+title+ "감독:"+director+"상영시간:"+time);
}
}


