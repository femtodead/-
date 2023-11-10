package Model;

import java.util.LinkedList;

public class Camel extends PackAnimals {

    public Camel(Integer id, String name,  String birthDate, LinkedList<String> commands) {
        super(id, name,null, birthDate, commands);
        this.type = "Camel";
    }
    public Camel() {
        super(null, null,null, null, null);
        this.setType("Camel");
        
    }
    @Override
    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Camel [id=" + id + ", name=" + name + ", type=" + type + ", birthDate=" + birthDate + ", commands="
        + commands + "]";
    }

}
