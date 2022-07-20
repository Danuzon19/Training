package chainOfResponsibility;

public class ChainOfResp {

	public static void main(String[] args){
		Chain chain1=new AddNumbers();
		
		Chain chain3=new MultiplyNumbers();
		Chain chain4=new DivideNumbers();
		chain3.setNextChain(chain4);
		Numbers request=new Numbers(3,4,"Pow");
		chain1.calculate(request);
	}
}
