package Strateji;

public abstract class Human {

	 private flyable fl;

	 
	 public void fly() {
		 fl.fly();
		 
	 }
	 
	public flyable getFl() {
		return fl;
	}

	public void setFl(flyable fl) {
		this.fl = fl;
	}
	 
	
}
