# Project #1:             Hero chases gold!
**Dynamic sketch, including:**
+ Scene with sky, grass, sun, tree, and house,  
+ Gold nugget that appears when mouse is clicked
+ Hero who chases the gold
+ Score _(increases by 100 when hero gets near enough to gold)


## SCENE:
+ sky
+ sun -- moves across the sky, at a random height
+ grass (below the "horizon")
+ tree with brown trunk (rectangle above horizon) and green leaves (ellipse at top of tree trunk) 
+ house -- with roof, door, and windows
Add title, author, and messages

## GOLD
+ A sparkling gold nugget appears at mouse position (mouseX,mouseY) when mouse is clicked

## HERO     <img src=hero.png align=right>
+ shirt with name on it
+ pants and legs
+ arms
+ head and eyes

## ACTION:  
Hero moves toward the gold.
+ If hero is at (heroX,heroY) and gold is at (goldX,goldY),  
then the following code will make the hero move toward the gold  
at a rate that cuts the distance in half every 15 frames:
````
            heroX=  heroX  +  (goldX-heroX) / 15;
            heroY=  heroY  +  (goldY-heroY) / 15;
````
When hero is close enough to the gold _(say, ten pixels)_,  
+ Add 100 to the score
+ Move gold to a new, random position
Reduce the score by 1 point, every second (30 frames).

----

# INSTRUCTIONS:
1. Fork this "repo"  
2. Create a new file named `p1-lastname`  
    where **lastname** is  *YOUR* last name 
    *(first three or more letters)*
3. Do **not** use variable names that contain the word *`hero`*  
Instead, make up a name for your "hero" and use it in the variable name, e.g.  
````
        float mickeyX, mickeyY;         // Position of Mickey (mickeyX,mickeyY).
        float goldX, goldY;             // Position of the gold nugget.
````


