import java.util.Scanner;

class Myemployee{
    private int id;        //we use this to prevent change of the attributes
    private String name;   //here we can only assess this attribute using getters and setters

    //constructors
    public Myemployee(){
        id=45;
        name="constructor";
    }

    public void setId(int id) {  //setter
        this.id = id;
    }

    public int getId() {  //getter
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
public class ATM_Interface_Using_Java {
    public static void main(String[] args) {
        Myemployee sadiq=new Myemployee();
        int d;
        //calling setters
        sadiq.setId(21);
        sadiq.setName( "Md.sadiq");
        if(21== sadiq.getId()){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}
