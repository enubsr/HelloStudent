/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hellostudent;

/**
 *
 * @author Enubs
 */
public class HelloStudent {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //object instantiation
        //instance - create
        //instantitation - object creation
        //allocate space RAM
        //1. declaration
        //2. instantiation
        //Student() - default constructor
        //constructor - special method that is called
        //during instantiation
        //Student student1;
        //student1 = new Student();
        //HelloStudent("Enubs");//method call/invoking a method
        Student student1 = new Student("Enubs", "Ron", "Ibo",
                38, "Samal");
        System.out.println(student1.getFirstname() + " "
            + student1.getMiddlename() + " "
            + student1.getLastname() +", " 
            + student1.getAge() + "\nAddress: "
            + student1.getAddress());
    }
    
    //method overloading
    //-more than one method with the same name
//    public static void HelloStudent(){
//        System.out.println("Hello student!");
//    }
//    
//    public static void HelloStudent(String name){
//        System.out.println("Hello, " + name + ".");
//    }
    
}
