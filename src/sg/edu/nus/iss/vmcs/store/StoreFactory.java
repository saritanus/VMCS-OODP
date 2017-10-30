/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sg.edu.nus.iss.vmcs.store;

/**
 *
 * This is a Factory Class to Instantiate CashStore and DrinksStore
 * 
 * @author Gautam Krishnan Chittaranjana
 * @version 1.0 30/10/2017
 */
public class StoreFactory {
    
    public static Store getStore (String store) {
        if (store == null) {
            return null;
        }
        if (store.equalsIgnoreCase("Cash")) {
            System.out.println(">>Inside StoreFactoy.getStore(), method returns Singleton instance of CashStore");
            return CashStore.getInstance();
        }
        else if (store.equalsIgnoreCase("Drinks")) {
            System.out.println(">>Inside StoreFactoy.getStore(), method returns Singleton instance of DrinksStore");
            return DrinksStore.getInstance();
        }
        
        return null;
    }
    
}
