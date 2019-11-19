package ejercicios;
import java.util.Scanner;

public class ejercicio8 {

	public static void main(String[] args) {
	 String usuario=null , pwd =null;
	 Scanner sc = new Scanner(System.in);
	 System.out.println("usuario");
	 usuario = sc.next();
	 System.out.println("contraseña");
	 pwd = sc.next();
	 if (usuario.equals("sara")) {
		 if (pwd.equals("sarita"))
			 System.out.println("usuario y contraseña, bienvenido al hogar");
		 else
			 System.out.println("contraseña incorrecta");
	 } else
		 System.out.println("usuario incorrecto");
	 
	 

	}

}
