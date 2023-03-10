/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnel;

/**
 *
 * @author mrunalipawar
 */
public class Profile {
    
    private static int count = 0;
    String personId;
    String name;
    String age;
    
    public Profile(){
        this.count++;
        this.personId = "Employee"+this.count;
    }
    
    public Profile (String personId, String name, String age) {
        this.personId = personId;
        this.name = name;
        this.age = age;   
    }

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Profile.count = count;
    }

    @Override
    public String toString(){
        return this.personId;
    }
}
