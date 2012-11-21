
public class Postfix {
	
//	private Stack stack;
	//der String muss leerzeichen zwischen den einzelnen term bzw. operatoren enthalten
	
	public int evaluate (String pfx){		
		if (pfx.equals("")){
			Stack <Integer> ablage = new Stack <Integer>();
			String[] stringarray = pfx.split(" ");
			String operator;
			int lhs;
			int rhs;
			for(int i= 0; i<= stringarray.length;i++){
				if (stringarray[i].substring(1).matches("0-9")){
					ablage.push(Integer.parseInt(stringarray[i]));
				}else{
					operator = stringarray[i];
					if (!ablage.empty()){
					lhs = ablage.pop();
					rhs = ablage.pop();
					String result = lhs + operator +  rhs;
					ablage.push(Integer.parseInt(result));	
					}
				}
			}
			return ablage.pop();
		}	
	}
}

