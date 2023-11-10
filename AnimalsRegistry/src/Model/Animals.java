package Model;

import java.util.LinkedList;

public class Animals {
    Integer id;
    String name;
    String type;
    String birthDate;
    LinkedList<String> commands;
    static int numberAllAnimals;

    public Animals() {
    }

    public Animals(Integer id, String name, String type, String birthDate, LinkedList<String> commands) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.birthDate = birthDate;
        this.commands = commands;
        this.numberAllAnimals++;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public LinkedList<String> getCommands() {
        return commands;
    }

    public void setCommands(LinkedList<String> commands) {
        this.commands = commands;
    }


    public void train(String comm){
        this.commands.add(comm);
    }

    @Override
    public String toString() {
        return "Animals [id=" + id + ", name=" + name + ", type=" + type + ", birthDate=" + birthDate + ", commands="
                + commands + "]";
    }

    public static int getNumberAllAnimals() {
        return numberAllAnimals;
    }
    
}
