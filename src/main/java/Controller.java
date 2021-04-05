import java.nio.charset.Charset;
import java.util.Scanner;

public class Controller {

    private static Controller instance;
    private final InputProcessor processor;

    private Controller() {
        processor = new InputProcessor();
    }

    public static Controller getInstance() {
        if (Controller.instance == null) {
            Controller.instance = new Controller();
        }
        return Controller.instance;
    }

    public final void launch() {
        final Scanner scanner = new Scanner(System.in, Charset.defaultCharset());
        String input;
        while (true) {
            System.out.println("Введите 4 цифры от 0 до 9 без пробелов (Q для выхода)");
            input = scanner.nextLine();
            if ("q".equalsIgnoreCase(input)) {
                break;
            } else {
                System.out.println(processor.processInput(input));
                System.out.println("------------");
            }
        }
        scanner.close();
    }
}
