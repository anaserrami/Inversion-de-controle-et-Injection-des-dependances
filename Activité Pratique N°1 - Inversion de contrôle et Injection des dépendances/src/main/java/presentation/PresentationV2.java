package presentation;
import dao.IDao;
import metier.IMetier;
import java.io.File;
import java.lang.reflect.Method;
import java.util.Scanner;

public class PresentationV2 {
    public static void main(String[] args) {

        // Injection des dependences par instanciation dynamique

        try {
            Scanner sc = new Scanner(new File("config.txt"));

            String daoClassName = sc.nextLine();
            Class cDao = Class.forName(daoClassName);
            IDao dao = (IDao) cDao.getConstructor().newInstance();

            String metierClassName = sc.nextLine();
            Class cMetier = Class.forName(metierClassName);
            // 1er version : constructeur sans parameters
            // IMetier metier = (IMetier) cMetier.getConstructor().newInstance();
            // 2eme version : constructeur avec parameters
            IMetier metier = (IMetier) cMetier.getConstructor(IDao.class).newInstance(dao);

            Method setDao = cMetier.getDeclaredMethod("setDao", IDao.class);
            setDao.invoke(metier, dao);

            System.out.println("Result = " + metier.calcul());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}