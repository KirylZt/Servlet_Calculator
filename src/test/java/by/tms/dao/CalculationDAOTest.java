package by.tms.dao;

import by.tms.controllers.CalculationControllers;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CalculationDAOTest {

    @Test
    void calc() {
        List<Double> vales = new ArrayList<>();
        vales.add(2.0);
        vales.add(2.0);
        double expected = 4;
        double actual = CalculationControllers.calculate(vales,1);;
        assertEquals(expected,actual);
    }

    @Test
    void getOperations() {
    }

    @Test
    void getOperationByUser() {
    }
}