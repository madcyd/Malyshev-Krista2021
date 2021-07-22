import java.util.Scanner;

public class Cat {

    private String name;
    private int age;

    public Cat (String name){
        this.name = name;
    }
    public Cat (){
        this.name="Kot";
    }

    public static void main(String[] args) {
        Cat myCat = new Cat( "Cat name");
        System.out.print("Print cat name: ");
        myCat.consoleNameInput();
        System.out.print("Print age: ");
        myCat.consolePNInput();
        myCat.checkKnowledge();
        myCat.consolePNOutput();
        System.out.print("Cat state: ");
        myCat.consoleStateOutput();
    }

    public String getName () {
        return this.name;
    }

    public void setName (String newName){
        this.name = newName;
    }

    public void consoleNameInput(){
        Scanner in = new Scanner(System.in);
        String str = in.next();
        this.name = str;
    }
    public void consoleNameOutput(){
        System.out.println(this.name);
    }

    public void consolePNInput(){
        Scanner in = new Scanner(System.in);
        String str = in.next();
        try{
            this.age = Integer.parseInt(str);
        } catch (NumberFormatException e){
            System.out.println("Ожидалось число, а введена строка " + str);
        }
    }
    public void consolePNOutput(){
        System.out.println(this.age);
    }
    public void consoleDataOutput(){
        System.out.println(this.age +" "+this.name);
    }
    public void consoleStateOutput(){
        String state = "";
        if(this.age <= 1){
            state = "Kitten";
        }else if(this.age < 5){
            state = "Young cat";
        }else if(this.age < 13){
            state = "Ok cat";
        }else{
            state= "It's time";
        }
        System.out.println(state);
    }

    public void checkKnowledge(){
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        boolean isKnow = false;
        switch (str){
            case "сидеть": isKnow = true; break;
            case "тапки": isKnow = true; break;
            case "фу": isKnow = true; break;
            case "2 + 2": System.out.println(4);
                isKnow = true; break;
        }
        if(isKnow){
            System.out.println(this.name+" знает эту команду");
        }
    }
}
