void setup() {
	size(500, 500);
}
{
x = 20
y = 300
z = 0
t = 255
a = 145
o = 170
}


void draw() {
// Step 1: Write code that draws the following screenshots 
// with hard-coded values. (Feel free to use colors 
// instead of grayscale.)

// Step 2: Replace all of the hard-coded numbers with 
// variables.

// Step 3: Write assignment operations in draw() that 
// change the value of the variables.
// For example, “variable1 = variable1 + 2;”. 

// Step 4: Make it so when the program runs the ball slides off the screen exiting at the point (500, 500)

  background(t);
  stroke(z);
  
  //grey square
  fill(z, z, t);
  rect(x, x, y, y);
  //white circle
  fill(t, t, z);
  ellipse(o, o, a, a);
 // move thing
 o = o + 2
 x = x + 2
}