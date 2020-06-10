package clean_architecture.srp;

public class EmployeeFacade {

    private EmployeeData employeeData;

    public EmployeeFacade(EmployeeData employeeData) {
        this.employeeData = employeeData;
    }

    public int calculatePay() {
        return new PayCalculator(employeeData).calculatePay();
    }

    public int reportHours() {
        return new HourReporter(employeeData).reportHours();
    }

    public void saveEmployee() {
        new EmployeeSaver(employeeData).saveEmployee();
    }
}
