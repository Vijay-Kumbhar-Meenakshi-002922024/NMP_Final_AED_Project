

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Insurance;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author dpsmv
 */
public class InsurancePolicyRepo {
  
     private List<Insurance> policies = new ArrayList<>();

    public List<Insurance> getPolicies() {
        return policies;
    }

    public void setPolicies(List<Insurance> policies) {
        this.policies = policies;
    }
    
}
