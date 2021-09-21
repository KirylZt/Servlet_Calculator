package by.tms.entity;

import lombok.Data;

import java.util.List;

@Data
public class Divide implements Operation{
    List<Double> values;

    public Divide(List<Double> values) {
        this.values = values;
    }

    public Divide() {
    }

    @Override
    public double calculate(List<Double> values) {
        return values.get(0)/values.get(1);
    }

    @Override
    public String toString() {
        return "Divide{" +
                ", values=" + values +
                '}';
    }
}
