/*
 * File: StoneMasonKarel.java
 * --------------------------
 * The StoneMasonKarel subclass as it appears here does nothing.
 * When you finish writing it, it should solve the "repair the quad"
 * problem from Assignment 1.  In addition to editing the program,
 * you should be sure to edit this comment so that it no longer
 * indicates that the program does nothing.
 */

import stanford.karel.*;

public class StoneMasonKarel extends SuperKarel {

	// You fill in this part
	public void run() {
		repairQuad();
	}
	
	/* Makes Karel repair a column, move to the next
	 * and repeat until the final column is repaired.
	 * 
	 * Precondition: Karel must be at the bottom of 
	 * the first column, facing east.
	 * Postcondition: Karel has repaired all columns
	 * in the world.
	 */
	private void repairQuad() {
		while ( frontIsClear() ) {
			repairColumn();
			moveToNextColumn();
		}
		repairColumn();
	}
	
	/* Makes Karel repair a column, first making Karel 
	 * face down or up depending on whether they are at
	 * the top or bottom of a column.
	 * 
	 * Precondition: Karel must be at the top or bottom
	 * of a column.
	 * Postcondition: Karel has repaired the column and
	 * faces east, at either end of the column.
	 */
	private void repairColumn() {
		if ( rightIsBlocked() ) {
			turnLeft();
			fillColumn();
			turnRight();
		}
		else {
			turnRight();
			fillColumn();
			turnLeft();
		}
	}
	
	/* Makes Karel move to the next column.
	 * Precondition: Karel must be on a column, facing 
	 * east.
	 * Postcondtion: Karel has moved to the next column,
	 * and faces east.
	 */
	private void moveToNextColumn() {
		for (int i = 0; i < 4; i++) {
			move();
		}
	}
	
	/* Makes Karel fill a column (or row) with stones until
	 * the end of the column is reached.
	 * Precondition: Karel must be at the start of a column (or row).
	 * Postcondition: Karel has travelled to the opposite end of the
	 * column, placing stones in all gaps along the way.
	 */
	private void fillColumn() {
		while ( frontIsClear() ) {
			fillGap();
			move();
		}
		fillGap();
	}
	
	/* Makes Karel place a stone if none is present.
	 * Precondition: none.
	 * Postcondition: a stone is in place at Karel's location.
	 */
	private void fillGap() {
		if ( noBeepersPresent() ) {
			putBeeper();
		}
	}
	
}


