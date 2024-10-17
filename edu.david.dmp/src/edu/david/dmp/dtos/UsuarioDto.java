package edu.david.dmp.dtos;

public class UsuarioDto {

	long id_usuario;
	String nombre_usuario = "aaaaa";
	String email_usuario = "aaaaa";
	String telefono_usuario = "aaaaa";
	String club_usuario = "aaaaa";
	String moto_usuario = "aaaaa";
	String dni_usuario = "aaaaa";
	String contrasenia = "aaaaa";
	public long getId_usuario() {
		return id_usuario;
	}
	public void setId_usuario(long id_usuario) {
		this.id_usuario = id_usuario;
	}
	public String getNombre_usuario() {
		return nombre_usuario;
	}
	public void setNombre_usuario(String nombre_usuario) {
		this.nombre_usuario = nombre_usuario;
	}
	public String getEmail_usuario() {
		return email_usuario;
	}
	public void setEmail_usuario(String email_usuario) {
		this.email_usuario = email_usuario;
	}
	public String getTelefono_usuario() {
		return telefono_usuario;
	}
	public void setTelefono_usuario(String telefono_usuario) {
		this.telefono_usuario = telefono_usuario;
	}
	public String getClub_usuario() {
		return club_usuario;
	}
	public void setClub_usuario(String club_usuario) {
		this.club_usuario = club_usuario;
	}
	public String getMoto_usuario() {
		return moto_usuario;
	}
	public void setMoto_usuario(String moto_usuario) {
		this.moto_usuario = moto_usuario;
	}
	public String getDni_usuario() {
		return dni_usuario;
	}
	public void setDni_usuario(String dni_usuario) {
		this.dni_usuario = dni_usuario;
	}
	public String getContrasenia() {
		return contrasenia;
	}
	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}
	public UsuarioDto() {
		super();
	}
	public UsuarioDto(long id_usuario, String nombre_usuario, String email_usuario, String telefono_usuario,
			String club_usuario, String moto_usuario, String dni_usuario, String contrasenia) {
		super();
		this.id_usuario = id_usuario;
		this.nombre_usuario = nombre_usuario;
		this.email_usuario = email_usuario;
		this.telefono_usuario = telefono_usuario;
		this.club_usuario = club_usuario;
		this.moto_usuario = moto_usuario;
		this.dni_usuario = dni_usuario;
		this.contrasenia = contrasenia;
	}
	
	
	
}
