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
public class TestAuthor {
    public static void main(String[] args) {
        String name = "Muhammad", email = "abdullmng@gmail.com";
        char sex = 'm';
        Author author = new Author(name, email, sex);
        
        System.out.println(author);
        String newMail = "abdullahimuhammad51@gmail.com";
         author.setEmail(newMail);
        System.out.println(author);
    }
}
