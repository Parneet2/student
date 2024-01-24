/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author 62par
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
              //user interaction i/o and o/p - view class
       // define 3 students -obj of stuent class
      Student s1 = new Student(); 
      s1.setName("peter");
      s1.setId(112);
      Student s2 = new Student();
      s2.setName("abc");
      s2.setId(154);
      Student s3 = new Student();
      s3.setName("dsf");
      s3.setId(512);
      // int [] a = new int [3];
      //array for 3 elements
      Student []list = new Student [3]; //datatype is class name (Student class
      //objects will be displaye din array
      
      list[0] =s1;
      list[1]=s2;
      list[2]= s3;
      
      //print data - heterogenus data
      //System.out.println(list[0]); //this will print address of the 
      for(int i = 0; i<list.length; i++)
      {
          System.out.println(list[i].getName()+ " "+list[i].getId());
      }
    }
    }
    

