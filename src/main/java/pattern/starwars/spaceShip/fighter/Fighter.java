package pattern.starwars.spaceShip.fighter;

import java.util.Observable;
import java.util.Observer;

import pattern.starwars.message.Message;

public class Fighter implements Observer {
	
	public void receiveOrder(Message message) {
		
	}

	@Override
	public void update(Observable observable, Object message) {
		if(message instanceof Message) {
			receiveOrder((Message)message);
		}
	}
}