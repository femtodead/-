package Model;

import java.util.LinkedList;

public class Pets extends Animals{

    public Pets(Integer id, String name, String type, String birthDate, LinkedList<String> commands) {
        super(id, name, type, birthDate, commands);
    }
    
}
