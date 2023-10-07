public class OrganizingCommittee {
    Component allSections;

    public OrganizingCommittee(Component allSections){
        this.allSections = allSections;
    }

    public void printSections(){
        allSections.print();
    }
}
