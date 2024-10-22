package observerpatterndemo;

import java.util.ArrayList;
import java.util.List;

public class Subject {
	
   private List observers = new ArrayList();
   private int state;

   public int getState() {
      return state;
   }

   public void setState(int state) {
      this.state = state;
       
   }

   public void attach(Observer observer){
      observers.add(observer);		
   }

   // New method to detach an observer
   public void detach(Observer observer){
      observers.remove(observer);
   }

   
   } 	

