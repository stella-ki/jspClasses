package com._05_29.cal;

public class Calc {
	private CalcParam calcP;
	
	public Calc(CalcParam calcP){
		this.calcP = calcP;
	}
	
	public void calculate(){		
		int result = 0;
		switch (calcP.getOperator()) {
		case "+":
			result = getPlus();
			break;
		case "-":
			result = getMinus();
			break;
		case "/":
			result = getDivide();
			break;
		case "*":
			result = getDivide();
			break;
		}		
		calcP.setResult(result);
	}
	
	public int getPlus(){
		return calcP.getNum1() + calcP.getNum2();
	}
	
	public int getMinus(){
		return calcP.getNum1() - calcP.getNum2();
	}
	
	public int getMultiple(){
		return calcP.getNum1() * calcP.getNum2();
	}

	public int getDivide(){
		return calcP.getNum1() / calcP.getNum2();
	}
}
