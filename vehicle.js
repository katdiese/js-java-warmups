var Vehicle = function(color, wheels) {
  this.color = color;
  this.wheels = wheels;
}

Vehicle.prototype.output = function() {
  return "This vehicle has " + this.wheels + " wheels and is " + this.color + ".";
}

var cliff = new Vehicle("red", 4);

// console.log(cliff.output());

var Car = function(color) {
  this.wheels = 4;
  this.color = color;
}

Car.prototype = new Vehicle();

Car.prototype.drive = function(miles) {
  return 'This car just drove ' + miles
 + ' miles.';
}

var herbie = new Car('white');
console.log(herbie.output());
console.log(herbie.drive(200));