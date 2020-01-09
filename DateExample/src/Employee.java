import java.time.LocalDate;

public class Employee {
    private String empName;
    private String empPhone;
    private LocalDate empBirthDate;
    private static String company = "John Deere";

    public Employee() {
        this.empName = "Mickey Mouse";
        this.empPhone = "800-SEE- DISNEY";
        this.empBirthDate = LocalDate.of(1925, 12, 01);
    }

    public Employee(String nm, String ph, LocalDate bd) {
        setEmpName(nm);
        setEmpPhone(ph);
        setEmpBirthDate(bd);

    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String nm) {
        this.empName = nm;
    }

    public String getEmpPhone() {
        return empPhone;
    }

    public void setEmpPhone(String ph) {
        this.empPhone = ph;
    }

    public LocalDate getEmpBirthDate() {
        return empBirthDate;
    }

    public void setEmpBirthDate(LocalDate bd) {
        this.empBirthDate = bd;
    }

}
