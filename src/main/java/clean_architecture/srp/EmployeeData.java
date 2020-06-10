package clean_architecture.srp;

public class EmployeeData {
    private Long idx;
    private String name;

    public EmployeeData(Long idx, String name) {
        this.idx = idx;
        this.name = name;
    }

    public int getRegularHours() {
        return 8;
    }
}
