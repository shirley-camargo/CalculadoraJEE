/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unipiloto.metodos.session;

import javax.ejb.Stateless;

/**
 *
 * @author Lenovo
 */
@Stateless
public class CalcBin implements CalcBinLocal {

    @Override
    public Integer suma(int val1, int val2) {
        return val1 + val2;
    }
   
}
