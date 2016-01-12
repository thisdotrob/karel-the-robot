Karel the Robot exercises (CS106A Assignment 1)
===
Background
---
This repo forms part of my solutions to the assignments and challenges given to students on Stanford's CS106A Programming Methodology class. I am not a Stanford student but was able to follow the course online using the publicly available resources (see below). For anyone looking to start programming I would thoroughly recommend it as a first step.

Resources
---
- Course handouts including this assignment: http://web.stanford.edu/class/archive/cs/cs106a/cs106a.1152/handouts/index.html
- Assignment starter files: http://web.stanford.edu/class/archive/cs/cs106a/cs106a.1152/assignments/index.html
- Lecture recordings: https://www.youtube.com/view_play_list?p=84A56BC7F4A1F852

Setup
---
To run the program you will need to be on either Mac (OSX 10.6+) or Windows (7+).
#### Windows: ####
0. Install the latest JRE: http://web.stanford.edu/class/cs106a/software/jdk-8u45-windows-i586.exe
0. Install Stanford's customised Eclipse IDE: http://web.stanford.edu/class/cs106a/software/eclipse-windows.zip

#### Mac: ####
0. Download and install the Java SDK manager: http://web.stanford.edu/class/cs106a/software/jdk-8u45-macosx-x64.dmg
0. Download and install Stanford's customised Eclipse IDE: http://web.stanford.edu/class/cs106a/software/eclipse-mac.zip

Running the exercises
---
0. Clone this repo and import it into Eclipse's workspace
0. Hit the run button (running man) and choose which exercise to run

Assignment:
---
The following problems have been taken from this CS106A handout: http://web.stanford.edu/class/cs106a/handouts/08-Assignment1.pdf

Karel by default understands the following basic commands:
- move(): Move forward one square
- turnLeft(): Turn 90 degrees to the left
- turnRight(): Turn 90 degrees to the right
- pickBeeper(): Pick up a beeper from the current square
- putBeeper(): Put down a beeper on the current square

and can test the following basic conditions:
- frontIsClear() / frontIsBlocked()
- leftIsClear() / leftIsBlocked()
- rightIsClear() / rightIsBlocked()
- beepersPresent() / noBeepersPresent()
- beepersInBag() / noBeepersInBag()
- facingNorth() / notFacingNorth()
- facingEast() / notFacingEast()
- facingSouth() / notFacingSouth()
- facingWest() / notFacingWest()

#### Problem 1 ####
Your first task is to solve a simple story-problem in Karel’s world. Suppose that Karel
has settled into its house, which is the square area in the center of the following diagram:

![Karel problem 1](http://i.imgur.com/OK7Gcdc.png)

Karel starts off in the northwest corner of its house as shown in the diagram. The problem
is to program Karel to collect the newspaper—represented (as all objects in Karel’s world
are) by a beeper—from outside the doorway and then to return to its initial position.
This exercise is extremely simple and exists just to get you started. You can assume that
every part of the world looks just as it does in the diagram. The house is exactly this size,
the door is always in the position shown, and the beeper is just outside the door. Thus, all
you have to do is write the sequence of commands necessary to have Karel
1. Move to the newspaper.
2. Pick it up.
3. Return to its original starting point.
Even though the program requires just a few lines, it is still worth getting at least a little
practice in decomposition. In your solution, include a private method for each of the
steps shown in the outline.

#### Problem 2 ####
Karel has been hired to repair the damage done to the Quad in the 1989 earthquake. In
particular, Karel is to repair a set of arches where some of the stones (represented by
beepers, of course) are missing from the columns supporting the arches, as follows:

![Karel problem 2a](http://i.imgur.com/OytcwUE.png)

Your program should work on the world shown above, but it should be general enough to
handle any world that meets certain basic conditions as outlined at the end of this
problem. There are several example worlds in the starter folder, and your program should
work correctly with all of them.
When Karel is done, the missing stones in the columns should be replaced by beepers, so
that the final picture resulting from the world shown above would look like this:

![Karel problem 2b](http://i.imgur.com/V1oV3EJ.png)

Karel may count on the following facts about the world:
- Karel starts at 1st Avenue and 1st Street, facing east, with an infinite number of
beepers.
- The columns are exactly four units apart, on 1st, 5th, 9th Avenue, and so forth.
- The end of the columns is marked by a wall immediately after the final column. This
wall section appears after 13th Avenue in the example, but your program should work
for any number of columns.
- The top of the column is marked by a wall, but Karel cannot assume that columns are
always five units high, or even that all columns are the same height.
- Some of the corners in the column may already contain beepers representing stones
that are still in place. Your program should not put a second beeper on these corners.

#### Problem 3 ####

In this exercise, your job is to get Karel to create a checkerboard pattern of beepers inside
an empty rectangular world, as illustrated in the following before-and-after diagram:

![Karel problem 3a](http://i.imgur.com/7BYZFpL.png)

This problem has a nice decomposition structure along with some interesting algorithmic
issues. As you think about how you will solve the problem, you should make sure that
your solution works with checkerboards that are different in size from the standard 8x8
checkerboard shown in the example. Odd-sized checkerboards are tricky, and you should
make sure that your program generates the following pattern in a 5x3 world:

![Karel problem 3b](http://i.imgur.com/Af6zr37.png)

Another special case you need to consider is that of a world which is only one column
wide or one row high. The starter folder contains several sample worlds that test these
special cases, and you should make sure that your program works for each of them.

#### Problem 4 ####
As an exercise in solving algorithmic problems, program Karel to place a single beeper at
the center of 1st Street. For example, if Karel starts in the world

![Karel problem 4a](http://i.imgur.com/hcd1eaz.png)

it should end with Karel standing on a beeper in the following position:

![Karel problem 4b](http://i.imgur.com/AxqEqjr.png)

Note that the final configuration of the world should have only a single beeper at the
midpoint of 1st Street. Along the way, Karel is allowed to place additional beepers
wherever it wants to, but must pick them all up again before it finishes.
In solving this problem, you may count on the following facts about the world:
- Karel starts at 1st Avenue and 1st Street, facing east, with an infinite number of
beepers in its bag.
- The initial state of the world includes no interior walls or beepers.
- The world need not be square, but you may assume that it is at least as tall as it is
wide.

Your program, moreover, can assume the following simplifications:

- If the width of the world is odd, Karel must put the beeper in the center square. If the
width is even, Karel may drop the beeper on either of the two center squares.
- It does not matter which direction Karel is facing at the end of the run.
There are many different algorithms you can use to solve this problem. The interesting
part of this assignment is to come up with a strategy that works.
