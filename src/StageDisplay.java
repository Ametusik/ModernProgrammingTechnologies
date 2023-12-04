import java.util.ArrayList;
import java.util.Date;

public class StageDisplay implements Observer,Display{

    private String stage;
    private OrderData orderData;

    public StageDisplay(OrderData orderData){
        this.orderData = orderData;
        orderData.registerObserver(this);

    }

    @Override
    public void update(String code, String customer, ArrayList<Element> elements, Date date, boolean isPaid,String stage) {
        this.stage = stage;
        display();
    }

    @Override
    public void display() {
        System.out.println("Вывод стадии выполнения заказа");
        System.out.println(this.stage);
    }
}
