package Model;

import java.util.LinkedList;

public class Dog extends Pets {

    public Dog(Integer id, String name,  String birthDate, LinkedList<String> commands) {
        super(id, name,null, birthDate, commands);
        this.type = "Dog";
        
    }
    public Dog() {
        super(null, null,null, null, null);
        this.type = "Dog";
        
    }
    @Override
    public String toString() {
        return "Dog [id=" + id + ", name=" + name + ", type=" + type + ", birthDate=" + birthDate + ", commands="
        + commands + "]";
    }
}
