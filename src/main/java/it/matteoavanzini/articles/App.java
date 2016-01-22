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
    }
}
