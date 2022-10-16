import java.util.Optional;
import java.lang.ArithmeticException;

public class DemoOptional {
    private Optional<Integer> opt;

    public void demoOfNullable() {
        Integer number = null;
        Optional<Integer> opt = Optional.ofNullable(number);

        System.out.println("Demo ofNullable com orElse: " + opt.orElse(0));
        System.out.println("Demo ofNullable com orElseGet: " + opt.orElseGet(() -> 0));
    }

    public void demoOf() {
        Optional<Integer> opt = Optional.of(1);

        System.out.println("Demo of: " + opt);

        System.out.println(
                "Value by orElseThrow("
                        + "ArithmeticException::new) method: "
                        + opt.orElseThrow(
                        ArithmeticException::new));
    }

    public void demoFilter() {
        Optional<Integer> op
                = Optional.of(9456);

        System.out.println("Optional: "
                + op);
        System.out.println("Filtered value "
                + "for odd or even: "
                + op
                .filter(num
                        -> num % 2 == 0));
    }
}
