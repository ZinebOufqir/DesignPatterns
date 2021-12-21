package com.observer;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Flow.Subscriber;

public class Channel {
      List<Suscriber> subs= new ArrayList<>();
      private String title;
      
      public String getTitle() {
		return title;
	}

	

	public void suscribe(Suscriber sub) {
    	  subs.add(sub);
      }
      
      public void unsuscribe(Suscriber sub) {
    	  subs.remove(sub);
      }
      
      public void notifySub() {
    	  for(Suscriber sub : subs) {
    		  sub.update();
    	  }
      }
      public void upload(String title) {
		this.title=title;
		notifySub();
	}
}
