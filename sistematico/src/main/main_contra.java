package main;

import java.util.Scanner;

public class main_contra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		String user = "Usuario";
		String input;
		String contra = "Correcto";
		String pass;
		int cont =0;
		do 
		{
			System.out.println("Ingrese el usuario:");
			input = scan.nextLine();
			System.out.println("Contraseña: ");
			pass = scan.nextLine();
			if(input.equals(user.toLowerCase()) || input.equals(user.toUpperCase())|| input.equals(user))
			{
				if(pass.equals(contra.toLowerCase()) || pass.equals(contra.toUpperCase()) || pass.equals(contra)) 
				{
					System.out.println("Bienvenido!");
				}
				break;
			} 
			else
			{
			System.out.println("Vuelva a intentarlo");
			cont++;
			}
			if(cont == 3) {
				System.out.println("Intentos gastados!");
			}
		}
		while(cont!=3);
		
		
	}

}
