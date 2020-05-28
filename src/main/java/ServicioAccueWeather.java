import java.util.Date;
import java.util.List;
import java.util.Map;

public class ServicioAccueWeather implements ServicioDeClima {
	
	
	@Override
	public CondicionClimatica ObtnerClima(String ciudad, Date fecha ) {
		// TODO Auto-generated method stub
		
		List<Map<String, Object>> datosDelClima = BufferAccuWeather.instance().getWeather(ciudad, fecha);
		CondicionClimatica clima = new CondicionClimatica();
		//completo el clima con los datos obtenidos de accueWheather
		//clima.setFecha();
		
		return clima;
	}

}
