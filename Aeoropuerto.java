package Aerolinea;

import java.util.ArrayList;
import Aerolinea.Aviones;

public class Aeoropuerto {
	private ArrayList<Aviones> aviones = new ArrayList<Aviones>();

	public List<Pasajero> BuscarPasajeroConPasaporte() {
		throw new PasajeroConPasaporte();
	}

	public List<vuelos> BucarPasajeroyFechaDeVuelo() {
		throw new PasajeroyFechaDeVuelo();
	}

	public List<vuelos> BuscarPasajerosConMismoVuelo() {
		throw new PasajerosConMismoVuelo();
	}

	public List<Pasajero> BuscarVueloConTestPCRnegativo() {
		throw new VueloConTestPCRnegativo();
	}
}