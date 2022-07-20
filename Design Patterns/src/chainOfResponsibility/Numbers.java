package chainOfResponsibility;


public class Numbers {
	private float num1;
	private float num2;
	private String operationWanted;
	
	public Numbers(float n1,float n2, String opr){
		num1=n1;
		num2=n2;
		operationWanted=opr;
	}
	
	public float getNum1(){
		return num1;
	}
	
	public float getNum2(){
		return num2;
	}
	
	public String getOperation(){
		return operationWanted;
	}

}
