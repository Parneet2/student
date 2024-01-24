/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/** //Encapsulation Principle -- in order to develop great software.
 *entity - student -model class
 * @author 62par
 */ // in exam variable public  ans - encaplsulation principles voileted
public class Student {
    private String name; //principle encapsulation(private)
    private int id; // so that other classes cannot directly modified or access variable
     // other classes  will accesss private methods by getter and setter

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) { // they can call by this method and pass 
        // name varibale 
        this.name = name;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }
}
