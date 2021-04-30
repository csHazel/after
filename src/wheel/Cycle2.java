package wheel;
public class Cycle2{
    public void play() {
        System.out.println("Cycle");
    }
    public static void wheels(){
        System.out.println("Cycle轮子数量是"+"num");
    }
}
class Unicycle extends Cycle2{
    public void play(){
        System.out.println("Unicycle");
    }
    public static void wheels(){
        System.out.println("Unicycle轮子数量是"+"1");
    }
}
class Bicycle extends Cycle2 {
    public void play(){

        System.out.println("Bicycle");
    }
    public static void wheels(){
        System.out.println("Bicycle轮子数量是"+"2");
    }
}
class Tricycle extends Cycle2 {
    public void play(){
        System.out.println("Tricycle");
    }
    public static void wheels(){
        System.out.println("Tricycle轮子数量是"+"3");
    }
}

class Ride {
    public static void ride(Cycle2 cycle){
        cycle.play();
    }

    public static void main(String[] args) {
        Unicycle unicycle = new Unicycle();
        Bicycle bicycle = new Bicycle();
        Tricycle tricycle = new Tricycle();
        ride(unicycle);
        ride(bicycle);
        ride(tricycle);
        Unicycle.wheels();
        Bicycle.wheels();
        Tricycle.wheels();

    }
}