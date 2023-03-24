package entity;

import entity.JouerDgTmpEntity;
import entity.JouerEntity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;
import org.hibernate.Transaction;

import java.util.List;

public class GestiondeJouer {


    public GestiondeJouer() {


    }

    public static  void addplayer(JouerEntity jouer){
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("default") ;
        EntityManager entityManager = entityManagerFactory.createEntityManager() ;
        Transaction transaction = (Transaction) entityManager.getTransaction();
        try{
            transaction.begin();
            entityManager.persist(jouer);
            transaction.commit();
        }finally {
            if(transaction.isActive()) transaction.rollback();
        }
        entityManager.close();
        entityManagerFactory.close();

    }
    public static JouerEntity findplayer(int id){
        JouerEntity jouer ;
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("default") ;
        EntityManager entityManager = entityManagerFactory.createEntityManager() ;
        Transaction transaction = (Transaction) entityManager.getTransaction();
        try{
            transaction.begin();
             jouer = entityManager.find(JouerEntity.class ,id) ;
            System.out.println(jouer);
            transaction.commit();
        }finally {
            if(transaction.isActive()) transaction.rollback();
        }
        entityManager.close();
        entityManagerFactory.close();
        return jouer ;

    }
    public static List<JouerEntity> findAllplayer(){
        List<JouerEntity> list ;
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("default") ;
        EntityManager entityManager = entityManagerFactory.createEntityManager() ;
        Transaction transaction = (Transaction) entityManager.getTransaction();
        try{
            transaction.begin();
            Query query = entityManager.createQuery("select e from JouerEntity e ",JouerEntity.class) ;
            list = query.getResultList() ;
            list.forEach(x->System.out.println(x));
            transaction.commit();
        }finally {
            if (transaction.isActive()) transaction.rollback();

        }
        entityManager.close();
        entityManagerFactory.close();
        return list ;


    }
    public static void createplayer(){
        JouerEntity jouer =  new JouerEntity("Anderson","Brice","Yaounde","23765847414") ;
        addplayer(jouer);
        System.out.println(jouer);

    }
    public static void deleteplayer(int id){
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("default") ;
        EntityManager entityManager = entityManagerFactory.createEntityManager() ;
        Transaction transaction = (Transaction) entityManager.getTransaction();
        try{
            transaction.begin();
            //entityManager.refresh(jouer);
            JouerEntity jouer = entityManager.find(JouerEntity.class , id);
            entityManager.remove(jouer);
            transaction.commit();
        }finally {
            if(transaction.isActive()) transaction.rollback();
        }
        entityManager.close();
        entityManagerFactory.close();

    }
    public static void main(String[] args) {
       // JouerEntity jouer = findplayer(3);
        deleteplayer(4);
    }
}
