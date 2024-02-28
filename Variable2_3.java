public class Variable2_3 {
    public static void main(String[] args) {
        //boolean flag1 = 22; boolean은 true false만 저장가능
        boolean flag2 = false;

        //char grade1 = 'AA'; char형은 문자 하나만 저장가능
        //char grade2 = "A"; char형은 ''로 감싸야만 함
        char grade3 = 'A';
        char ch = '\n'; // escape sequence도 저장가능

        //String name1 = 'C'; String형은 ""로 감싸야만함
        //String name2 = 'Choi';
        String str = "C"; //String형은 한글자만 저장할 수도 있음
        String name3 = "choi";

        //byte val1 = 128; byte형은 -2^7 ~ 2^7-1(-128 ~ 127)저장가능
        byte val2= 127;

        short sval = 128;

        int ob = 0b0101; // 2진수 리터럴의 접두사 -> 0b
        int i = 100; // 10진수 리터럴
        int oct = 0100; // 8진수 리터럴의 접두사 -> 0
        int hex = 0x100; // 16진수 리터럴의 접두사 -> 0x

        long price = 2_147_483_648L; // _를 사용해서 Long 리터럴 표현 가능
        //long l1 = 2_147_483_648; int(-2^31 ~ 2^31-1)범위를 벗어나면 L접두사 필수
        long l2 = 100; // int의 범위를 넘지 않으면 L 생략 가능

        //float tax1 = 3.14; float형은 f접두사 필수
        float tax2 = 3.14f;
        //float tax3 = 3.14159265358979f;
        //System.out.println(tax2); //3.14
        //System.out.println(tax3); //3.1415927 float로 표현 가능한 소수점 범위를 벗어나면 반올림으로 소수점을 자름

        double score1 = 3.14159265358979; // d 생략가능
        double scroe2 = 3.14159265358979d;

        float f1 = 10f;
        double d1 = 10.; //10.0
        double d2 = .10; // 0.1
        double d3 = 1e3; // 1*10^3(1000)
        double d4 = -1e3; // -1*10^3(-1000)
    }
}
