import java.io.FileWriter;
import java.io.IOException;
import java.io.File;

public class Person {
    private String name;
    private String hobby;
    private String age;

    public Person() {
        name = "";
        hobby = "";
        age = "";
    }

    public Person(String name, String hobby, String age) {
        this.name = name;
        this.hobby = hobby;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getHobby() {
        return hobby;
    }

    public String getAge(){
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public void setAge(String age){
        this.age = age;
    }

    public String greet() {
        if (name.equals("") && hobby.equals("") && age.equals("")) {
            return "Hello! Please introduce yourself!";
        }
        else {
            return "Name: " + name + "\n" + "Hobby: " + hobby + "\nAge: " + age;
        }
    }

    // This method saves the Person object's state to a file
    // (this "persisting it" so it can be loaded the next time
    // the program is run)
    public void save() {
        try {
            File f = new File("src/person.data");
            f.createNewFile(); // this method will create the file if it does not exist; if it does exist, it does nothing
            FileWriter fw = new FileWriter("src/person.data");
            fw.write(name + "\n");
            fw.write(hobby + "\n");
            fw.write(age);
            fw.close();
            System.out.println("Data saved!");
        }
        catch (IOException e) {
            System.out.println("Unable to create file");
            System.out.println(e.getMessage());
        }
    }
}