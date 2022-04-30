/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Enterprise;
import Organization.org_class;
import Organization.org_directory_class;
/**
 *
 * @author dpsmv
 */
public abstract class Enterprise_class extends org_class{
    
     private EnterpriseType Enterprise_Type;
    private org_directory_class Org_Diectory;
    
      
     public org_directory_class getOrg_Diectory() {
        return Org_Diectory;
    }
    
    public enum EnterpriseType{
        Hospital("Hospital"),
        Pharmacy("Pharmacy"),
        Drug("Drug"),
        Chemical("Chemical");
        
        private String value;
        
        private EnterpriseType(String value){
            this.value=value;
        }
        public String getValue() {
            return value;
        }
        @Override
        public String toString(){
        return value;
    }
    }

    public EnterpriseType getEnterprise_Type() {
        return Enterprise_Type;
    }

    public void setEnterprise_Type(EnterpriseType Enterprise_Type) {
        this.Enterprise_Type = Enterprise_Type;
    }
    
     public Enterprise_class(String name,EnterpriseType type){
        super(name);
        this.Enterprise_Type=type;
        Org_Diectory=new org_directory_class();
    }

    

    public void setOrg_Diectory(org_directory_class Org_Diectory) {
        this.Org_Diectory = Org_Diectory;
    }
 
}
