import java.util.Iterator;

public class OrganizingCommittee {
    Component allSections;

    public OrganizingCommittee(Component allSections){
        this.allSections = allSections;
    }

    public void printSections(){
        allSections.print();
    }

    public void printFemales(){
        Iterator<Component> iterator = allSections.createIterator();
        System.out.println("\nЖенщины\n----");
        while (iterator.hasNext()) {
            Component component = iterator.next();
            try {
                if (component.isSex()) {
                    component.print();
                }
            } catch (UnsupportedOperationException e) { }
        }
    }
}
