package model;

import java.util.Observable;

public class MainModel extends Observable {

	public void trigerChange(String what) {
		this.setChanged();
		this.notifyObservers(what);
	}

	public void action() {
		trigerChange("action");
	}
}
