package ObserverPattern;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SubscriberEvenTest {

	@Test
	void test()
	{
		PublisherImpl pub = new PublisherImpl();
		boolean b = pub.runSimulation();
		assertEquals(true,b);
		
	}
		
	}
