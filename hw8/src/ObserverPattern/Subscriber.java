package ObserverPattern;

import java.util.ArrayList;

public interface Subscriber {
	
	ArrayList < Event > events = new ArrayList < Event > ();
	
	public void notifysubscriber();
    public void addEvent(Event e);
    public ArrayList < Event > getEvents();
    
}