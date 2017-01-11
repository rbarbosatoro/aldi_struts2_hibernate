package org.empleodigital.struts.Aldi.db;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.empleodigital.struts.Aldi.models.Cliente;
import org.hibernate.mapping.List;


public class GestorUsuarios {
	
    private static final EntityManagerFactory ENTITY_MANAGER_FACTORY = Persistence
            .createEntityManagerFactory("Aldi");

    public static Cliente getCliente(String user,String pwd){
        EntityManager manager = ENTITY_MANAGER_FACTORY.createEntityManager();

        Cliente cli=null;
        try{
        	String select = "FROM Cliente WHERE usuario=:userName and password=:password"; 
        	Query query=manager.createQuery(select);  
        	query.setParameter("userName", user);
        	query.setParameter("password", pwd);
        	
        	cli = (Cliente) query.getSingleResult();
        }catch(Exception e){
        	e.printStackTrace();
        }finally{
        	manager.close();
        }
        return cli;
    	
    }
    public static void create(String nombre,String apellido1,String apellido2,String direccion,String email,int telefono,String user, String pwd) {
        // Create an EntityManager
        EntityManager manager = ENTITY_MANAGER_FACTORY.createEntityManager();
        EntityTransaction transaction = null;

        try {
            // Get a transaction
            transaction = manager.getTransaction();
            // Begin the transaction
            transaction.begin();

            // Create a new Student object
            Cliente cli = new Cliente(nombre,apellido1,apellido2,direccion,telefono,email,user,pwd);

            // Save the student object
            manager.persist(cli);
            

            // Commit the transaction

            transaction.commit();
        } catch (Exception ex) {
            // If there are any exceptions, roll back the changes
            if (transaction != null) {
                transaction.rollback();
            }
            // Print the Exception
            
            ex.printStackTrace();
        } finally {
            // Close the EntityManager
            manager.close();
        }
    }
}
