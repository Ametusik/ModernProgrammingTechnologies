public class Element {

    private String article;
    private String name;
    private String producer;
    private int price;
    private int count;

    public Element(String article, String name, String producer, int price, int count) {
        this.article = article;
        this.name = name;
        this.producer = producer;
        this.price = price;
        this.count = count;
    }

    public String getArticle() {
        return article;
    }

    public void setArticle(String article) {
        this.article = article;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
