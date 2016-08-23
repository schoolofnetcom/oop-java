public class Car extends Vechicle {

    private Integer shifts;

    public Car() {
        super();
    }

    public Car(String color, Double topSpeed) {
        super(color, topSpeed);
    }

    public Integer getShifts() {
        return this.shifts;
    }

    public void setShifts(Integer shifts) {
        this.shifts = shifts;
    }

    public void methodOverriding() {
        System.out.println("This is a method from Child class overriding");
    }
}
