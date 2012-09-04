package model;

import java.util.Observable;

public class MainModel extends Observable {

	public void triggerChange(String what) {
		this.setChanged();
		this.notifyObservers(what);
	}

	public void action() {
		triggerChange("action");
	}
}
