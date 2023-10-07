
public class Main {
    public static void main(String[] args) {
        AthleticSection athleticSection = new AthleticSection();
        BoxingSection boxingSection = new BoxingSection();
        GymnasticsSection gymnasticsSection = new GymnasticsSection();

        OrganizingCommittee organizingCommittee = new OrganizingCommittee(athleticSection, boxingSection, gymnasticsSection);
        organizingCommittee.printSections();
        organizingCommittee.printFemales();

        System.out.println("\nЯвляется ли Вадим женщиной");
        System.out.print("Орг. комитет отвечает: ");
        if (organizingCommittee.isItemFemale("Вадим")) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
        System.out.println("\nЯвляется ли Татьяна женщиной?");
        System.out.print("Орг. комитет отвечает: ");
        if (organizingCommittee.isItemFemale("Татьяна")) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }

    }
}