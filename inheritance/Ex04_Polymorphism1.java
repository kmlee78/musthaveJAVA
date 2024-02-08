abstract class Calc {
    int a = 6;
    int b = 2;
    abstract void add();
}

clss MyCalc extends Calc {
    void add() {
        System.out.println(a + b);
    }

    void sub() {
        System.out.println(a - b);
    }
}

public class Ex04_Polymorphism1 {
    public static void main(String[] args) {
        MyCalc mc = new MyCalc();
        mc.add();
        mc.sub();

        Calc c = new MyCalc();
        c.add();
        // c.sub(); // 상위 클래스 타입으로 선언된 객체는 하위 클래스에 선언된 메소드를 사용할 수 없다.
    }
}