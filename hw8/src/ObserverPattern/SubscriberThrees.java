package ObserverPattern;

import java.util.ArrayList;

public class SubscriberThrees implements Subscriber {
	
	private int eventsHandled;
	private int turnOffThreshold;
	
	public SubscriberThrees(int i) 
	{
		
	}
	
public boolean notifySubscriber(Event e) {
		
		if(e.getEventDataValue()%3==0)
		{
			eventsHandled++;
			if (eventsHandled<=turnOffThreshold)
			{
				System.out.println("SubscriberThrees: Event is divided by 3:");
				System.out.println("Events Handled for SubscriberThrees "+ getEvents());
				return true;
			}
			
			else {
				System.out.println("Threshold reached");
				if(eventsHandled%40 ==0) 
				{
					System.out.println("Events Handled will be  0");
					eventsHandled = 0;
					return false;
				}
			}
		}

		return false;

	}

	 
	 public void unregisterMe(PublisherImpl p) {
	        p.unregisterSubscriber(this);
	        events.clear();
	    }
	 
	 
	 public void addEvent(Event e) {
	        events.add(e);
	    }

	 public ArrayList<Event> getEvents() {
			return events;
		}

	
	private void setEventsHandled(Boolean b) {
		
	}

	private boolean getEventsHandled() {
		return false;
		
	}

	@Override
	public void notifysubscriber() {
		// TODO Auto-generated method stub
		
	}


}
