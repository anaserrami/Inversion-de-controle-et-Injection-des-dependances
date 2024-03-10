package metier;
import dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service("metier")
public class MetierImpl implements IMetier{
    // Couplage faible
    @Autowired
    private IDao dao;

    // public MetierImpl() {}

    public MetierImpl(@Qualifier("dao2") IDao dao) {
        this.dao = dao;
    }

    @Override
    public double calcul() {
        double t = dao.getData();
        double res = t * 657;
        return res;
    }

    // Pour injecter dans la variable dao un objet
    // d'une classe qui implémente l'interface IDao

    public void setDao(IDao dao) {
        this.dao = dao;
    }
}