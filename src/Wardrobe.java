public class Wardrobe extends Furniture{
    @Override
    public void prepare() {
        super.prepare();
        System.out.println("Шкаф");
    }

    @Override
    public void compile() {
        super.compile();
        System.out.println("Шкаф");
    }

    @Override
    public void glue() {
        super.glue();
        System.out.println("Шкаф");
    }

    @Override
    public void sell() {
        super.sell();
        System.out.println("Шкаф");
    }
}
