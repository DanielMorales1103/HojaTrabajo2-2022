import java.lang.*;
public class Calculadora implements IPosfixCalc{

	@Override
	//parametro string
	//función para evaluar y devolver el resultado
	public int Evaluate(String expresion) {
		// TODO Auto-generated method stub
		int num1;
		int num2;
		int resultado=0;
		try {
			StackArrayList<Integer> stack = new StackArrayList<Integer>();
			expresion = expresion.trim();
			for (int i = 0; i<expresion.length();i++) {
				char l = expresion.charAt(i);
				if (Character.isDigit(l)) {//si es un número hace un push
					int j = Character.getNumericValue(l);
					stack.push(j);
				}else {//si es un operando hace pull, realiza la operación y hace push del resultado
					switch(l) {
					case '+':						
						num2 = stack.pull();
						num1 = stack.pull();					
						resultado = num1 + num2;
						stack.push(resultado);
						break;
					case '-':						
						num2 = stack.pull();
						num1 = stack.pull();						
						resultado = num1 - num2;
						stack.push(resultado);
					case '*':
						num2 = stack.pull();
						num1 = stack.pull();
						resultado = num1 * num2;
						stack.push(resultado);
						break;
					case '/':
						num2 = stack.pull();
						num1 = stack.pull();
						resultado = num1 / num2;
						stack.push(resultado);
						break;
					case ' ':
						break;
					}
				}
			}
			return resultado;
		}catch(Exception e){
			return 9999999;
		}
		
		
	}

}
