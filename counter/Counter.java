package counter;

public class Counter {
	private boolean isSecondNum = false;
	private String lastOp;
	private String firstNum = "0";
	private String secondNum = "null";
	private double store;
	private String numString = "0123456789.";
	private String opString = "+-*/";
	
	public String clearAll(){
		this.firstNum = "0";
		this.secondNum = null;
		return this.firstNum;
	}
	public String callMethod(String cmd, String text){
		if(cmd.equals("C")){
			return clearAll();//«Â¡„
		}
		}else if (cmd.equals("Back")) {
			return backSpace(text);
		}else if (numString.indexOf(cmd) != -1) {
			return catNum(cmd, text);
		}else if (opString.indexOf(cmd) != -1) {
			return setOp(cmd, text);
		}
		else if(cmd.equals("%")){
			return cal(text, true);
		}else if(cmd.equals("=")){
			return cal(text, false);
		}else {
			return mCmd(cmd, text);
		}
	}

}
