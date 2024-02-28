public class Variable1_4 {
    static int classVal = 100; // 클래스 변수
    int instanceVal = 200; // 인스턴스 변수

    public static void main(String[] args) {
        int num; // 지역변수
//        System.out.println("int = " + num); 자바는 모든 변수를 초기화해야만 실행 가능
        num = 300;
        System.out.println("int = " + num); // 300

        //인스턴스 변수
        //System.out.println("instanceVal = " + instanceVal); 인스턴스 변수는 인스턴스를 생성 후 인스턴스를 통해 접근 및 사용 가능
        Variable1_4 instance = new Variable1_4();
        System.out.println("instanceVal = " + instance.instanceVal);// 200

        //클래스 변수
        System.out.println("classVal = " + classVal); // 100
        System.out.println("Main.classVal = " + Variable1_4.classVal); // 100
        //클래스 변수는 클래스를 통해 접근, 같은 클래스 안에서는 바로 접근 가능
    }
}
