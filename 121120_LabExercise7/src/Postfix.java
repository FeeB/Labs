public class Postfix {

	// private Stack stack;
	// der String muss leerzeichen zwischen den einzelnen term bzw. operatoren
	// enthalten

	public LinkedListItem<Integer> evaluate(String pfx)
			throws UnderflowException {
		if (!pfx.equals("")) {
			Stack<Integer> ablage = new Stack<Integer>();
			String[] stringarray = pfx.split(" ");
			String operator;
			LinkedListItem<Integer> lhs;
			LinkedListItem<Integer> rhs;
			for (int i = 0; i < stringarray.length; i++) {
				if (stringarray[i].matches("(\\d)")) {
					ablage.push(Integer.parseInt(stringarray[i]));
				} else {
					operator = stringarray[i];
					if (!ablage.empty()) {
						rhs = ablage.pop();
						lhs = ablage.pop();
						if (operator.equals("+")) {
							int result = lhs.value + rhs.value;
							ablage.push(result);
						} else if (operator.equals("-")) {
							int result = lhs.value - rhs.value;
							ablage.push(result);
						} else if (operator.equals("*")) {
							int result = lhs.value * rhs.value;
							ablage.push(result);
						} else if (operator.equals("/")) {
							int result = lhs.value / rhs.value;
							ablage.push(result);
						}
					}
				}
			}
			System.out.println("Das Ergebnis lautet: "+ ablage.pop().value);
			return ablage.pop();
		}
		throw new UnderflowException("Stack Underflow");
	}
}
