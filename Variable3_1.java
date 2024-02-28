public class Variable3_1 {
    public static void main(String[] args) {
        short sMin = -32768;
        short sMax = 32767;

        //short에서 최솟값의 범위를 넘는다면?
        System.out.println("sMin = " + sMin);
        System.out.println("sMin - 1 = " + sMax);
        System.out.println((short)(sMin - 1)); // 32767

        //short에서 최솟값의 범위를 넘는다면?
        System.out.println("sMax = " + sMax);
        System.out.println("sMax + 1 = " + sMax);
        System.out.println((short)(sMax + 1)); // -32768

        // 부호없는 경우
        char cMin = 0;
        char cMax = 65535;

        // short 타입에서 최솟값 범위를 넘었을 때
        // cMin - 1 = 65535
        System.out.println("cMin = " + (int)cMin);
        System.out.print("cMin - 1 = ");
        System.out.println((int)(--cMin));

        // short 타입에서 최댓값 범위를 넘었을 때
        // cMax + 1 = 0
        System.out.println("cMax = " + (int)cMax);
        System.out.print("cMax + 1 = ");
        System.out.println((int)(++cMax));
    }
}
