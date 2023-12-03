public class Main {
    public static void main(String[] args) {
        SimpleFurnitureFactory factory = new SimpleFurnitureFactory();
        FurnitureStore store = new FurnitureStore(factory);

        store.orderFurniture("Стул");
        store.orderFurniture("Тумбочка");

    }
}