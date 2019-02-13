/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suma.controller;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import suma.model.ModelSuma;
import suma.model.entities.suma;

/**
 *
 * @author Ironwill
 */
@ManagedBean
@SessionScoped
public class sumaController {
    private String suma;
    private int n1,n2,res;
    @EJB
    private ModelSuma modelsuma;
    public String actionCalcular(){
        suma=modelsuma.sumarValores(n1, n2);
        return "resultado";
    }

    public String getSuma() {
        return suma;
    }

    public void setSuma(String suma) {
        this.suma = suma;
    }
    
    public int getN2() {
        return n2;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }

    public int getRes() {
        return res;
    }

    public void setRes(int res) {
        this.res = res;
    }
    public int getN1() {
        return n1;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

}
