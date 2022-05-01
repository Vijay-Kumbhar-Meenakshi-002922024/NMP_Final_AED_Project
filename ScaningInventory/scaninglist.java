/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.ScaningInventory;

import Business.ChemicalInventory.ChemicalCompound;
import java.util.ArrayList;

/**
 *
 * @author dsnik
 */
public class scaninglist {
    
    private ArrayList<scaning> scanlist;

    public scaninglist() {
        scanlist =  new ArrayList<scaning>();
    }

    public ArrayList<scaning> getscanList() {
        return scanlist;
    }

    public void setscanlist(ArrayList<scaning> scanlist) {
        this.scanlist = scanlist;
    }
    
    public scaning addscanlist()
    {
        scaning ci = new scaning();
        scanlist.add(ci);
        return ci;
    }
    
   
}
