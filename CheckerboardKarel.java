/*
 * File: CheckerboardKarel.java
 * ----------------------------
 * When you finish writing it, the CheckerboardKarel class should draw
 * a checkerboard using beepers, as described in Assignment 1.  You
 * should make sure that your program works for all of the sample
 * worlds supplied in the starter folder.
 */

import stanford.karel.*;

public class CheckerboardKarel extends SuperKarel {

	/* Makes Karel place beepers in the checkerboard pattern,
	 * row by row if the world has multiple columns, or
	 * by column if the world is a single column.
	 */
	public void run() {
		if ( frontIsClear() ) {
			while ( frontIsClear() ) {
				createPattern();
			}
		}
		else {
			turnLeft();
			while( frontIsClear() ) {
				createPattern();
			}
		}
	}
	
	private void createPattern() {
		putBeeper();
		positionForNextPattern();	
	}
	
	private void positionForNextPattern() {
		if ( frontIsClear() ) {
			move();
			if ( frontIsClear() ) {
				move();
			}
			else {
				startNewRowIfAble();
			}
		}
		else {
			startNewRowIfAble();
		}
	}
	
	private void startNewRowIfAble() {
		if ( facingEast() ) {
			if ( leftIsClear() ) {
				startNewRowFromEast();
			}
		}
		else {
			if ( rightIsClear() ) {
				startNewRowFromWest();
			}
		}
	}
	
	private void startNewRowFromEast() {
		turnLeft();
		move();
		turnLeft();
	}
	
	private void startNewRowFromWest() {
		turnRight();
		move();
		turnRight();
	}
	

}
