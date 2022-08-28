package Aerolinea;

import java.util.ArrayList;
import Aerolinea.vuelos;

public class Piloto extends Persona {
	private String rutPiloto;
	private String idPiloto;
	private ArrayList<vuelos> vuelos = new ArrayList<vuelos>();

	public String getRutPiloto() {
		return this.rutPiloto;
	}

	public void setRutPiloto(Object rutpiloto) {
		throw new UnsupportedOperationException();
	}

	public String getIdPiloto() {
		return this.idPiloto;
	}

	public void setIdPiloto(Object idPiloto) {
		throw new UnsupportedOperationException();
	}
}