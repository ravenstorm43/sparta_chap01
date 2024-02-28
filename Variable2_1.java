public class Variable2_1 {
    public static void main(String[] args) {
        int score = 100;
        System.out.println("score = " + score); // 100
        score = 90;
        System.out.println("score = " + score); // 90

        final int finalScore = 100;
        System.out.println("finalScore = " + finalScore); // 100
        //finalScore = 90;  // 상수는 한번 초기화하면 값을 바꿀 수 없음
    }
}
