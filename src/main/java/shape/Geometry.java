/*
 * OOP : Object-Oriented Programming
 * Abstract
 */
package shape;

/**
 *
 * @author Anurak Yutthanawa
 * 63160015 B.Sc. Computer Science
 * Burapha University
 *
 */
abstract public class Geometry{
     
    protected double area;  
    
    abstract public void setValue(); 		                     //Create setValue Method for make subclass Override
    abstract public void getValue();                                 //Create getValue for make subclass Override
    abstract protected void calArea();
    @Override
    abstract public String toString();              	             //Create toString to make subclass Override next
        
}





