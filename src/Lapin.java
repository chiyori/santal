
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sarah santal
 */
public class Lapin {
    private String name;
    private int age;
    
    public Lapin (String n, int a){
        name=n;
        age=a;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    
    public void crier(){
        System.out.println("HAAAAA");
    }
}
