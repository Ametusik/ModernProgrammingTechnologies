public class Item {//Посетитель секции
    private int id;
    private String name;
    private String description;
    private boolean sex;
    private double price;

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", sex=" + sex +
                ", price=" + price +
                '}';
    }

    public Item(int id, String name, String description, boolean sex, double price) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.sex = sex;
        this.price = price;
    }

    public Item() {
        this.id = 0;
        this.name = "";
        this.description = "";
        this.sex = false;
        this.price = 0;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public boolean getSex() {
        return sex;
    }

    public double getPrice() {
        return price;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isSex() {
        return sex;
    }


}

