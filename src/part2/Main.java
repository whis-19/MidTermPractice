package part2;

import part2.Kitab;
import part2.KitabView;
import part2.KitabController;

public class Main {
    public static void main(String[] args) {

        Kitab kitab = new Kitab("Effective Java", 500.0, 69);  

        KitabView view = new KitabView(kitab);
        

        KitabController controller = new KitabController(kitab, view);
        

        controller.listen();
    }
}
