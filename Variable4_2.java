public class Variable4_2 {
    public static void main(String[] args) {
        String s1 = "A" + "B";
        System.out.println("s1 = " + s1);

        String s2 = "" + 7; // "" + 7 => "" + "7" => "7"
        System.out.println("s2 = " + s2);

        String s3 = "" + 7 + 7;
        System.out.println("s3 = " + s3);

        String s4 = 7 + 7 + "";
        // 7 + 7 + "" => 14 + "" = "14" 연산은 앞에서부터
        System.out.println("s4 = " + s4);
    }
}
