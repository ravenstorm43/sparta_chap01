public class Variable4_3 {
    public static void main(String[] args) {
        int x = 10, y = 20;

        x = y; // x=10 -> 20
        y = x; // y=20 -> 20

        System.out.println("x = " + x); // 20
        System.out.println("y = " + y); // 20
        System.out.println();

        int a = 10, b = 20;
        int tmp; // 교환에 중간다리 역할을 해 줄 변수 하나를 선언합니다.

        tmp = a; // a = 10, tmp = 10
        a = b; // b = 20, a = 20
        b = tmp; // tmp = 10, b = 10

        // 결과로 a = 20, b = 10 이어야 됩니다.
        System.out.println("a = " + a); // 20
        System.out.println("b = " + b); // 10
        System.out.println("tmp = " + tmp); // 10
    }
}
