/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testing;

import dao.EquipoDao;
import org.junit.Test;

/**
 *
 * @author rafaelm
 */
public class TestingEquipoDao {
    @Test
    public void hello(){
        EquipoDao equipoDao = new EquipoDao();
        equipoDao.saveEquipo("Alemania", "Europeo");
        //System.out.println(equipoDao.getEquipoById(1));
        
        
        
    }
}
