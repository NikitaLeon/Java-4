import java.lang.module.FindException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int kg = 83;
        double m = 1.87;
        double index = service.calculate(kg,m);
        System.out.println((int) index);

    }
}
