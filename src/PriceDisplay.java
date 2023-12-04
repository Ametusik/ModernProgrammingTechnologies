import java.util.ArrayList;
import java.util.Date;

public class PriceDisplay implements Observer,Display{

    private ArrayList<Element> elements;
    private OrderData orderData;

    public PriceDisplay(OrderData orderData){
        this.orderData = orderData;
        orderData.registerObserver(this);

    }

    @Override
    public void update(String code, String customer, ArrayList<Element> elements, Date date, boolean isPaid,String stage) {
        this.elements = elements;
        display();
    }

    @Override
    public void display() {
        int price = 0;
        System.out.println("Вывод общей стоимости заказа");
        for (Element element:elements){
            price+=element.getPrice();
        }
        System.out.println(price);
    }
}
