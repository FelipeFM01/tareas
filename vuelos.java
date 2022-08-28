package Aerolinea;

import java.util.ArrayList;
import java.util.List;

import Aerolinea.Piloto;

public class vuelos {
	private String ciudadOrigen;
	private Date fechaInicioVuelo;
	private String ciudadDestino;
	private int pasajeros;
	private String rutPasajeros;
	private Date fechaDestinoVuelo;
	private Date horaVuelo;
	private String pasajerosConMismoVuelo;
	private String pasajeroyFechaDeVuelo;
	private List<Pasaporte> vueloConTestPCRnegativo;
	private Aviones aviones;
	private Ciudad ciudadOrigen;
	private Ciudad ciudadDestino;
	private Pasajero pasajero;
	private ArrayList<Piloto> piloto = new ArrayList<Piloto>();


	public List<Aviones> getAviones() {
		return Aviones;
	}

	public void AvionesEnPreparacion(){
		this.Aviones.add(new avion("latam airlines","2016","8563","Santiago"));
		this.Aviones.add(new avion("latam airlines","2016","5469","Arica"));
		this.Aviones.add(new avion("latam airlines","2016","9001","Punta Arenas"));
		this.Aviones.add(new avion("latam airlines","2016","6572","Osorno"));
		this.Aviones.add(new avion("latam airlines","2016","3000","Concepcion"));
	}

	public Date getHoraVuelo() {
		return this.horaVuelo;
	}

	public void setHoraVuelo(Object horaVuelo) {
		throw new UnsupportedOperationException();
	}

	public String getPasajerosConMismoVuelo() {
		return this.pasajerosConMismoVuelo;
	}

	public void setPasajerosConMismoVuelo(Object pasajerosConMismoVuelo) {
		throw new UnsupportedOperationException();
	}

	public String getPasajeroyFechaDeVuelo() {
		return this.pasajeroyFechaDeVuelo;
	}

	public void setPasajeroyFechaDeVuelo(Object pasajeroyFechaDeVuelo) {
		throw new UnsupportedOperationException();
	}

}