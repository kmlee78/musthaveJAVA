class Camp<T1, T2> {
    private T1 param1;
    private T2 param2;

    public void setUnit(T1 param1, T2 param2) {
        this.param1 = param1;
        this.param2 = param2;
    }

    public String toString() {
        return param1 + " and " + param2;
    }
}

public class Ex02_MultiParameter {
    public static void main(String[] args) {
        Camp<String, Integer> camp = new Camp<>();
        camp.setUnit("Hello", 10);
        System.out.println(camp); // Hello and 10
    }
}
```