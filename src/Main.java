
public class Main {
    public static void main(String[] args) {
        Component athleticSection = new Section("Атлетическая секция", "Утренняя");
        Component gymnasticsSection = new Section("Гимнастическая секция", "Вечерняя");
        Component boxingSection = new Section("Секция бокса", "Дневная");
        Component allSections = new Section("Все секции","Объединение");

        allSections.add(athleticSection);
        allSections.add(gymnasticsSection);

        athleticSection.add(new Item(0, "Евгений", "Крутой", false, 3000));
        athleticSection.add(new Item(1, "Илья", "Работает", false, 1200));
        athleticSection.add(new Item(2, "Сергей", "Машина", true, 1500));

        boxingSection.add(new Item(3,"Кирилл", "Не могу придумать", false,2500));
        boxingSection.add(new Item(4, "Пьер", "Нарцисс", true, 5645));

        gymnasticsSection.add(new Item(5, "Саша", "Скул", false, 1750));
        gymnasticsSection.add(new Item(6, "Мишель", "Моя", true, 26564));


        athleticSection.add(boxingSection);
        OrganizingCommittee organizingCommittee = new OrganizingCommittee(allSections);
        organizingCommittee.printSections();
    }
}