public class SimpleFurnitureFactory {
    public Furniture createFurniture(String type){
        Furniture furniture = null;
        if (type.equals("Шкаф")){
            furniture = new Wardrobe();
        }else if (type.equals("Стол")){
            furniture = new Chair();
        }else if (type.equals("Тумбочка")){
            furniture = new BedsideTable();
        }else if(type.equals("Стул")){
            furniture = new Chair();
        }
        return furniture;
    }
}
