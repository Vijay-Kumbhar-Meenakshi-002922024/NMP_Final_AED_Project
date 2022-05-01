/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Network;
import Enterprise.Enterprise_Directory;
/**
 *
 Pavan
 * @author korapava
=======
 * @author dpsmv
 main
 */
public class Network_class {
     private String name;
    private Enterprise_Directory enterpriseDirectory;
    
    public Network_class(){
        enterpriseDirectory=new Enterprise_Directory();
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Enterprise_Directory getEnterpriseDirectory() {
        return enterpriseDirectory;
    }
    
    @Override
    public String toString(){
        return name;
    }
    
}
