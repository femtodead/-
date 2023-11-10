package Model;

import java.util.LinkedList;

public class Cat extends Pets {

    public Cat(Integer id, String name,  String birthDate, LinkedList<String> commands) {
        super(id, name,null, birthDate, commands);
        this.type = "Cat";
        
    }
    
        public Cat() {
        super(null, null,null, null, null);
        this.type = "Cat";
        
    }
    @Override
    public String toString() {
        return "Cat [id=" + id + ", name=" + name + ", type=" + type + ", birthDate=" + birthDate + ", commands="
        + commands + "]";
    }
}
