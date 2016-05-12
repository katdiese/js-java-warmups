public class Vehicle {
  //properties
  // public Vehicle(String color, int wheels) {
  //   this.color = color;
  //   this.wheels = wheels;
  // }
  private String color;
  private int wheels;
  //getters
  public String getColor() {
    return this.color;
  }
  public int getWheels() {
    return this.wheels;
  }
  //setters
  public void setColor(String color) {
    this.color = color;
  }
  public void setWheels(int wheels) {
    this.wheels = wheels;
  }
  //methods
  public String honk() {
    return "Honk!";
  }
  public String output() {
    return "This vehicle has " + this.wheels + " wheels and is " + this.color + ".";
  }
  public static void main(String [] args) {
    Vehicle herbie = new Vehicle();

    System.out.println(herbie.honk());
  }
}