/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sg.edu.nus.iss.vmcs.store;

/**
 *
 * @author Sarita
 */
public interface StoreItemSubject {
    
    public void attachObserver(StoreObserver observer);
    public void detachObserver(StoreObserver observer);
    public void notifyObserver();
}
