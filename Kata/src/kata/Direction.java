/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata;

/**
 *
 * @author Gabriel Innocent
 */

public enum Direction {

    NORTH(0, 'N'),
    EAST(1, 'E'),
    SOUTH(2, 'S'),
    WEST(3, 'W');

    private int value;
    private char shortName;
    private Direction(int newValue, char shortNameValue) {
        value = newValue;
        shortName = shortNameValue;
    }

    public Direction getBackwardDirection() {
        return values()[(this.getValue() + 2) % 4];
    }

    public int getValue() {
        return value;
    }

    public char getShortName() { return shortName; }

}