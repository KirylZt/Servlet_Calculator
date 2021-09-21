package by.tms.entity;

import lombok.Data;

import java.util.List;

@Data
public class Difference implements Operation{
    List<Double> values;

    public Difference(List<Double> values) {
        this.values = values;
    }

    public Difference() {
    }

    @Override
    public double calculate(List<Double> values) {
        return values.get(0)-values.get(1);
    }

    @Override
    public String toString() {
        return "Difference{" +
                ", values=" + values +
                '}';
    }


}
