package edu.david.dmp.servicios;

import java.util.Scanner;

public class MenuImplementacion implements MenuInterfaz {

	Scanner scanner = new Scanner(System.in);
	@Override
	public int menuYSeleccionPrincipal() {
		
		int opcion;
		System.out.println("0. Cerrar");
		System.out.println("1. Menu Usuario");
		System.out.println("2. Menu Club");
		opcion = scanner.nextInt();
		
		return opcion;
	}

	@Override
	public int menuUsuario() {
		
		int opcion;
		System.out.println("0. Volver");
		System.out.println("1. Dar alta usuario");
		System.out.println("2. Modificar usuario");
		System.out.println("3. Dar de baja usuario");
		opcion = scanner.nextInt();
		return opcion;
	}

	@Override
	public int menuClub() {
		int opcion;
		System.out.println("0. Volver");
		System.out.println("1. Dar alta club");
		System.out.println("2. Modificar club");
		System.out.println("3. Dar de baja club");
		opcion = scanner.nextInt();
		return opcion;
		
	}

}
