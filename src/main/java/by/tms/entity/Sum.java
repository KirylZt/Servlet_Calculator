package by.tms.entity;

import lombok.Data;

import java.util.List;

@Data
public class Sum implements Operation{
    List<Double> values;

    public Sum(List<Double> values) {
        this.values = values;
    }

    public Sum() {
    }

    @Override
    public String toString() {
        return "Sum{" +
                ", values=" + values +
                '}';
    }

    @Override
    public double calculate(List<Double> values) {
        double result = 0;
        for (double x: values) {
            result +=x;
        }
        return result;
    }
}
