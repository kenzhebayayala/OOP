//data

package lab3;

public class Task1 {

    private double sum;      
    private double max;      
    private int count;      

 
    public Task1() {
        sum = 0;
        count = 0;
        max = 0;
    }
  
    public void add(double value) {
        if (count == 0) {
            max = value;
        } else if (value > max) {
            max = value;
        }

        sum += value;
        count++;
    }

    public double getAverage() {
        if (count == 0) {
            return 0;
        }
        return sum / count;
    }

    public double getMaximum() {
        if (count == 0) {
            return 0;
        }
        return max;
    }
}
