package sg.edu.nus.iss.vmcs.customer;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Sarita Sethy
 */
public abstract class Observable {
  private List<Observer> observers;
  public void addObserver(Observer o)
  {
      if(observers==null)
      {
          observers = new ArrayList<Observer>();
      }
      observers.add(o);
  };
  public void removeObserver(Observer o)
  {
      if(observers!=null)
      {
          observers.remove(o);
      }
  };
  
  public  void notifyObserver()
  {
      for(Observer o:observers)
      {
          o.update(this);
      }
  };
  public abstract void setState(Object o);
  public abstract Object getState();
 
}
