package WS;


public class Etudiant {
    private int id;
    private String nomComplet;
    private String CIN;
    private String dateNaissance;
    private String filiere;

    // Constructeurs, getters et setters
    public Etudiant(int id, String nomComplet, String CIN, String dateNaissance, String filiere) {
        this.id = id;
        this.nomComplet = nomComplet;
        this.CIN = CIN;
        this.dateNaissance = dateNaissance;
        this.filiere = filiere;
    }

    // Getters et Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomComplet() {
        return nomComplet;
    }

    public void setNomComplet(String nomComplet) {
        this.nomComplet = nomComplet;
    }

    public String getCIN() {
        return CIN;
    }

    public void setCIN(String cin) {
        this.CIN = cin;
    }

    public String getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(String dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public String getFiliere() {
        return filiere;
    }

    public void setFiliere(String filiere) {
        this.filiere = filiere;
    }
}