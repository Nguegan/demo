package services;

import entity.GestiondeJouer;
import entity.JouerEntity;

import java.util.List;

public class GestionDeJouerServices {

    public  static String addplayer(JouerEntity jouer){
        GestiondeJouer.addplayer(jouer);
        return checkJouer(jouer) ;
    }

    public static JouerEntity findplayer(int id){
      return GestiondeJouer.findplayer(id);
    }

    public static List<JouerEntity> findallplayer(){
        return GestiondeJouer.findAllplayer() ;
    }
    public void deleteplayer(int id){
        GestiondeJouer.deleteplayer(id

        );
    }
    public static String checkJouer (JouerEntity jouer){
        if(jouer.getLieu() == null || jouer.getLieu().trim().isEmpty()) return "La location n'est pas Valide" ;
        if(jouer.getNom() == null || jouer.getNom().trim().isEmpty()) return "Le nom n'est pas Valide" ;
        if(jouer.getPrenom() == null || jouer.getPrenom().trim().isEmpty()) return "Le Prenom n'est pas Valide" ;
        if(jouer.getNummeroDetelephone() == null || jouer.getNummeroDetelephone().trim().isEmpty()) return "La location n'est pas Valide" ;
            return "" ;
    }
}
