package org.project;

import org.project.misc.Menu;
import org.project.misc.InputHandler;
public class Main {
    static InputHandler input = new InputHandler();
    static void main() {
        Menu menu = new Menu();
        menu.ShowMenu();

        input.close();
    }

}
