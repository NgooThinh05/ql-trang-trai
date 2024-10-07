import java.util.ArrayList;
import java.util.List;

public class qltt {
    public static <list> void main(String[] args) {
        List<animal> animals = new ArrayList<>();
        animals.add(new Ca("Cakoi"));
        animals.add(new Ca("CaCo"));
        animals.add(new Lon("Lonnai"));
        animals.add(new Lon("Lonxe"));
        animals.add(new Vit("Vitco"));
        animals.add(new Vit("Vittroi"));

        for (animal a : animals) {
            if (a.walk()) {
                System.out.println(a.getName());
            }
        }

        for (animal a : animals) {
            if (a.swim()) {
                System.out.println(a.getName());
            }
        }
    }
}
