/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logicToTest;

public class Calculator {

    /**
     * Add X to Y
     *
     * @param x
     * @param y
     * @return
     */
    public int add(int x, int y) {
        return x + y;
    }

    /**
     * Substract X from Y
     *
     * @param x
     * @param y
     * @return
     */
    public int substract(int x, int y) {
        return x - y;
    }

    /**
     * If X / Y is not 0, divide them with eachother
     *
     * @param x
     * @param y
     * @return
     */
    public int divide(int x, int y) {
        int result = 0;
        if (x != 0 || y != 0) {
            result = x / y;
        }
        return result;
    }

    /**
     * Multiplicate X with Y
     *
     * @param x
     * @param y
     * @return
     */
    public int multiplicate(int x, int y) {
        return x * y;
    }

}
