/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DB4O;

import Business.System_Configuration_Class;
import Business.EcoCommunity;
import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.config.EmbeddedConfiguration;
import com.db4o.query.Predicate;
import com.db4o.ta.TransparentPersistenceSupport;
import java.nio.file.Paths;

/**
 *
 * @author dpsmv
 */
public class DB40_Class {
    
    private static final String FILENAME = Paths.get("Databank.db4o").toAbsolutePath().toString();// path to the data store
    private static DB40_Class dB4OUtil;
    
     public synchronized static DB40_Class getInstance(){
        if (dB4OUtil == null){
            dB4OUtil = new DB40_Class();
        }
        return dB4OUtil;
    }
    
     protected synchronized static void shutdown(ObjectContainer con) {
        if (con != null) {
            con.close();
        }
    }

     private ObjectContainer createConnection() {
        try {

            EmbeddedConfiguration config = Db4oEmbedded.newConfiguration();
            config.common().add(new TransparentPersistenceSupport());
            //Controls the number of objects in memory
            config.common().activationDepth(Integer.MAX_VALUE);
            //Controls the depth/level of updation of Object
            config.common().updateDepth(Integer.MAX_VALUE);

            //Register your top most Class here
            config.common().objectClass(EcoCommunity.class).cascadeOnUpdate(true); // Change to the object you want to save

            ObjectContainer db = Db4oEmbedded.openFile(config, FILENAME);
            return db;
        } catch (Exception ex) {
            System.out.print(ex.getMessage());
        }
        return null;
    } 
     
      public synchronized void storeSystem(EcoCommunity sys) {
        ObjectContainer con = createConnection();
        con.store(sys);
        con.commit();
        con.close();
    }
    
     public void deleteOldSystem(ObjectContainer con) {
        ObjectSet<EcoCommunity> systems = con.query(new Predicate<EcoCommunity>() {
            @Override
            public boolean match(EcoCommunity et) {
                return true;
            }
        });
        for (EcoCommunity ecoSystem : systems) {
            con.delete(ecoSystem);
        }
    }
    
   public EcoCommunity retrieveSystem(){
        ObjectContainer conn = createConnection();
        ObjectSet<EcoCommunity> systems = conn.query(EcoCommunity.class); // Change to the object you want to save
        EcoCommunity system;
        if (systems.size() == 0){
            system = System_Configuration_Class.configure();  // If there's no System in the record, create a new one
        }
        else{
            system = systems.get(systems.size() - 1);
        }
        conn.close();
        return system;
    }  
     
}
