/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;


import Chemical.Chemical_List_Class;
import Chemical_Repository.Chemical_Mixture_Class;
import Drug.Drug_List_Class;
import Genetics.Genetics_History_Class;
import Network.Network_class;
import Organization.org_class;
import Role.Role_class;
import Role.System_admin_role_class;
import java.util.ArrayList;
/**
 *
 * @author dpsmv
 */
public class EcoCommunity extends org_class{
    
    private static EcoCommunity ecoCommunity;
    private ArrayList<Network_class> Network_List;
    private Chemical_List_Class chemical_List;
    private Drug_List_Class Drug_List;
    private Genetics_History_Class Gene_List;
   
    public static EcoCommunity getInstance(){
        if(ecoCommunity==null){
            ecoCommunity=new EcoCommunity();
        }
        return ecoCommunity;
    }
    
    public Network_class CreateAndAddNetwork(){
           Network_class n =new Network_class();
        Network_List.add(n);
        return n;
    }
    
    @Override
    public ArrayList<Role_class> getSupportedRole() {
        ArrayList<Role_class> r =new ArrayList<Role_class>();
        r.add(new System_admin_role_class());
        return r;
    }
    
     private EcoCommunity(){
        super(null);
        Network_List=new ArrayList<Network_class>();
        Drug_List = new  Drug_List_Class();
        chemical_List = new  Chemical_List_Class();
        Gene_List = new Genetics_History_Class();
    }

    public ArrayList<Network_class> getNetwork_List() {
        return Network_List;
    }

    public void setNetwork_List(ArrayList<Network_class> Network_List) {
        this.Network_List = Network_List;
    }
    
    public boolean check_If_User_Is_Unique(String User_Name){
        if(!this.getUserAccountDirectory().check_If_User_Is_Unique(User_Name)){
            return false;
        }
        for(Network_class network:Network_List){
            
        }
        return true;
    }

    public Chemical_List_Class getChemical_List() {
        return chemical_List;
    }

    public void setChemical_List(Chemical_List_Class chemical_List) {
        this.chemical_List = chemical_List;
    }

    public Drug_List_Class getDrug_List() {
        return Drug_List;
    }

    public void setDrug_List(Drug_List_Class Drug_List) {
        this.Drug_List = Drug_List;
    }

    public Genetics_History_Class getGene_List() {
        return Gene_List;
    }

    public void setGene_List(Genetics_History_Class Gene_List) {
        this.Gene_List = Gene_List;
    }

   

    public static EcoCommunity getEcoCommunity() {
        return ecoCommunity;
    }

    public static void setEcoCommunity(EcoCommunity ecoCommunity) {
        EcoCommunity.ecoCommunity = ecoCommunity;
    }
    
    
    
    
    
}
