/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package author;

/**
 *
 * @author MUHAMMAD
 */
public class Author {
    private String name, email;
    char gender;
    
    public Author(String authName, String authEmail, char sex) {
        name = authName;
        email = authEmail;
        gender = sex;
    }
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String newMail) {
        email = newMail;
    }
    public char getGender() {
        return gender;
    }
    
    public String toString() {
        return name + "\t" + "(" + gender + ")" + "\t at " + email; 
    }
}
