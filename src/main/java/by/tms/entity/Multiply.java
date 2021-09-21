package by.tms.entity;

import lombok.Data;

import java.util.List;

@Data
public class Multiply implements Operation{
    List<Double> values;

    public Multiply(List<Double> values) {
        this.values = values;
    }

    public Multiply() {
    }

    @Override
    public double calculate(List<Double> values) {
        double result = 1;
        for (Double x:values) {
            result *= x;
        }
        return result;
    }

    @Override
    public String toString() {
        return "Multiply{" +
                ", values=" + values +
                '}';
    }
}
