package presentation;

import dao.DaoImpl;
import extension.DaoImplV2;
import metier.MetierImpl;

public class PresentationV1 {
    public static void main(String[] args) {

        // Injection des dependences par instanciation statique

        DaoImpl dao = new DaoImpl();
        MetierImpl metier = new MetierImpl(dao); // Injection via le constructeur
        // metier.setDao(dao); // Injection via le setter
        System.out.println("Result = " + metier.calcul());

        System.out.println("\n");

        DaoImplV2 dao2 = new DaoImplV2();
        MetierImpl metier2 = new MetierImpl(dao2); // Injection via le constructeur
        // metier2.setDao(dao); // Injection via le setter
        System.out.println("Result = " + metier2.calcul());
    }
}