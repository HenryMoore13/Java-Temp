public class Converter {
    Double magnitude;
    // String unit;magnitude, unit

    public Converter(Double magnitude, String unit) {
        this.magnitude = normalizeToKelvin(magnitude, unit);
        // his.unit = unit;
    }

    private Double normalizeToKelvin(Double magnitude, String unit) {
        switch(unit){
            case "F":
                return (magnitude - 32) * 5/9 + 273.15;
            case "C":
                return magnitude + 273.15;
            case "K":
                return magnitude;
            case "R":
                return magnitude * 5/9;
            default:
                return null;
        }
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
