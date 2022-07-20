package singleton;



public class Main {

    public static void main(String[] args) {
	

    	SimpleSingleton simple= SimpleSingleton.getInstance();
    	SimpleSingleton simple1= SimpleSingleton.getInstance();
        
        
        
        simple.VoidHello();
        simple1.VoidHello();
    }
}

