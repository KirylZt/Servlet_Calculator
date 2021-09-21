package by.tms.controllers;

import by.tms.dao.CalculationDAO;
import by.tms.dao.UserDAO;
import by.tms.entity.Operation;
import by.tms.entity.OperationEntry;

import java.util.List;

public class CalculationControllers {
    public static double calculate(List<Double> values, int operation){
        Operation operation1 = CalculationDAO.calc(values,operation);
        assert operation1 != null;
        double result = operation1.calculate(values);
        CalculationDAO.getOperations().add(new OperationEntry(UserDAO.getCurrentUser(),operation1,result));
        return result;
    }
}
