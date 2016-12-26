package memento;

public class MementoPatterDemo {

	public static void main(String[] args) {
		Originator originator = new Originator();
		CareTaker careTaker = new CareTaker();
		
		originator.setState("State #1");
		originator.setState("State #2");
		careTaker.add(originator.saveStateToMemonto());

		originator.setState("State #3");
		careTaker.add(originator.saveStateToMemonto());
		
		originator.setState("State #4");
		careTaker.add(originator.saveStateToMemonto());
		
	      System.out.println("Current State: " + originator.getState());		

	      originator.getStateFromMemento(careTaker.get(0));
	      System.out.println("First saved State: " + originator.getState());
	      originator.getStateFromMemento(careTaker.get(1));
	      System.out.println("Second saved State: " + originator.getState());
	}
}
