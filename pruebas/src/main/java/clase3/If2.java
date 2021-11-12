package clase3;

import java.util.Scanner;

public class If2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		//Ingresar contraseña y u suario
		//si contraseña = "1234" y usuario = admin
		// de lo contrario "fail"
		
			String usuario;
			String password;
			
			usuario = "edwin";
			password = "12345";
			
			if(usuario  == "admin" && password == "1234") {
				System.out.println("ok");
			}else {
				System.out.println("fail");
			}
			
			if (usuario == "admin") {
				if(password =="1234") {
					System.out.println("ok");
				}else {
					System.out.println("fail");
				}
			}else {
				System.out.println("fail");
			}
	
}
}