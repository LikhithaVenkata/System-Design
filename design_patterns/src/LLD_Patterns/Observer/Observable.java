package LLD_Patterns.Observer;

public interface Observable {
		void addObserver(Observer o);
		void removeObserver(Observer o);
		void notifyObservers();
}
