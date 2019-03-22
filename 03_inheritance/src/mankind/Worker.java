package mankind;

public class Worker extends Human {
    private double weekSalary;
    private double workHoursPerDay;

    public Worker(String firstName, String lastName, double weekSalary, double workHoursPerDay) {
        super(firstName, lastName);
        this.setWeekSalary(weekSalary);
        this.setWorkHoursPerDay(workHoursPerDay);
    }

    private void setWeekSalary(double weekSalary) {
        if (weekSalary < 10) {
            throw new IllegalArgumentException("Expected value mismatch!Argument: weekSalary");
        }
        this.weekSalary = weekSalary;
    }

    private void setWorkHoursPerDay(double workHoursPerDay) {
        if (workHoursPerDay < 1 || workHoursPerDay > 12) {
            throw new IllegalArgumentException("Expected value mismatch!Argument: workHoursPerDay");
        }
        this.workHoursPerDay = workHoursPerDay;
    }

    @Override
    protected void setLastName(String lastName) {
        if (lastName.length() < 3) {
            throw new IllegalArgumentException("Expected length more than 3 symbols!Argument: lastName");
        }
        super.setLastName(lastName);
    }

    private double calculateSalaryPerHour() {
        double salary = this.weekSalary / 7;
        return salary / this.workHoursPerDay;
    }


    @Override
    public String toString() {
        return super.toString() +
                String.format(
                        "Week Salary: %.2f%n" +
                                "Hours per day: %.2f%n" +
                                "Salary per hour: %.2f%n"
                        , this.weekSalary, this.workHoursPerDay, calculateSalaryPerHour());
    }
}

