package Aerolinea;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;

import Aerolinea.vuelos;

public class Aviones {
	private String nombre;
	private Date fechaDefabricacion;
	private double kmRecorridos;
	private Aeoropuerto aeropuerto;
	private ArrayList<vuelos> vuelos = new ArrayList<vuelos>();

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(Object nombre) {
		throw new nombre();
	}

	public static void mai(String[] args){
		DateFormat = new Date(año 2019, mes septiembre, dia 17);
	}

	public Date getFechaDeFabricacion() {
		throw new FechaDeFabricacion();
	}

	public void setFechaDeFabricacion(Object fechaDefabricacion) {
		throw new Date();
	}

	public double getKmRecorridos() {
		return this.kmRecorridos;
	}

	public void setKmRecorridos(Object kmRecorridos) {
		throw new KmRecorridos();
	}

	public Vehiculo(String nombre, Date fechaDefabricacion , double kmRecorridos, Aeropuerto aeropuerto){
		this.nombre=nombre;
		this.fechaDefabricacion=fechaDefabricacion;
		this.kmRecorridos=kmRecorridos;
		this.aeropuerto=aeropuerto;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getFechaDefabricacion() {
		return fechaDefabricacion;
	}

	public void setFechaDefabricacion(Date FechaDefabricacion) {
		this.fechaDefabricacion = fechaDefabricacion;
	}

	public double getKmRecorridos() {
		return kmRecorridos;
	}

	public int getAeropuerto() {
		return aeropuerto;
	}

	public void setAeropuerto(Aeropuerto aeropuerto) {
		this.aeropuerto = aeropuerto;
	}

}