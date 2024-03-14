class Npc {
    public String toString() {
        return "I am an NPC";
    }
}

class Tank {
    public String toString() {
        return "I am a Tank";
    }
}

// 제네릭을 사용하여 클래스나 메서드의 자료형을 나중에 지정할 수 있다.
class Camp<T> {
    private T unit;

    public void setUnit(T unit) {
        this.unit = unit;
    }

    public T getUnit() {
        return unit;
    }
}

public class Ex01_BasicGeneric {
    public static void main(String[] args) {
        Camp<Npc> npcCamp = new Camp<>();
        Camp<Tank> tankCamp = new Camp<>();

        npcCamp.setUnit(new Npc());
        tankCamp.setUnit(new Tank());

        System.out.println(npcCamp.getUnit()); // I am an NPC
        System.out.println(tankCamp.getUnit()); // I am a Tank
    }
}
```