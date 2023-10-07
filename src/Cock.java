public class Cock extends Animal{
    public Cock(){
        say = new SayCrowing();
    }

    @Override
    public void display() {
        System.out.println("Я петух");
    }
}
