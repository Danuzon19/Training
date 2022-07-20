package factory;



public class Exec {
	 public static void main(String[] args) {
		Mobile mobile = MobileFactory.createMobile(Mobile.SAMSUNG);

		System.out.println(mobile);
	}
}
