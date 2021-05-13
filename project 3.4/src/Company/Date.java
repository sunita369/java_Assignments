package Company;
import java.util.*;

public class Date {
	private Integer day;
    private Integer month;
    private Integer year;
    public Date(Integer day, Integer month, Integer year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    public Integer getDay() {
        return day;
    }

    public void setDay(Integer day) {
        this.day = day;
           }

    public Integer getMonth() {
        return month;
    }

    public void setMonth(Integer month) {
        this.month = month;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Date)) return false;
        Date date = (Date) o;
        return Objects.equals(getDay(),    date.getDay()) && Objects.equals(getMonth(), date.getMonth()) && Objects.equals(getYear(), date.getYear());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDay(), getMonth(), getYear());
    }

    @Override
    public String toString() {
        return "Date{" +
                "day=" + day +
                ", month=" + month +
                ", year=" + year +
                '}';
    }
}
class datacomparator implements Comparator<Date> {
    @Override
    public int compare(Date d1, Date d2) {
        if (d1.getDay().compareTo(d2.getDay()) == 0)
            return 0;
        return 0;
    }

}
