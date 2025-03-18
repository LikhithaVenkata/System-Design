package LLD_Patterns.Observer;

public class Main {

	public static void main(String[] args) {
		WeatherStation w=new WeatherStation();
		Phone p=new Phone();
		TV t=new TV();
		w.addObserver(p);
		w.addObserver(t);
		w.setTemperature(30);
	}

}
