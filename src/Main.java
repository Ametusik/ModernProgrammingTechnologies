import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        OrderData orderData = new OrderData();
        PriceDisplay priceDisplay = new PriceDisplay(orderData);
        StageDisplay stageDisplay = new StageDisplay(orderData);
        ElementsDisplay elementsDisplay = new ElementsDisplay(orderData);
        FullDisplay fullDisplay = new FullDisplay(orderData);

        ArrayList<Element> elements = new ArrayList<>();
        Element element = new Element("цупрол","Пиво","Крымское",100,10);
        elements.add(element);
        orderData.setMeasurements("1","Амет",elements,new Date(),true,"Сборка");
    }
}
