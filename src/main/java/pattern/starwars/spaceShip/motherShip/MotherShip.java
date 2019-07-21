package pattern.starwars.spaceShip.motherShip;

import java.util.ArrayList;
import java.util.Observable;

import pattern.starwars.message.Message;

public class MotherShip extends Observable {

	private ArrayList observers;

	public MotherShip() {
		observers = new ArrayList();
	}

	public void order(Message order) {
		setChanged();
		notifyObservers(order);
	}
}