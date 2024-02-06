package lesson18.preparing.tasks.temperature;

public class Temperature {
    private double value;
    private TemperatureType type;
    public Temperature(double value, TemperatureType type) {
        this.type = type;
        this.value = value;
    }

    public Temperature() {
    }

    public TemperatureType getType() {
        return type;
    }

    public void setType(TemperatureType type) {
        this.type = type;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Temperature{" +
                "value=" + value +
                ", type=" + type +
                '}';
    }
}
