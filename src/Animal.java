public abstract class Animal {

    Say say;

    public Animal() {
    }

    public void setSay(Say say) {
        this.say = say;
    }

    public abstract void display();

    public void doSay(){
        say.say();
    }

}
