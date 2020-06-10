package clean_architecture.srp;

public class HourReporter {
    private EmployeeData employeeData;

    public HourReporter(EmployeeData employeeData) {
        this.employeeData = employeeData;
    }

    public int reportHours() {
        return employeeData.getRegularHours() + 1;
    }
}
