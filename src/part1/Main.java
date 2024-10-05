package part1;

public class Main {
    public static void main(String[] args) {

        Kitab kitab = new Kitab("Effective Java", 500.0, 1.5);  

        KitabView view = new KitabView();
        

        Presenter presenter = new Presenter(kitab, view);
        

        presenter.listen();
    }
}
