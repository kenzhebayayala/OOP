package lab3;

public class Task3_2 {


    private double value;
    private char scale; 

    public Task3_2() {
        this(0, 'C');
    }

    public Task3_2(double value) {
        this(value, 'C');
    }

    public Task3_2(char scale) {
        this(0, scale);
    }

    public Task3_2(double value, char scale) {
        this.value = value;
        this.scale = scale;
    }

    public double getCelsius() {
        if (scale == 'C')
            return value;
        return 5 * (value - 32) / 9;
    }

    public double getFahrenheit() {
        if (scale == 'F')
            return value;
        return (9 * value / 5) + 32;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public void setScale(char scale) {
        this.scale = scale;
    }

    public void setBoth(double value, char scale) {
        this.value = value;
        this.scale = scale;
    }

    public char getScale() {
        return scale;
    }
}
