package blueocn;

public class AsianCityAdapter implements City {

    private final double CONSTANT = 9.0/5.0;
    private final AsianCity asianCity;


    public AsianCityAdapter(AsianCity asianCity) {
        this.asianCity = asianCity;
    }

    @Override
    public String getName() {
        return asianCity.getName();
    }

    @Override
    public double getTemperature() {
        return (asianCity.getTemperature()*CONSTANT) + 32.0;
    }

    @Override
    public String getTemperatureScale() {
        return "Fahrenheit";
    }

    @Override
    public boolean getHasWeatherWarning() {
        return asianCity.getHasWeatherWarning();
    }

    @Override
    public void setHasWeatherWarning(boolean hasWeatherWarning) {
        this.asianCity.setHasWeatherWarning(hasWeatherWarning);
    }
}
