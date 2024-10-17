package edu.david.dmp.controladores;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import edu.david.dmp.dtos.ClubDto;
import edu.david.dmp.dtos.UsuarioDto;
import edu.david.dmp.servicios.ConexionPostgresqlImplementacion;
import edu.david.dmp.servicios.ConexionPostgresqlInterfaz;
import edu.david.dmp.servicios.ConsultasPostgresqlImplementacion;
import edu.david.dmp.servicios.ConsultasPostgresqlInterfaz;
import edu.david.dmp.servicios.MenuImplementacion;
import edu.david.dmp.servicios.MenuInterfaz;

public class Inicio {

	public static void main(String[] args) {
		
		ConsultasPostgresqlInterfaz copi = new ConsultasPostgresqlImplementacion();
		ConexionPostgresqlInterfaz cpi = new ConexionPostgresqlImplementacion();
		MenuInterfaz mi = new MenuImplementacion();
		
	 Connection conexion = 	cpi.generaConexion();
		
	 List<ClubDto> listaClub = new ArrayList<ClubDto>();
	 List<UsuarioDto> listaUsu = new ArrayList<UsuarioDto>();
	 
		boolean cerrarMenu = false;
		int opcion;
		while (!cerrarMenu) {
			opcion = mi.menuYSeleccionPrincipal();
			switch (opcion) {
			case 0:
				cerrarMenu = true;
				break;
			case 1:
				int opcionUsuario = mi.menuUsuario();
				switch (opcionUsuario) {
				case 0:
					break;
				case 1:
					copi.solicitarDatosYInsertarUsuario(conexion, listaUsu);
					break;
				case 2:
					copi.respuestaModificarUsu(conexion, listaUsu);
					break;
				case 3:
					copi.eliminarUsu(conexion, listaUsu);
					break;

				default:
					System.out.println("La opcion seleccionada no existe");
					break;
				}
				break;

			case 2:
				int opcionMenu = mi.menuClub();
				switch (opcionMenu) {
				case 0:
					break;
				case 1:
					copi.solicitarDatosYInsertarClub(conexion, listaClub);
					break;
				case 2:
					copi.respuestaModificarClub(conexion, listaClub);
					break;
				case 3:
					copi.eliminarClub(conexion, listaClub);
					break;
					
					
				default:
					System.out.println("La opcion seleccionada no existe");
					break;
				}
				break;
				
			default:
				System.out.println("La opcion seleccionada no existe");
				break;
			}
			
		}

	}

}
