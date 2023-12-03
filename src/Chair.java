public class Chair extends Furniture{
    @Override
    public void prepare() {
        super.prepare();
        System.out.println("Стул");
    }

    @Override
    public void compile() {
        super.compile();
        System.out.println("Стул");
    }

    @Override
    public void glue() {
        super.glue();
        System.out.println("Стул");
    }

    @Override
    public void sell() {
        super.sell();
        System.out.println("Стул");
    }
}
