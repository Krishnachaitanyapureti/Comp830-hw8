package ObserverPattern;

public interface Publisher {

	
	public void registerSubscriber(Subscriber s);
	
	public Boolean unregisterSubscriber(Subscriber s);
	
	
	public void notifySubscribers(Event e);
		
		
	
}