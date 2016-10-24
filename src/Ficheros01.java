import java.io.File;
import java.util.Scanner;


public class Ficheros01 {

	public static void main(String[] args) {
		File fichero = new File("E:\\2ºDamm\\Acceso a datos\\EjercicioFicheros01\\DAM_AAD_Ficheros_Ejercicio1.txt");
		Scanner s = null;
		try{
			s = new Scanner(fichero).useDelimiter(",");
			while(s.hasNext()){
				String linea = s.next();
				System.out.println(linea);
			}
			
		}catch(Exception ex){
			System.out.println("Mensaje : " + ex.getMessage());

		}finally{
			try{
				if(s != null)
					s.close();
			}catch(Exception ex2){
					System.out.println("Mensaje 2: " + ex2.getMessage());
			}
		}
	}
}


