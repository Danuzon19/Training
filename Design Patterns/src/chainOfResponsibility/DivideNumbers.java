package chainOfResponsibility;


public class DivideNumbers implements Chain {
	private Chain nextInChain;
	
	@Override
	public void setNextChain(Chain nextChain) {
		// TODO Auto-generated method stub
		nextInChain=nextChain;
	}

	@Override
	public void calculate(Numbers request) {
		// TODO Auto-generated method stub
		if(request.getOperation()=="Div"){
			System.out.print(request.getNum1() + " / " + request.getNum2() + " = "+ 
		                         (request.getNum1()/request.getNum2()));
		}
		else{
			nextInChain.calculate(request);
		}
	}

}
