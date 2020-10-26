package ObserverPattern;

import java.util.ArrayList;

public class SubscriberEven implements Subscriber{
	
	private int eventsHandled;
	private int turnOffThreshold;
	
	public SubscriberEven(int i)
	{
		
	}
	 public  void notifysubscriber(Event e) {
	        if (e.getEventDataValue() % 2 == 0) {
	            System.out.println("SubscriberEvens Event " + e.getEventSeqNum() + " is even: " + e.getEventDataValue());
	            this.addEvent(e);
	           
	        }
	    }
	
	 public void unregisterMe(PublisherImpl p) {
	        p.unregisterSubscriber(this);
	        events.clear();
	    }
	 
	public void addEvent(Event e) {
        events.add(e);
    }

    public ArrayList < Event > getEvents() {
        return events;
    }

	
    public int getEventsHandled() {
		return eventsHandled;
	}

	public void setEventsHandled(int eventsHandled ) {
		this.eventsHandled = eventsHandled;
	}
	@Override
	public void notifysubscriber() {
		// TODO Auto-generated method stub
		
	}	
}