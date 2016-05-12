class Car extends Vehicle  {
  //methods
  public String drive(int distance) {
    return "This car has driven " + distance + " miles.";
  }
  //main
  public static void main(String [] args) {
    Car hunter = new Car();
    System.out.println(hunter.drive(20));
  }
}