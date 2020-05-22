import java.sql.Date;

public class CondicionClimatica {
	private Float temperatura;
	private Float humedad;
	private Float precipitaciones;
	private Date fecha;
	
	
	public Float getTemperatura() {
		return temperatura;
	}
	public void setTemperatura(Float temperatura) {
		this.temperatura = temperatura;
	}
	public Float getHumedad() {
		return humedad;
	}
	public void setHumedad(Float humedad) {
		this.humedad = humedad;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public Float getPrecipitaciones() {
		return precipitaciones;
	}
	public void setPrecipitaciones(Float precipitaciones) {
		this.precipitaciones = precipitaciones;
	}
}
