public class Pig extends Animal{
    public Pig(){
        say = new SayOink();
    }

    @Override
    public void display() {
        System.out.println("Я хрюшка");
    }
}
