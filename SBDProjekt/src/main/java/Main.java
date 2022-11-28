import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class Main {
	public static void main(String[] args) {
		try {
	        StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
	        Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
	        SessionFactory factory = meta.getSessionFactoryBuilder().build();
	        Session session = factory.openSession();
	        session.beginTransaction();
	        Koszyk koszyk = new Koszyk();
	        Uzytkownik user = new Uzytkownik("Michał", "Dorosz", "BURAK", new Date(),
	    			true, koszyk);
	        session.save(koszyk);
	        session.getTransaction().commit();
	        session.beginTransaction();
	        session.save(user);
	        session.getTransaction().commit();
	        System.out.print("UDAŁO SIE HIHIHI");
	        session.close();
	    } catch (Exception e) {
	        System.out.print("NIE WIEM CO SIE DZIEJE ALE BUJA");
	        e.printStackTrace();
	    }
	}
}
