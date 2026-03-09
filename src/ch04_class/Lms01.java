package ch04_class;

public class Lms01 {

    private String name ;
    private int age ;
    private int hei ;
    //통장으로 비유하면 잔액조회=getter, 입출금 setter.
    public void setName (String _name){
        name = _name;
    }
    public String getName (){
        return name;
    }
    public void setAge(int _age){
        age = _age;
    }
    public int getAge (){
        return age;
    }
    public void setHei(int _hei){
        hei = _hei;
    }
    public int getHei (){
        return hei;
    }

}
//이름:이민성, 나이:23살, 키:187