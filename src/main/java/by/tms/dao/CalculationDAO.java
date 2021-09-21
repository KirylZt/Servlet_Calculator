package by.tms.dao;

import by.tms.entity.*;

import java.util.ArrayList;
import java.util.List;

public class CalculationDAO {
    static List<OperationEntry> operations = new ArrayList<>();

    public static Operation calc(List<Double> values, int operation){
        switch (operation){
            case 1:return new Sum(values);
            case 2:return new Difference(values);
            case 3:return new Multiply(values);
            case 4:return new Divide(values);
            default: return null;
        }
    }

    public static List<OperationEntry> getOperations() {
        return operations;
    }

    public static List<OperationEntry> getOperationByUser(User user){
        List<OperationEntry> resultEntries = new ArrayList<>();
        for (OperationEntry operationEntry:CalculationDAO.getOperations()) {
            if (operationEntry.getUser().equals(user)){
                resultEntries.add(operationEntry);
            }
        }
        return resultEntries;
    }
}
