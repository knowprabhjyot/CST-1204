import Bird.Bird;
import Crocodile.Crocodile;
import Reptile.Reptile;

public class App {
    public static void main(String[] args) throws Exception {
    
        Crocodile crocodile1 = new Crocodile(50, 100, "reptile", "hard", "hardShelled", true);

        Bird raven = new Bird(20, 20, "Bird", true, true);

        crocodile1.getReptileInformation();

        raven.getBirdInformation();
    }
}
