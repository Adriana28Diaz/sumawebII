/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suma.model.services;

import javax.ejb.EJB;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import suma.model.ModelSuma;
import suma.model.entities.suma;

/**
 *
 * @author Ironwill
 */
@WebService(serviceName = "WSSuma")
public class WSSuma {

    @EJB
    private ModelSuma ejbRef;// Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Web Service Operation")

    @WebMethod(operationName = "sumarValores")
    public String sumarValores(@WebParam(name = "n1") int n1, @WebParam(name = "n2") int n2) {
        return ejbRef.sumarValores(n1, n2);
    }
    
}
