public class Bear extends Animal{
    public Bear(){
        say = new DontSay();
    }

    public void display(){
        System.out.println("Я медведь");
    }
}
