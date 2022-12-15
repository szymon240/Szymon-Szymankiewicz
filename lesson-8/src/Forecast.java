public interface Forecast {
    float todaysTemperature(float temperature);
    final class Fake implements Forecast {
        @Override
        public float todaysTemperature(float temperature) {
            return 20;
        }
    }
}
