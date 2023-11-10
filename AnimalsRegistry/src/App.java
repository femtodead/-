import Controler.Controller;
import Model.Animals;
import Model.AnimalsRegistry;
import View.View;

public class App {
    public static void main(String[] args) throws Exception {
       Controller con = new Controller(new View(), new AnimalsRegistry());
       con.start();

    }
}