package clean_architecture.srp;

public class PayCalculator {
    private EmployeeData employeeData;

    public PayCalculator(EmployeeData employeeData) {
        this.employeeData = employeeData;
    }

    public int calculatePay() {
        return employeeData.getRegularHours() * 10_000;
    }
}
