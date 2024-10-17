package edu.david.dmp.servicios;

import java.sql.Connection;
import java.util.List;

import edu.david.dmp.dtos.ClubDto;
import edu.david.dmp.dtos.UsuarioDto;

public interface ConsultasPostgresqlInterfaz {

	public void solicitarDatosYInsertarUsuario(Connection conexion, List<UsuarioDto> usuarios);
	
	public void respuestaModificarUsu(Connection conexion, List<UsuarioDto> usuarios);
	
	public void eliminarUsu(Connection conexion, List<UsuarioDto> usuarios);
	
	public void solicitarDatosYInsertarClub(Connection conexion, List<ClubDto> listaClubs);
	
	public void respuestaModificarClub(Connection conexion, List<ClubDto> listaClubs);
	
	public void eliminarClub(Connection conexion, List<ClubDto> listaClubs);
	
}
