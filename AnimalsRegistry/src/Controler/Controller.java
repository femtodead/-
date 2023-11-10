package Controler;

import java.util.LinkedList;

import Model.Animals;
import Model.AnimalsRegistry;
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
            switch ( Integer.parseInt(View.menu())) { // берем с вьющки меню получаем цифры падаем в нкжный кейс
                case 1:
                    View.lookAll(AnimalsRegistry.getRegistry()); // Показывает всех животных 
                    break;
            
                case 2: // добавление животного
                    LinkedList<String> info = View.addAnimals(); // собираем инфу
                    Animals an = AnimalsRegistry.classCheck(info.get(2)); // создаем экземпляр
                    Integer id = Integer.parseInt(info.get(0)); 
                    an.setId(id); // почередно добавляем информации в экземпляр класса
                    an.setName(info.get(1));
                    an.setCommands(View.command());
                    an.setBirthDate(info.get(3));
                    System.out.println("\n" + an.toString() + "\n"); // выводим результат
                    AnimalsRegistry.add(an); // добавляем в реестр
                    break;
            
                case 3:
                    View.commandList(AnimalsRegistry.CheckAnimals(View.scaner("Введите имя животного: "))); // по имени животного находим экземпляр в реестре и выводим его команды
                    break;
            
                case 4:
                    String name = View.scaner("Введите имя животного которое хотите обучить: "); // по имени животного находим экземпляр в реестре и добавляем команду
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
                        System.out.println(AnimalsRegistry.getRegistry().get(0).getNumberAllAnimals()); // проверяем наличие животного, если есть обращаемся к 0 экземпляру и проверяем статическое поле где указано количиство экземпляров 
                    }
                    else{
                        System.out.println("\n Животных в реестре пока нет \n");
                    }
                    break;
            
                case 6:
                    View.exid();// выход
                    return;
            
                
                default:
                    break;
            }
        }
    }
}
