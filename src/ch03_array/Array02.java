package ch03_array;

public class Array02 {
    static void main(String[] args) {
        //bts 멤버들을 초기화 기법으로 풀어 보세요
        //1
        //
        // 7개의  값이 들어갔어요 이거 맞는데 0~ 6까지잖아요
        String[] bts = {"진", "뷔", "슈가", "제이홉", "정국", "rm", "지민"};
        for (int i = 0; i < bts.length  ; i++) {
            System.out.println(bts[i]);
        }
        System.out.println(bts[6]);
        System.out.println(bts.length);
        for (int i = bts.length-1; i >=0  ; i--) {
            System.out.println(i);
            System.out.println(bts[i-1]);
        }
    }
}
