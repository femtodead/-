package Model;

import java.util.LinkedList;

public class Horse extends PackAnimals{

    public Horse(Integer id, String name,  String birthDate, LinkedList<String> commands) {
        super(id, name,null, birthDate, commands);
        this.type = "Horse";
    }
    public Horse() {
        super(null, null,null, null, null);
        this.type = "Horse";
        
    }
    @Override
    public String toString() {
        return "Horse [id=" + id + ", name=" + name + ", type=" + type + ", birthDate=" + birthDate + ", commands="
        + commands + "]";
    }
    
}
