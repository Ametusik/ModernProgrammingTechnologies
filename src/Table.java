public class Table extends Furniture{
    @Override
    public void prepare() {
        super.prepare();
        System.out.println("Стол");
    }

    @Override
    public void compile() {
        super.compile();
        System.out.println("Стол");
    }

    @Override
    public void glue() {
        super.glue();
        System.out.println("Стол");
    }

    @Override
    public void sell() {
        super.sell();
        System.out.println("Стол");
    }
}
