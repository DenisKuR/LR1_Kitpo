import GUI.GUI;
import Test.Testing;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Testing test = new Testing();

        test.testDoubleType();
        test.testPointType();
        GUI gui = new GUI();
        gui.showMenu();
    }
}
