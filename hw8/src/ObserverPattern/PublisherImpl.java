package ObserverPattern;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class PublisherImpl implements Publisher{

	private ArrayList<Subscriber> subscribers= new ArrayList<Subscriber>();
	ArrayList < Subscriber > unsubscribers = new ArrayList < Subscriber > ();
	
	PublisherImpl() {
		
	}
	public Boolean unregisterSubscriber(Subscriber s) {
		subscribers.remove(s);
		return unsubscribers.add(s);
		
	}
	public void notifySubscriber(Event e) {
		
		for (int i = 0; i < subscribers.size(); i++) {
            subscribers.get(i).notifysubscriber();
        }
		
	}
	 private Event generateEvent(int eNum, int eData) {
	        Event e = new Event();
	        return e;
	    }
	 
	 
	 
	 public boolean runSimulation()
		{
			int i, nextrandom;
			boolean b = false ;
					
			for (i=0;i<200;i++)
			{
				Random r= new Random();
				nextrandom = r.nextInt(500);
				Event event = generateEvent(nextrandom, nextrandom);			
				event.EventDataValue=nextrandom;
				event.EventSequenceNum = i;
				System.out.println(event.getEventDataValue() +" "+ event.getEventSeqNum());
			}
			
			return b;
		}
	 public ArrayList < Subscriber > getSubs() {
	        return subscribers;
	    }

	    public ArrayList < Subscriber > getUsubs() {
	        return unsubscribers;
	    }
		@Override
		public void registerSubscriber(Subscriber s) {
			// TODO Auto-generated method stub
			
		}
		@Override
		public void notifySubscribers(Event e) {
			// TODO Auto-generated method stub
			
		}

}
