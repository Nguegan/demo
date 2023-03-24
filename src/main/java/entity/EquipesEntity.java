package entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Equipes", schema = "main", catalog = "")
public class EquipesEntity {
    @Basic
    @Column(name = "nom")
    private String nom;
    @Basic
    @Column(name = "localisation")
    private String localisation;
    @Basic
    @Column(name = "representant")
    private String representant;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "EquipeID")
    private Integer equipeId;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getLocalisation() {
        return localisation;
    }

    public void setLocalisation(String localisation) {
        this.localisation = localisation;
    }

    public String getRepresentant() {
        return representant;
    }

    public void setRepresentant(String representant) {
        this.representant = representant;
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

        EquipesEntity that = (EquipesEntity) o;

        if (nom != null ? !nom.equals(that.nom) : that.nom != null) return false;
        if (localisation != null ? !localisation.equals(that.localisation) : that.localisation != null) return false;
        if (representant != null ? !representant.equals(that.representant) : that.representant != null) return false;
        if (equipeId != null ? !equipeId.equals(that.equipeId) : that.equipeId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = nom != null ? nom.hashCode() : 0;
        result = 31 * result + (localisation != null ? localisation.hashCode() : 0);
        result = 31 * result + (representant != null ? representant.hashCode() : 0);
        result = 31 * result + (equipeId != null ? equipeId.hashCode() : 0);
        return result;
    }
}
