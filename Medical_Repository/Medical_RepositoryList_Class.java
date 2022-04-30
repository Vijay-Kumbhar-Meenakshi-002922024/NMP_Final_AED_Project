/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Medical_Repository;
import java.util.ArrayList;
/**
 *
 * @author dpsmv
 */
public class Medical_RepositoryList_Class {
    
    
        private ArrayList<Medical_Repository_Class> Medicine_List;
        
        public Medical_RepositoryList_Class() {
        Medicine_List=new ArrayList<>();
        }

    public ArrayList<Medical_Repository_Class> getMedicine_List() {
        return Medicine_List;
    }

    public void setMedicine_List(ArrayList<Medical_Repository_Class> Medicine_List) {
        this.Medicine_List = Medicine_List;
    }
    
    
     public Medical_Repository_Class add_Medicine()
    {
        Medical_Repository_Class M = new Medical_Repository_Class();
        Medicine_List.add(M);
        return M;
    }
    
     public void deleteMedicine(Medical_Repository_Class M){
     Medicine_List.remove(M);
    }
     
}
