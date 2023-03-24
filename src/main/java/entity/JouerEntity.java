package entity;

import jakarta.persistence.*;

@Entity

@Table(name = "Jouer", schema = "main")
public class JouerEntity {
    @Basic
    @Column(name = "Nom")
    private String nom;
    @Basic
    @Column(name = "prenom")
    private String prenom;
    @Basic
    @Column(name = "lieu")
    private String lieu;
    @Basic
    @Column(name = "nummeroDetelephone")
    private String nummeroDetelephone;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "JouerID")
    private int jouerId;

    public JouerEntity(String nom , String prenom ,String lieu ,String nummeroDetelephone) {
        this.nom = nom ;
        this.lieu = lieu ;
        this.prenom = prenom ;
        this.nummeroDetelephone = nummeroDetelephone ;

    }

    @Override
    public String toString() {
        return "JouerEntity{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", lieu='" + lieu + '\'' +
                ", nummeroDetelephone='" + nummeroDetelephone + '\'' +
                ", jouerId=" + jouerId +
                '}';
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getLieu() {
        return lieu;
    }

    public void setLieu(String lieu) {
        this.lieu = lieu;
    }

    public String getNummeroDetelephone() {
        return nummeroDetelephone;
    }

    public void setNummeroDetelephone(String nummeroDetelephone) {
        this.nummeroDetelephone = nummeroDetelephone;
    }

    public int getJouerId() {
        return jouerId;
    }

    public void setJouerId(int jouerId) {
        this.jouerId = jouerId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        JouerEntity that = (JouerEntity) o;

        if (jouerId != that.jouerId) return false;
        if (nom != null ? !nom.equals(that.nom) : that.nom != null) return false;
        if (prenom != null ? !prenom.equals(that.prenom) : that.prenom != null) return false;
        if (lieu != null ? !lieu.equals(that.lieu) : that.lieu != null) return false;
        if (nummeroDetelephone != null ? !nummeroDetelephone.equals(that.nummeroDetelephone) : that.nummeroDetelephone != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = nom != null ? nom.hashCode() : 0;
        result = 31 * result + (prenom != null ? prenom.hashCode() : 0);
        result = 31 * result + (lieu != null ? lieu.hashCode() : 0);
        result = 31 * result + (nummeroDetelephone != null ? nummeroDetelephone.hashCode() : 0);
        result = 31 * result + jouerId;
        return result;
    }
    public JouerEntity(){

    }
}
