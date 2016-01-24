# Project #1:             Hero chases gold!
## Dynamic sketch, including:
+ Scene with sky, grass, sun, tree, and house,  
+ Gold nugget that appears when mouse is clicked
+ Hero who chases the gold
+ Score _(increases by 100 when hero reaches the gold)_

## SCENE:     <img src=hero.png align=right>
+ sky covers top portion of screen
+ grass below the *`horizon`*
+ sun moves across the sky, at a random height
+ tree with brown trunk (rectangle above horizon) and green leaves (ellipse at top of tree trunk) 
+ house -- with roof, door, and windows
Add title, author, and messages

## GOLD     <img src=hero.png align=right>
+ A sparkling gold nugget appears at mouse position (mouseX,mouseY) when mouse is clicked

## HERO     <img src=hero.png align=right>
+ Draw a creature using rectangles, ellipses, triangles, etc.
+ Display the hero's **name** on the body

## ACTION:  
**Hero moves toward the gold.**
+ If hero is at `(heroX,heroY)` and gold `(goldX,goldY)`, then the following code  
will make the hero move toward the gold  at a rate that cuts distance in half every 15 frames:
```
            heroX=  heroX  +  (goldX-heroX) / 15;
            heroY=  heroY  +  (goldY-heroY) / 15;
```
**When hero is close enough to the gold (say, ten pixels)**     <img src=hero.png align=right>
+ Move gold to a new, random position
+ Add 100 to the score
Reduce the score by 1 point, every second (30 frames).

----

# INSTRUCTIONS:
1. Fork this "repo" into your **Github** account
2. Create a new file named **`p1-lastname.java`**  
    where **`lastname`** is  *YOUR* last name 
    *(first three or more letters)*
3. Develop your code in the **Processing** P.D.E.
4. Do **not** use variable names that contain the word **`hero`**  
Instead, make up a name for your "hero" and use it in the variable name, e.g.  
```
        float mickeyX, mickeyY;         // Position of Mickey (mickeyX,mickeyY).
        float goldX, goldY;             // Position of the gold nugget.
```
&nbsp;5. Copy and paste your working code into your Github file named **`p1-lastname.java`**  
_(Make sure that code in Github will compile without syntax errors;  
Please do not paste non-compiling code into your Github files.)_

###### **NOTE:** All code in Github is "open source" and available to everyone.  

###Code Review
Be prepared to discuss your code during **Code Review** sessions in class.  
Also feel free to ask for help during **Code Review** sessions
