package Model;

import java.util.LinkedList;

public class Hamster extends Pets {

    public Hamster(Integer id, String name,  String birthDate, LinkedList<String> commands) {
        super(id, name,null, birthDate, commands);
        this.type = "Hamster";
    }
    public Hamster() {
        super(null, null,null, null, null);
        this.type = "Hamster";
        
    }
    @Override
    public String toString() {
        return "Hamster [id=" + id + ", name=" + name + ", type=" + type + ", birthDate=" + birthDate + ", commands="
        + commands + "]";
    }
}
