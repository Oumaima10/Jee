package WS;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.ArrayList;
import java.util.List;
@WebService
public class EtudiantService  {

    private List<Etudiant> etudiants = new ArrayList<>();

    public EtudiantService() {
        etudiants.add(new Etudiant(1, "John Doe", "AB123456", "1990-01-01", "Informatique"));
        etudiants.add(new Etudiant(2, "Jane Smith", "CD789012", "1992-02-02", "Mathématiques"));
        etudiants.add(new Etudiant(3, "Robert Martin", "EF345678", "1994-03-03", "Physique"));
    }

    @WebMethod
    public List<Etudiant> getAllEtudiants() {
        return etudiants;
    }

    @WebMethod
    public List<Etudiant> getLimitEtudiants(int limit) {
        return etudiants.subList(0, Math.min(limit, etudiants.size()));
    }

    @WebMethod
    public Etudiant getEtudiantsBycin(String cin) {
        for (Etudiant etudiant : etudiants) {
            if (etudiant.getCIN().equals(cin)) {
                return etudiant;
            }
        }
        return null;
    }
}
