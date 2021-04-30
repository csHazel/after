package ride;

public class Instrument {
    void play(Note n){
        System.out.print("Instrument.play()"+n);
    }
    String What() {
        return "Instrument"; }
    void adjust() {
        System.out.println("Adjusting Instrument");
    }
    public String toString(){
        return What();
    }
}class newInstrument extends Instrument{
    void play(Note note) {
        System.out.println("newIns.play()" + note); }
}
class Wind extends Instrument{
    //重写接口方法
    public void play(Note n){
        System.out.println("Wind.play()"+n);
    }
    String what() {
        return "Wind"; }
    void adjust() {
        System.out.println("Adjusting Wind"); }
}

