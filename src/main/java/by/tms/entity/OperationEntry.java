package by.tms.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OperationEntry {
    User user;
    Operation operation;
    Double result;

    @Override
    public String toString() {
        return "OperationEntry{" +
                "user=" + user.getName() +
                ", operation=" + operation +
                ", result=" + result +
                '}';
    }
}
