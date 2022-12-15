public class Main {
        public static void main(String[] args) {
                Forecast forecast = new Forecast.Fake();
                Weather weather = new Weather(forecast, 20);
                Weather t_temp = weather.todaysTemperature();
                assert "20".equals(t_temp.toString());
        }
}