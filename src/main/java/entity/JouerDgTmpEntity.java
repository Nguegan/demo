package entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Jouer_dg_tmp", schema = "main", catalog = "")
public class JouerDgTmpEntity {
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
    @Basic
    @Column(name = "EquipeId")
    private Integer equipeId;

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

    public Integer getEquipeId() {
        return equipeId;
    }

    public void setEquipeId(Integer equipeId) {
        this.equipeId = equipeId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        JouerDgTmpEntity that = (JouerDgTmpEntity) o;

        if (jouerId != that.jouerId) return false;
        if (nom != null ? !nom.equals(that.nom) : that.nom != null) return false;
        if (prenom != null ? !prenom.equals(that.prenom) : that.prenom != null) return false;
        if (lieu != null ? !lieu.equals(that.lieu) : that.lieu != null) return false;
        if (nummeroDetelephone != null ? !nummeroDetelephone.equals(that.nummeroDetelephone) : that.nummeroDetelephone != null)
            return false;
        if (equipeId != null ? !equipeId.equals(that.equipeId) : that.equipeId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = nom != null ? nom.hashCode() : 0;
        result = 31 * result + (prenom != null ? prenom.hashCode() : 0);
        result = 31 * result + (lieu != null ? lieu.hashCode() : 0);
        result = 31 * result + (nummeroDetelephone != null ? nummeroDetelephone.hashCode() : 0);
        result = 31 * result + jouerId;
        result = 31 * result + (equipeId != null ? equipeId.hashCode() : 0);
        return result;
    }
}
