package ch01_variable_operator;

public class practice0303 {
    static void main() {
        int a = 3 - -2, b = 3;    // a=5 b=3
        int x = (a >= b) ? 5 : (a + 2);   // x=5

        x += ++a; // x=11
        int y = ++a; // y= 7
        y += a + --b; // y=16

        char ch3 = 'D';// ch3=99
        int z = ch3 >= 'A' && ch3 <= 'Z' ? --y : x + 2; // z=15

        int result = 0; //result=48
        result = x > y ? z - y : x + z; //
        System.out.println(result);

        int x = 3, y = 8, z = 4;
        int a = x > y ? x : y;
        int max = a > z ? a : z;
        System.out.println(max);



    }
}
