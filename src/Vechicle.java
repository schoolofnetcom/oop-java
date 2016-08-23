public class Vechicle {

    private String color;
    private Double topSpeed;

    public Vechicle() {

    }

    public Vechicle(String color, Double topSpeed) {
        this.color    = color;
        this.topSpeed = topSpeed;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Double getTopSpeed() {
        return this.topSpeed;
    }

    public void setTopSpeed(Double topSpeed) {
        this.topSpeed = topSpeed;
    }

    public void methodOverriding() {
        System.out.println("This is a method from Father class overriding");
    }
}
