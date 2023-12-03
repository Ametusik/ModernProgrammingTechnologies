public class FurnitureStore {
    SimpleFurnitureFactory factory;

    public FurnitureStore(SimpleFurnitureFactory factory){
        this.factory = factory;
    }

    public Furniture orderFurniture(String type){
        Furniture furniture;
        furniture = factory.createFurniture(type);
        furniture.prepare();
        furniture.compile();
        furniture.glue();
        furniture.sell();
        return furniture;
    }
}
