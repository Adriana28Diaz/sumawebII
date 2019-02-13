/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suma.model;

import javax.ejb.Stateless;
import suma.model.entities.suma;

/**
 *
 * @author Ironwill
 */
@Stateless
public class ModelSuma {

    public String sumarValores(int n1, int n2)
    {
     suma s=new suma();
     s.setNum1(n1);
     s.setNum2(n2);
     s.setRes(n1+n2);
     return s.getRes()+"";
    }
}
