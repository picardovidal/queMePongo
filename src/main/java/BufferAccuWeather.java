import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class BufferAccuWeather {
   private AccuWeatherAPI service;
   private List<Map<String, Object>> buffer;
   
	
   private static final BufferAccuWeather INSTANCE = new BufferAccuWeather();
	 
   public static BufferAccuWeather instance() {
	   return INSTANCE;
   }

		  
   // hacemos el constructor privado, para que nadie más lo puede llamar
   private BufferAccuWeather() {
	   service = new AccuWeatherAPI();
	   buffer = new ArrayList<Map<String, Object>>();
   }


   public List<Map<String, Object>> getWeather(String ciudad) {
	  //busco en el buffer si  ya tengo un clima cargado para esta ciudad y hora, si esta lo devuelvo, 
	   //sino consulto a la api de accuWeather lo ingreso al buffer y luego devuelvo.
	   List<Map<String, Object>> clima = null;
	   if (buffer.stream().filter(x -> x.get(ciudad) != null).count()>1) {
	   }
	   else {
		  clima = service.getWeather(ciudad);
		  buffer.addAll(clima);
	   }
	   return clima;
   }

   
   
}
