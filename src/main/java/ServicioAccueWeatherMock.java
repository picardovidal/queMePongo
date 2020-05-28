import java.util.Date;

public class ServicioAccueWeatherMock implements ServicioDeClima {

	@Override
	public CondicionClimatica ObtnerClima(String ciudad, Date fecha) {
		// TODO Auto-generated method stub
		CondicionClimatica clima = new CondicionClimatica();
		
		return clima;
	}

}
