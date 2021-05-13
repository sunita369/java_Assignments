package employee1;

public class Dept {
	private Integer deptid;
    private String deptname;

    public Dept(Integer deptid, String deptname) {
        this.deptid = deptid;
        this.deptname = deptname;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "deptid=" + deptid +
                ", deptname='" + deptname + '\'' +
                '}';
    }
}
