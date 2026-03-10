package ch04_class;

import java.security.spec.RSAOtherPrimeInfo;

import static java.awt.SystemColor.info;

public class LmsMain01 {
    static void main() {

        int size = 2 ;

//        Lms01 [] abc = new Lms01[size];

//        abc[0] = new Lms01 ("우리는매일매일","김민재감독",100);
//        abc[1] = new Lms01 ("부루룽","이민성감독");
//        for (int i = 0; i < abc.length ; i++) {
//            abc[i].display();
//        }
        Lms01[] asdf = {
                new Lms01("우리는매일매일", "김민재감독", 100),
                new Lms01("부루룽", "이민성감독")
        };

        for (int i = 0; i < asdf.length ; i++) {
            asdf[i].display();
        }

    }
    }



