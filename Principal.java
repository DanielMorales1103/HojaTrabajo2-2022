import java.util.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class Principal {
	File archivo;
    FileWriter fw;
    static Scanner sw;
	public static void main(String[] args) throws IOException {	
		Calculadora calc = new Calculadora();
		ArrayList<String> lista = new ArrayList<String>();
		File archivo = new File("datos.txt");
		if(!archivo.exists()) {
			System.out.println("Verifique que el archivo exista, se encuentre en la misma carpeta y se llame 'datos.txt'");
		}else {
			sw = new Scanner(archivo);
			while (sw.hasNextLine()) {
				lista.add(sw.nextLine());
			}
			sw.close();
			//archivo dentro de la lista
			
			for(int i = 0; i<lista.size();i++) {// se evalua linea a linea del archivo
				String expresion = lista.get(i);
				if(calc.Evaluate(expresion)==9999999) {
					System.out.println("("+expresion+") = expresión no válida");
				}else {
					System.out.println("("+expresion+") = "+calc.Evaluate(expresion));
				}
				
			}			
			
		}//fin del else de archivo
		
	}
}
