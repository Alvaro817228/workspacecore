package bean;

public class Direccion {
	private String tipovia;
	private String nombreVia;
	private String ciudad;
	private String cp;
	public String getTipovia() {
		return tipovia;
	}
	public void setTipovia(String tipovia) {
		this.tipovia = tipovia;
	}
	public String getNombreVia() {
		return nombreVia;
	}
	public void setNombreVia(String nombreVia) {
		this.nombreVia = nombreVia;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public String getCp() {
		return cp;
	}
	public void setCp(String cp) {
		this.cp = cp;
	}
	@Override
	public String toString() {
		return "Direccion [tipovia=" + tipovia + ", nombreVia=" + nombreVia + ", ciudad=" + ciudad + ", cp=" + cp + "]";
	}
	
}
