package Controler;

import java.util.LinkedList;

import Model.Animals;
import Model.AnimalsRegistry;
import Model.Cat;
import View.View;

public class Controller {
    View View;
    AnimalsRegistry AnimalsRegistry;
    public Controller(View view, Model.AnimalsRegistry animalsRegistry) {
        View = view;
        AnimalsRegistry = animalsRegistry;
    }

    public void start(){
        while (true) {
            switch ( Integer.parseInt(View.menu())) {
                case 1:
                    View.lookAll(AnimalsRegistry.getRegistry());
                    break;
            
                case 2:
                    LinkedList<String> info = View.addAnimals();
                    Animals an = AnimalsRegistry.classCheck(info.get(2));
                    Integer id = Integer.parseInt(info.get(0));
                    an.setId(id);
                    an.setName(info.get(1));
                    an.setCommands(View.command());
                    an.setBirthDate(info.get(3));
                    System.out.println("\n" + an.toString() + "\n");
                    AnimalsRegistry.add(an);
                    break;
            
                case 3:
                    View.commandList(AnimalsRegistry.CheckAnimals(View.scaner("Введите имя животного: ")));
                    break;
            
                case 4:
                    String name = View.scaner("Введите имя животного которое хотите обучить: ");
                    if (AnimalsRegistry.CheckAnimals(name) == null){
                        System.out.println("Нет такого животного");
                    }
                    else{
                       Animals ann =  AnimalsRegistry.CheckAnimals(name);
                       ann.train(View.scaner("Введите название команды: "));
                    }
                    
                    break;
            
                case 5:
                    if (AnimalsRegistry.getRegistry().size() != 0){
                        System.out.println(AnimalsRegistry.getRegistry().get(0).getNumberAllAnimals());
                    }
                    else{
                        System.out.println("\n Животных в реестре пока нет \n");
                    }
                    break;
            
                case 6:
                    View.exid();
                    return;
            
                
                default:
                    break;
            }
        }
    }
}
