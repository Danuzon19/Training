package singleton;



public class SimpleSingleton {


    private SimpleSingleton(){
    	
    }

    private static SimpleSingleton instance = null;

    public static SimpleSingleton getInstance(){
        if(instance == null){
            instance = new SimpleSingleton();
        }
        return instance;
    }

    public void VoidHello(){
        System.out.println("Hello from singleton class");
    }

   
}
