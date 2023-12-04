import java.util.ArrayList;
import java.util.Date;

public class FullDisplay implements Observer,Display{
    private ArrayList<Element> elements;
    private String stage;
    private boolean isPaid;
    private OrderData orderData;

    public FullDisplay(OrderData orderData){
        this.orderData = orderData;
        orderData.registerObserver(this);

    }

    @Override
    public void update(String code, String customer, ArrayList<Element> elements, Date date, boolean isPaid,String stage) {
        this.elements = elements;
        this.isPaid = isPaid;
        this.stage = stage;

        display();
    }

    @Override
    public void display() {
        int price = 0;

        System.out.println("Вывод полной информации о заказе");
        for (Element element:elements){
            System.out.println(element.getName());
            price+=element.getPrice();
        }

        System.out.println("Стадия выполнения" + stage);
        System.out.println("Оплачен ли заказ?" + isPaid);
    }
}
