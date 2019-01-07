public class Converter {
    Double magnitude;
    // String unit;

    public Converter(Double magnitude, String unit) {
        this.magnitude = normalizeToKelvin(magnitude, unit);
        // his.unit = unit;
    }

    public Double toFahrenheit() {
        return (magnitude - 273.15) * 9 / 5 + 32;
    }

    public Double toCelsius() {
        return magnitude - 273.15;
    }

    public Double toKelvin() {
        return magnitude;
    }

    public Double toRankine() {
        return magnitude * 1.8;
    }
}
