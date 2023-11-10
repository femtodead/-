package Model;

import java.util.LinkedList;

public class Donkey extends PackAnimals {

    public Donkey(Integer id, String name,  String birthDate, LinkedList<String> commands) {
        super(id, name,null, birthDate, commands);
        this.type = "Donkey";
    }
    public Donkey() {
        super(null, null,null, null, null);
        this.type = "Donkey";
        
    }
    @Override
    public String toString() {
        return "Donkey [id=" + id + ", name=" + name + ", type=" + type + ", birthDate=" + birthDate + ", commands="
        + commands + "]";
    }
}
