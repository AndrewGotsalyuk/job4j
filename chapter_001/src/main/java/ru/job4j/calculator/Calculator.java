/**
 * Calculator
 *
 * @author Andrey Gotsalyuk
 * @version $Id$
 * @since 03/09/2019
 */
package ru.job4j.calculator;

/**
 * Класс вычисления арифметических операций + - * /
 *
 * @author Andrey Gotsalyuk
 * @version $Id$
 * @since 03/09/2019
 */
public class Calculator {

/**
 * Метод сложения
 * @param first первый аргумент
 * @param second второй аргумент
 * @return результат
 */

    public static void add(double first, double second) {
        double result =  first + second;
        System.out.println(first + "+" + second + " = " + result);
    }
/**
 * Метод деления
 * @param first первый аргумент
 * @param second второй аргумент
 * @return результат
 */
    public static void div(double first, double second) {
        double result =  first / second;
        System.out.println(first + "/" + second + " = " + result);
    }
/**
 * Метод умножения
 * @param first первый аргумент
 * @param second второй аргумент
 * @return результат
 */
    public static void multiply(double first, double second) {
        double result =  first * second;
        System.out.println(first + "*" + second + " = " + result);
    }
/**
 * Метод вычитания
 * @param first первый аргумент
 * @param second второй аргумент
 * @return результат
 */
    public static void subtrack(double first, double second) {
        double result =  first - second;
        System.out.println(first + "-" + second + " = " + result);
    }

/**
* Конструктор, вывод строки в консоль
* @param args = args
*/
    public static void main(String[] args) {
        add(1, 1);
        div(4, 2);
        multiply(2, 1);
        subtrack(10, 5);
    }
}