package edu.david.dmp.dtos;

public class ClubDto {
	
	long id_club;
	String nombre_club = "aaaaa";
	String color_club = "aaaaa";
	long id_usuario = 999999999;
	
	public long getId_club() {
		return id_club;
	}
	public void setId_club(long id_club) {
		this.id_club = id_club;
	}
	public String getNombre_club() {
		return nombre_club;
	}
	public void setNombre_club(String nombre_club) {
		this.nombre_club = nombre_club;
	}
	public String getColor_club() {
		return color_club;
	}
	public void setColor_club(String color_club) {
		this.color_club = color_club;
	}
	public long getId_usuario() {
		return id_usuario;
	}
	public void setId_usuario(long id_usuario) {
		this.id_usuario = id_usuario;
	}
	
	
	public ClubDto() {
		super();
	}
	public ClubDto(long id_club, String nombre_club, String color_club, long id_usuario) {
		super();
		this.id_club = id_club;
		this.nombre_club = nombre_club;
		this.color_club = color_club;
		this.id_usuario = id_usuario;
	}

	
}
