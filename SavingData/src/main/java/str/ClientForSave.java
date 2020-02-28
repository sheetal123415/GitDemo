package str;

import org.hibernate.*;
import org.hibernate.cfg.*;
 
public class ClientForSave { 
 
    public static void main(String[] args)
    {
 
    	Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml"); 
 
        SessionFactory sf = cfg.buildSessionFactory();
        Session session = sf.openSession();
        
        Transaction tx = session.beginTransaction();
        
        Product p=new Product(); 
        p.setProductId(187);
        p.setProName("AfC");
        p.setPrice(15000);
        
        session.save(p);
        System.out.println("Object saved successfully.....!!");
        tx.commit();
        session.close();
        sf.close();
    }
 
}
