package InterfaceDao;
import java.sql.SQLException;
import java.util.List;

import ClassModel.Facture;

public interface IFacture {
	public void ajouter(Facture f) throws ClassNotFoundException, SQLException;
	public void supprimer(Facture facture) throws ClassNotFoundException, SQLException;
	public List<Facture> lister() throws ClassNotFoundException, SQLException;
	public void genererFacture();

}
