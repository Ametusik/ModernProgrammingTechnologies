import java.util.ArrayList;
import java.util.Date;

public class OrderData implements Order {

    private ArrayList<Observer> observers;
    private String code;
    private String customer;
    private ArrayList<Element> elements;
    private Date date;
    private boolean isPaid;
    private String stage;

    public OrderData( String code, String customer, ArrayList<Element> elements, Date date, boolean isPaid,String stage) {
        this.observers = new ArrayList<Observer>();
        this.code = code;
        this.customer = customer;
        this.elements = elements;
        this.date = date;
        this.isPaid = isPaid;
        this.stage = stage;
    }

    public OrderData() {
        this.observers = new ArrayList<Observer>();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public ArrayList<Element> getElements() {
        return elements;
    }

    public void setElements(ArrayList<Element> elements) {
        this.elements = elements;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public boolean isPaid() {
        return isPaid;
    }

    public void setPaid(boolean paid) {
        isPaid = paid;
    }

    public void registerObserver (Observer o) {
        observers.add (o);
    }
    public void removeObserver (Observer o) {
        observers.remove (o);
    }
    public void notifyObservers () {
        for (Observer observer : observers) {
            observer.update (code,customer,elements,date,isPaid,stage);
        }
    }

    public void measurementsChanged(){
        notifyObservers();
    }

    public void setMeasurements( String code, String customer, ArrayList<Element> elements, Date date, boolean isPaid,String stage) {
        this.code = code;
        this.customer = customer;
        this.elements = elements;
        this.date = date;
        this.isPaid = isPaid;
        this.stage = stage;
        measurementsChanged();
    }
}
