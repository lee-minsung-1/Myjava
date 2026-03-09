package ch04_class;

import java.security.spec.RSAOtherPrimeInfo;

import static java.awt.SystemColor.info;

public class LmsMain01 {
    static void main() {
        Lms01 infomation = new Lms01();

        infomation.setName("이민성");
        infomation.setAge(23);
        infomation.setHei(187);

        System.out.println(infomation.getName());
        System.out.println(infomation.getAge());
        System.out.println(infomation.getHei());
    }
}
