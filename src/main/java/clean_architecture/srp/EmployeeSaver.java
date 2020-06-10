package clean_architecture.srp;

public class EmployeeSaver {
    private EmployeeData employeeData;

    public EmployeeSaver(EmployeeData employeeData) {
        this.employeeData = employeeData;
    }

    public void saveEmployee() {
        //Save logic..
    }
}
