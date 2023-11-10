package Model;

import java.util.LinkedList;

public class AnimalsRegistry {
    LinkedList<Animals> registry;
    LinkedList<String> classNameLinkedList;
    public AnimalsRegistry(LinkedList<Animals> registry) {
        this.registry = registry;
        LinkedList<String> classNameLinkedList = new LinkedList<>();
        classNameLinkedList.add("Cat");
        classNameLinkedList.add("Dog");
        classNameLinkedList.add( "Hamster");
        classNameLinkedList.add("Hors");
        classNameLinkedList.add("Camel");
        classNameLinkedList.add("Donkey");
        this.classNameLinkedList = classNameLinkedList;
        
    }

        public AnimalsRegistry() {
        this.registry = new LinkedList<Animals>();
        LinkedList<String> classNameLinkedList = new LinkedList<>();
        classNameLinkedList.add("Cat");
        classNameLinkedList.add("Dog");
        classNameLinkedList.add( "Hamster");
        classNameLinkedList.add("Horse");
        classNameLinkedList.add("Camel");
        classNameLinkedList.add("Donkey");
        this.classNameLinkedList = classNameLinkedList;
    }

    public LinkedList<Animals> getRegistry() {
        return registry;
    }

    public void setRegistry(LinkedList<Animals> registry) {
        this.registry = registry;
    }

    public Animals classCheck(String className){ // сверяется с списком известных нам животных и создает нужный экземпляр класса 
        for (int i = 0; i < classNameLinkedList.size(); i++) {
            if (classNameLinkedList.get(i).equalsIgnoreCase(className)){
                if (i == 0){
                    return new Cat();
                }
                if (i == 1){
                    return new Dog();
                }
                if (i == 2){
                    return new Hamster();
                }
                if (i == 3){
                    return new Horse();
                }
                if (i == 4){
                    return new Camel();
                }
                if (i == 5){
                    return new Donkey();
                }
            }
        }
        return new Animals(null, null, className, null, null); //если не находит нужного потомка создает родителя
    }

    public boolean add(Animals animals){ // добавление в регистр
        for (Animals ex : registry) {
            if (ex == animals){
                return false;
            }
        }
        this.registry.add(animals);
        return true;
    }


    public Animals CheckAnimals(String name){ // поиск по животному
        for (Animals ex : registry) {
            if (ex.getName().equalsIgnoreCase(name)){
                return ex;
            }
        }
        return null;
    }

}
