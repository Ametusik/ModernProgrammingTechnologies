import java.util.ArrayList;
import java.util.Date;

public class ElementsDisplay implements Observer,Display{

    private ArrayList<Element> elements;
    private OrderData orderData;

    public ElementsDisplay(OrderData orderData){
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
        System.out.println("Вывод элементов заказа");
        for (Element element:elements){
            System.out.println(element.getName());
        }
    }


}
