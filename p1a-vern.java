Enter 
int x = 200;
int dx = 1;
int j = 100;
int dj = 1;
int y = 200;
int dy = 1;
void setup () {
size (800, 700);
 }
  void draw() {

// sun 
background(0, 100, 255);
fill(255,255, 18);
stroke(240, 41, 19);
ellipse(x, 100, 40, 40);
x=x + dx;
if(x + 20> width) 
dx = dx * - 1;
 if( x -20 < 0)
 dx =dx * - 1;
 
 // ground
fill (0, 255, 0);
stroke (0, 255, 0);
rect(0, 400, 800, 300);

 //placing two trees
//tree 1
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

// sun 
fill(255, 255, 18);
stroke(240, 41, 19);
ellipse(x, 100, 40, 40);
if(x>width) // x < 0)
dx = dx * -1;


// the house
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

// Dodo
// the head {
fill(232, 14, 14);
stroke(0);
ellipse(j - 45, 360, 30, 40);

// the body
fill(9, 149, 17);
stroke(0);
rect(j - 55, 380, 20, 40);
// eyes
// left eye
fill(0, 0, 0);
stroke(155);
ellipse(j - 51, 360, 5, 5);

// right eye
fill(0, 0, 0);
stroke(155);
ellipse(j - 38, 360, 5, 5);

// feet
// left foot
fill(2, 31, 4);
stroke(0);
rect(j - 55, 420, 5, 35);

// right foot
fill(2, 31, 4);
stroke(0);
rect(j - 40, 420, 5, 35);

// arms

// left arms
fill(2, 31, 4);
stroke(0);
rect(j - 60 , 390, 5, 25);

// right arms
fill(2, 31, 4);
stroke(0);
rect(j - 36, 390, 5, 25);
j=j + dj;
if(j > 200) 
dj = dj - 1;
 if( j < 0)
 dj =dj + 1;
 
 // fruits
 fill(255, 0, 0);
 stroke(0);
 ellipse(700, y -30, 10,10); 
 ellipse(710, y - 20, 10,10);
 ellipse(720, y -15, 10,10);
 ellipse(730, y+17, 10,10);
 ellipse(700, y, 10,10);
 ellipse(695, y+22, 10,10);
 ellipse(695, 190, 10,10);
 ellipse(705, 227, 10,10);
 y = y + dy;
  
  ellipse(605, y + 57, 10,10);
  ellipse(550, y + 47, 10,10);
  ellipse(560, 237, 10,10);
  ellipse(570, 257, 10,10);
  ellipse(605, y + 107, 10,10);
  ellipse(590, 310, 10,10);
  ellipse(605, y +77, 10,10);
    
// Gold
fill(229, 140, 23);
stroke(0);
rect(j + 50, 420, 50, 20);



}file contents here
