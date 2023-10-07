import java.util.Iterator;

public class OrganizingCommittee {
    Section athleticSection;
    Section boxingSection;
    Section gymnasticsSection;

    public OrganizingCommittee(Section athleticSection, Section boxingSection, Section gymnasticsSection) {
        this.athleticSection = athleticSection;
        this.boxingSection = boxingSection;
        this.gymnasticsSection = gymnasticsSection;
    }

    public void printSections() {
        Iterator<Item> athleticSectionIterator = athleticSection.createIterator();
        Iterator<Item> boxingSectionIterator = boxingSection.createIterator();
        Iterator<Item> gymnasticsSectionIterator = gymnasticsSection.createIterator();

        System.out.println("Члены секции по легкой атлетике");
        printSections(athleticSectionIterator);
        System.out.println("Члены секции по боксу");
        printSections(boxingSectionIterator);
        System.out.println("Члены секции по гимнастике");
        printSections(gymnasticsSectionIterator);
    }

    private void printSections(Iterator<Item> iterator) {
        while (iterator.hasNext()) {
            Item item = iterator.next();
            System.out.print(item.getName() + ", ");
            System.out.print(item.getPrice() + " -- ");
            System.out.println(item.getDescription());
        }
    }

    public void printFemales() {
        System.out.println("\nЖенщины\n---------------");
        printFemales(athleticSection.createIterator());
        printFemales(boxingSection.createIterator());
        printFemales(gymnasticsSection.createIterator());

    }

    public boolean isItemFemale(String name) {
        Iterator<Item> athleticSectionIterator = athleticSection.createIterator();
        if (isSex(name, athleticSectionIterator)) {
            return true;
        }
        Iterator<Item> boxingSectionIterator = boxingSection.createIterator();
        if (isSex(name, boxingSectionIterator)) {
            return true;
        }
        Iterator<Item> gymnasticsSectionIterator = gymnasticsSection.createIterator();
        if (isSex(name, gymnasticsSectionIterator)) {
            return true;
        }
        return false;
    }

    private void printFemales(Iterator<Item> iterator) {
        while (iterator.hasNext()) {
            Item item = iterator.next();
            if (item.isSex()) {
                System.out.print(item.getName() + ", ");
                System.out.print(item.getPrice() + " -- ");
                System.out.println(item.getDescription());
            }
        }

    }

    private boolean isSex(String name, Iterator<Item> iterator) {
        while (iterator.hasNext()) {
            Item item = iterator.next();
            if (item.getName().equals(name)) {
                if (item.isSex()) {
                    return true;
                }
            }
        }
        return false;
    }

}
