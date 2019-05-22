/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.pkg1;

/**
 *
 * @author Tanmay
 */
public class Guess {
    int a,b,c;
    boolean choice;
    

    public Guess(int a, int b, int c, boolean choice ) {
        this.a=a;
        this.b=b;
        this.c=c;
        this.choice=choice;
    }
    
    public String toString()
    {
        return (a + ","+ b+"," + c+ "," + choice);
    }
    
    
        
}
