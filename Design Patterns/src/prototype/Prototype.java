package prototype;


public class Prototype {

	public static void main(String[] args) {
		FiestaPrototype fiestaPrototype = new FiestaPrototype();
		
		CarPrototype fiestaNovo = fiestaPrototype.clone();
		fiestaNovo.setBuyValue(30000.00);
		
		CarPrototype fiestaUsado = fiestaPrototype.clone();
		fiestaUsado.setBuyValue(22000.00);
		
		System.out.println(fiestaNovo.showInfo());
		System.out.println(fiestaUsado.showInfo());
	}

}
