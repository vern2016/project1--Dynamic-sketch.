

float xsun = 200;
float dxsun = 1;
float ysun =200;
float yfruit = 200;
float dyfruit =1;
float xgold = 500;
float ygold = 450;
float xdodo = 150; 
float ydodo = 450;

 

void setup () {
size (800, 550);
 }
  void draw() {
// Draw the Frame
/// Scene: sun, grass, trees,  house 
// sun 

 xgold = mouseX;
 ygold = mouseY;
{
background(0, 100, 255);
fill(255,255, 18);
stroke(240, 41, 19);
ellipse(xsun, ysun, 40, 40);
xsun=xsun + dxsun;
if(xsun + 20> width) 
dxsun = dxsun * - 1;
 if( xsun -20 < 0)
 dxsun =dxsun * - 1;
}

 // grass
 {
fill (0, 255, 0);
stroke (0, 255, 0);
rect(0, 400, 800, 300);
 }
 
 //placing three trees
//tree 1
{
fill(118, 29, 19);
stroke(110, 29, 18);
rect(700, 280, 30, 120);

// leaves
fill(81, 247, 70);
stroke(0);
ellipse(715, 225, 100, 120);

// tree2
fill(120, 30, 20);
stroke(110, 29, 10);
rect(550, 310, 30, 120);

// leaves
fill(81, 247, 70);
stroke(0);
ellipse(560, 270, 150, 120);
}

// the house
{
fill(237, 24, 106);
stroke(0);
rect(200, 260, 160, 140);

// line
line(200, 325, 360, 325);
line(200, 324, 360, 324);

// first part of the roof: rectangle
fill(98, 9, 43);
stroke(0);
rect(320, 200, 20, 60);

// second part of the roof: triangle
fill( 108, 8, 46);
stroke(0);
triangle(195, 260, 365, 260, 280,200);

//door
fill(255, 0, 0);
stroke(255);
rect(270, 340, 20, 60);

// windows left
fill(255, 255, 255);
stroke(0);
rect(210, 270, 30, 30);

// windows right
fill(255, 255, 255);
stroke(0);
rect(320, 270, 30, 30);

// window bottom right
fill(255, 255, 255);
stroke(0);
rect(320, 340, 30, 30);

// window bottom left
fill(255, 255, 255);
stroke(0);
rect(210, 340, 30, 30);

//knob
fill(0, 0, 0);
stroke(155);
ellipse(275, 370, 5, 5); 
}
// Gold
{ 
  fill(131, 99, 9);
  stroke(64, 49, 7);
ellipse(xgold, ygold, 50, 30); 
}
 // Dodo
 //Head
 {
 fill( 237, 7, 119);
stroke(0);
ellipse(xdodo, ydodo, 70, 50);

//body
fill( 7, 55, 233);
stroke(0);
rect(xdodo - 13, ydodo +25 , 30, 60);

// left eyes
fill( 0, 1, 3); 
stroke(0);
ellipse(xdodo - 25, ydodo, 10, 10);

// right eye
fill( 0, 1, 3); 
stroke(0);
ellipse(xdodo + 25, ydodo -10, 10, 10);

xdodo = xdodo + (xgold - xdodo)/10;
ydodo = ydodo + (ygold - ydodo)/10;
 }
  }
