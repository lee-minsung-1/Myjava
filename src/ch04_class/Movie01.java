package ch04_class;

public class Movie01 {

   private String title  ;
    private String director ;
    private int time ;

    // 상영시간 접근지정자
    //메서드는 타입 메서드이름 매개변수
    public String getTitle (){
        return title;
    } // 쓰기

    public void setTitle (String _title){
        title= _title;

    } // 읽기

    public String getDirector(){
        return director ;
    }

    public void setDirector (String _director){
        director = _director;
    }
    public int getTime(){
        return time ;
    }
    public void setTime (int _time) {
        time = _time;

    }

}

//우리는매일매일, 김민재 감독, 100분
