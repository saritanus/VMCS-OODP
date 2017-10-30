/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sg.edu.nus.iss.vmcs.store;

/**
 *
 * @author Srishti Bhargava
 */
public class CashStoreIterator extends StoreIterator{
	private CashStore store;
        
	public CashStoreIterator(CashStore store) {            
		super(store);
		this.store=store;                
	}
        
	public int findCashStoreIndex (Coin c) 
        {            
		super.First();
                
		while(super.hasNext())
                {
			StoreItem item=super.next();
			if(item!=null)
                        {
				Coin current = (Coin) item.getContent();
				if (current.getWeight() == c.getWeight())
                                {
                                    System.out.println(">>Iterator Pattern:When the coin has been entered and its weight has been checked then"
                                        + "traversal algorithm of findStoreIndex will be called that has been implemented in CashStoreIterator(ConcreteIterator) "
                                        + "to find the index where the entered coin needs to be stored");
                                    return super.getCurrent() - 1;
				}
			}
		}		
		return -1;
        }
    
        public Coin findCoin(double weight)
        {            
            super.First();
            while(super.hasNext())
            {
		StoreItem item=super.next();
		if(item!=null){
                    Coin current = (Coin) item.getContent();
                    if (current.getWeight() == weight){
                        System.out.println("Iterator Pattern:When a coin is entered its weight is checked to find its"
                               + "denomination. The traversal algorithm for matching the weight has been implemented in CashStoreIterator");
                        return current;                                                  
			}
		}
            }		
	return null;
	}
}
