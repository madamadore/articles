package it.matteoavanzini.articles;

import org.hibernate.Session;

import it.matteoavanzini.articles.HibernateUtil; 

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Session session = HibernateUtil.getSessionFactory().openSession();
    	
    	Post post = new Post();
    	post.setTitle("test");
    	post.setContent("contenuto");
    	Author author = new Author();
    	author.setName("Matteo");
    	post.setAuthor(author);
    	Category category = new Category();
    	category.setName("Generica");
    	post.addCategory(category);
    	
    	session.beginTransaction();
    	session.save(post);
    	session.getTransaction().commit();
    }
}
