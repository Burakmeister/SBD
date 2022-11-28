package projekt;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;


import pl.projekt.*;

public class Main {
	public static void main(String[] args) {
		try {
	        StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
	        Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
	        SessionFactory factory = meta.getSessionFactoryBuilder().build();
	        Session session = factory.openSession();
	        session.beginTransaction();
	        Adres adres = new Adres(1, "Sokółka", 16100, 
	    			"Broniewskiego", "13b", 69);
	        session.save(adres);
	        session.getTransaction().commit();
	        System.out.print("UDAŁO SIE HIHIHI");
	        session.close();
	    } catch (Exception e) {
	        System.out.print("NIE WIEM CO SIE DZIEJE ALE BUJA");
	        e.printStackTrace();
	    }
	}
}
