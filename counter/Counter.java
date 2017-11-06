package counter;

public class Counter {
	
	private String lastOp;//储存第二个数
	private String firstNum = null;//储存第一个数
	private double store;
	private String numString = "0123456789.";
	private String opString = "+-×÷%";
	private static int mm;
	
	//清零
	public String clearAll(){
		this.firstNum =null;
		return this.firstNum;
	}
	
	public String backSpace(String text1){
		int m=text1.length();
		this.firstNum =text1.substring(0, m-1);
		return this.firstNum;
	}
	
	public  String catNum(String cmd,String text)
	{
		if(text==null&&".".equals(cmd))
			this.firstNum='0'+cmd;
		   else
			 this.firstNum = text+cmd;
		return this.firstNum;
	}
	
	public  String setOp(String cmd,String text)
	{	
		char m=cmd.charAt(0);
		switch(m)
		{
		case '+': mm=1;break;
		case '-': mm=2;break;
		case '×': mm=3;break;
		case '÷': mm=4;break;
		case '%': mm=5;break;
		}
		
		this.lastOp=text;this.firstNum=null;
		return this.firstNum;
	}
	
	public String cal(String text)
	{
		this.firstNum=text;
		String store1;
		System.out.println(mm);
		switch(mm)
		{
		case 1: this.store=Double.parseDouble( this.lastOp)+Double.parseDouble(this.firstNum);break;
		case 2: this.store=Double.parseDouble( this.lastOp)-Double.parseDouble(this.firstNum);break;
		case 3: this.store=Double.parseDouble( this.lastOp)*Double.parseDouble(this.firstNum);break;
		case 4: if(!"0".equals(this.firstNum)){
			this.store=Double.parseDouble(this.lastOp)/Double.parseDouble(this.firstNum);}
			else
				{store1="被除数不能为零";
				return store1;}
				break;
		case 5: this.store=Double.parseDouble( this.lastOp)%Double.parseDouble(this.firstNum);break;
		}
		 store1=String.valueOf(this.store);
		return store1;
		
	}
	public String callMethod(String cmd,String text){
		if(cmd.equals("C")){
			return clearAll();//清零
		}else if (cmd.equals("←")) {
			return backSpace(text);
		}else if (numString.indexOf(cmd) != -1) {
			return catNum(cmd, text);
		}else if (opString.indexOf(cmd) != -1) {
			return setOp(cmd, text);
		}
		else if(cmd.equals("=")){
			return cal(text);
		}else {
			return null;
		}
	}

}
