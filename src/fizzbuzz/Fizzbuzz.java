/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fizzbuzz;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

/**
 *
 * @author aluno
 */
public class Fizzbuzz {

    /**
     * @param i the number to be checked
     */
    public String Answer(int i) {
        if (i == 15) return "fizzbuzz";
        if (i % 3 == 0) return "fizz";
        if (i % 5 == 0) return "buzz";
        return "" + i;
    }
    
}
