/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.indocyber.kurir.view;

import com.indocyber.kurir.dao.TarifAntarKotaDAO;
import com.indocyber.kurir.dao.dataTarifPaketDAO;
import com.indocyber.kurir.model.DataPaket;
import java.util.List;

/**
 *
 * @author user
 */
public class tes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<DataPaket> cost = TarifAntarKotaDAO.getKotaList();
        
        List<DataPaket> pack = dataTarifPaketDAO.getPaketList();
        
        
        for (DataPaket costDelivery : cost) {
            System.out.println("costDelivery = " + costDelivery.getTarif()+" from: "+ costDelivery.getKotaAsal()+" to: "+costDelivery.getDestinasi());
        }
        for (DataPaket packageCost : pack) {
            System.out.println("costDelivery = " + packageCost.getTarifPaket()+" from: "+ packageCost.getJenisLayanan());
        }
    }
    
}
