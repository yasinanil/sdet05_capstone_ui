package pages;

public class AllPages {

    private CLHomePage clHomePage;
    private CLContactsPage clContactsPage;

    public CLHomePage getClHomePage() {
        if (clHomePage == null) {
            clHomePage = new CLHomePage();
        }
        return clHomePage;
    }

    public CLContactsPage getClContactsPage() {
        if (clContactsPage == null) {
            clContactsPage = new CLContactsPage();
        }
        return clContactsPage;
    }
}
