public class Cat extends Animal{
    public Cat(){
        say = new SayMeow();
    }

    @Override
    public void display() {
        System.out.println("Я кошка");
    }
}
