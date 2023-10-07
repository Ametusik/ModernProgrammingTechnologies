public class Duck extends Animal{
    public Duck(){
        say = new SayQuack();
    }

    @Override
    public void display() {
        System.out.println("Я утка");
    }
}
