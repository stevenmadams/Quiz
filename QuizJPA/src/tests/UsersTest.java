package tests;

import static org.junit.Assert.*;

import java.text.ParseException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import entities.Users;

public class UsersTest {
	 private EntityManagerFactory emf;
	 private EntityManager em;

	 @Before
	    public void setUp() throws Exception {
	        emf = Persistence.
	            createEntityManagerFactory("QuizJPA");
	        em = emf.createEntityManager();
	    }

	    @Test
	    public void test() throws ParseException {
	    	Users users = em.find(Users.class, 1);
	    	
	    	assertEquals("steven", users.getUsername());
	    	assertEquals("password", users.getPassword());

	    }

	    @After
	    public void tearDown() throws Exception {
	        em.close();
	        emf.close();
	    }

}
