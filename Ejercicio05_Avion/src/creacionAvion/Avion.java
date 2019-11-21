package creacionAvion;

import java.util.ArrayList;

public class Avion {
    private String tipoAvion;
    private ArrayList<Pasajero> listaPasajeros;
    private ArrayList<Asiento> listaAsientos;
    
	public String getTipoAvion() {
		return tipoAvion;
	}
	public void setTipoAvion(String tipoAvion) {
		this.tipoAvion = tipoAvion;
	}
	public ArrayList<Pasajero> getListaPasajeros() {
		return listaPasajeros;
	}
	public void setListaPasajeros(ArrayList<Pasajero> listaPasajeros) {
		this.listaPasajeros = listaPasajeros;
	}
	public ArrayList<Asiento> getListaAsientos() {
		return listaAsientos;
	}
	public void setListaAsientos(ArrayList<Asiento> listaAsientos) {
		this.listaAsientos = listaAsientos;
	}
	
	public int contarPasajeros() {
		return listaPasajeros.size();
	}
	
	public int contarMaletas() {
		int acumuladorMaletas = 0;
		for(Pasajero p : getListaPasajeros()) {
			acumuladorMaletas = acumuladorMaletas + p.getListaMaletas().size();
		}
		return acumuladorMaletas;
	} 
	
	public int contarMaletasDeTipo(String tipo) {
		int contadorMaletas = 0;
		for(Pasajero p : getListaPasajeros()) {
			for(Maleta m : p.getListaMaletas()) {
				if(m.getTipoMaleta().equalsIgnoreCase(tipo)) {
					contadorMaletas++;
				}
			}

		}
		return contadorMaletas;
	} 
	
	@Override
	public String toString() {
		return "Avion [tipoAvion=" + tipoAvion + ", listaPasajeros=" + listaPasajeros + ", listaAsientos="
				+ listaAsientos + "]";
	}
	
	
	
    
}
