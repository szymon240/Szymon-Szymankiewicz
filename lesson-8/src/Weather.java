public class Weather {
    public final Forecast forecast;
    public final float temperature;
    public Weather(Forecast fo, float temp) {
        this.forecast = fo;
        this.temperature = temp;
    }

    public Weather todaysTemperature() {
        return new Weather(this.forecast,this.temperature);
    }
    @Override
    public String toString() {
        return Float.toString(temperature);
    }
}
