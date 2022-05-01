/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Disease;

import Genetics.Genetic_class;
import java.util.List;
/**
 *
 * @author dpsmv
 */
public class Disease_class {
    
    private int Disease_Id;
    private String Disease_Name;
    private List<Genetic_class> Disease_Gene;

    public int getDisease_Id() {
        return Disease_Id;
    }

    public void setDisease_Id(int Disease_Id) {
        this.Disease_Id = Disease_Id;
    }

    public String getDisease_Name() {
        return Disease_Name;
    }

    public void setDisease_Name(String Disease_Name) {
        this.Disease_Name = Disease_Name;
    }

    public List<Genetic_class> getDisease_Gene() {
        return Disease_Gene;
    }

    public void setDisease_Gene(List<Genetic_class> Disease_Gene) {
        this.Disease_Gene = Disease_Gene;
    }

    
    
}
