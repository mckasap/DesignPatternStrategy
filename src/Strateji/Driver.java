package Strateji;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Hulk h= new Hulk();
				
			h.fly();
			h.setFl(new FlyWithDrug());
		    h.fly();
		    h.setFl(new flywithRocket());
		    h.fly();
	}

}
