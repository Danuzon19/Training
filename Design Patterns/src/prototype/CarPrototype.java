package prototype;

public abstract class CarPrototype {
	protected double buyValue;
	
	public double getBuyValue() {
		return buyValue;
	}

	public void setBuyValue(double buyValue) {
		this.buyValue = buyValue;
	}

	public abstract String showInfo();
	
	public abstract CarPrototype clone();	
}
