/*
 * Copyright 2003 ISS.
 * The contents contained in this document may not be reproduced in any
 * form or by any means, without the written permission of ISS, other
 * than for the purpose for which it has been supplied.
 *
 */
package sg.edu.nus.iss.vmcs.store;

/**
 * This object is storage, in the vending machine's memory, for the total number of
 * cans of each DrinksBrand held by the vending machine&#46;
 * 
 * @see CashStore
 * @see CashStoreItem
 * @see Coin
 * @see DrinksBrand
 * @see DrinksStoreItem
 * @see Store
 * @see StoreController
 * @see StoreItem
 * @see StoreObject
 * 
 * @version 3.0 5/07/2003
 * @author Olivo Miotto, Pang Ping Li
 */
public class DrinksStore extends Store {
    
    
        private static DrinksStore instance = null;

	/**
	 * This constructor creates an instance of DrinksStore object.
	 */
	private DrinksStore() {
            System.out.println("Private Default Constructor of Singleton DrinksStore Called");
	}

        public static DrinksStore getInstance(){
            if (instance == null){
                instance = new DrinksStore();
            }
            System.out.println("Inside DrinksStore Singleton getInstance()");
            System.out.println("Instantiated static instance of DrinksStore is returned");
            return instance;
        }        
        
}//End of class DrinksStore
