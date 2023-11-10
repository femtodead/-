package View;

import java.util.LinkedList;
import java.util.Scanner;

import Model.Animals;

public class View {
    public String menu(){
        System.out.println("1. Посмотреть всех животных в реестре" + "\n" + "2. Добавить животное в реестор " + 
        "\n" + "3. Показать список команд животного" +"\n"+ "4. Обучить животное" +"\n"+ "5. Показать общее количество животных " + "\n" + "6. Выход"+ "\n");
        return this.scaner("Введите цифру: ");
    }

    public String scaner(String mess){
        Scanner sc = new Scanner(System.in, "ibm866");
        System.out.print(mess);
        String text = sc.next();
        return text;
    }

    public void lookAll (LinkedList<Animals> reestr){
        for (Animals animals : reestr) {
            System.out.println(animals.toString() + "\n");
        }
    }

    public LinkedList<String> addAnimals(){
        LinkedList<String> info = new LinkedList<>();
        info.add(this.scaner("Введите id: "));
        info.add(this.scaner("Введите name: "));
        info.add(this.scaner("Введите type: "));
        info.add(this.scaner("Введите birthDate: "));
        return info;
    }
    public LinkedList<String> command(){
        LinkedList<String> command = new LinkedList<>();
        String dopText = "";
        while (true) {
            String yes_no = this.scaner("Добавить" +dopText+ " команду для животного? (Да/Нет): ");
            if (yes_no.equalsIgnoreCase("Да")){
                command.add(this.scaner("Введите название команды: "));
            }
            else{
                break;
            }
            dopText = " еще";
        }
        return command;
    }

    public void exid(){
        System.out.println("Поздравляем с успешным выходом");
    }
    
    public void commandList(Animals animals){
        for (String com : animals.getCommands()) {
            System.out.println("\n"+ com + "\n");
        }
    }
}
