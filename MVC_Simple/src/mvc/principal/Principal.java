package mvc.principal;

import mvc.models.*;
import mvc.views.*;
import mvc.controllers.*;

public class Principal {
    public static void main(String[] args) {
        Model model = new Model(0);
        View view = new View("-");
        Controller controller = new Controller(model,view);
        controller.contol();
    }
}
