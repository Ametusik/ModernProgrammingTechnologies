import java.util.ArrayList;
import java.util.Date;

public interface Observer {
    public void update(String code, String customer, ArrayList<Element> elements, Date date, boolean isPaid,String stage);
}
