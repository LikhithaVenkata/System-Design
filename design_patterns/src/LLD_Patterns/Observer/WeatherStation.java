package LLD_Patterns.Observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Observable{
	List<Observer> observers=new ArrayList<>();
	int temperature=32;

	@Override
	public void addObserver(Observer o) {
		observers.add(o);	
	}

	@Override
	public void removeObserver(Observer o) {
		observers.remove(o);
	}

	@Override
	public void notifyObservers() {
		for(Observer o : observers)
				o.update(temperature);
	}
	
	public void setTemperature(int temp)
	{
		this.temperature=temp;
		notifyObservers();
	}

}
