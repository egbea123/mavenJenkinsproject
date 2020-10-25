package jenkins_maven_project;

import net.aksingh.owmjapis.core.OWM;
import net.aksingh.owmjapis.api.APIException;
import net.aksingh.owmjapis.model.CurrentWeather;
import net.aksingh.owmjapis.api.*;

public class JenkinsMaven {
	public static void main(String[] args) throws APIException {
		// TODO Auto-generated method stub
		String API_KEY = "c892980f43e9571220ba35b999d93f6a";
        // declaring object of "OWM" class
        OWM owm = new OWM(API_KEY);
        // getting current weather data for theS "Ottawa" city
        CurrentWeather cwd = owm.currentWeatherByCityName("Ottawa");

        //printing city name from the retrieved data
        System.out.println("City: " + cwd.getCityName());
        
        // printing the max./min. temperature
        System.out.println("Temperature: " + cwd.getMainData().getTempMax()
                            + "/" + cwd.getMainData().getTempMin() + "\'K");
	}
}
