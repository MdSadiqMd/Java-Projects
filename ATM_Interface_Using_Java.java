import java.util.Scanner;

class Myemployee{
    private int id;        //we use this to prevent change of the attributes
    private String Pin;   //here we can only assess this attribute using getters and setters

    public void setId(int id) {  //setter
        this.id = id;
    }

    public int getId() {  //getter
        return id;
    }

    public void setPin(String pin) {
        this.Pin = Pin;
    }

    public String getPin() {
        return Pin;
    }

    // Person 2

    private int id1;        //we use this to prevent change of the attributes
    private String Pin1;   //here we can only assess this attribute using getters and setters

    public void setId1(int id1) {  //setter
        this.id1 = id1;
    }

    public int getId1() {  //getter
        return id1;
    }

    public void setPin1(String Pin1) {
        this.Pin1 = Pin1;
    }

    public String getPin1() {
        return Pin1;
    }
}
public class ATM_Interface_Using_Java {
    public static void main(String[] args) {
        Myemployee sadiq=new Myemployee();
        sadiq.setId(123);
        sadiq.setPin("sadiq");
        sadiq.setId1(456);
        sadiq.setPin1("Mohammad");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your ID");
        int a=sc.nextInt();
        System.out.println(a);
        if(a == sadiq.getId()){
            System.out.println("Enter Your Pin");
        }
        else if (a==sadiq.getId1()){
            System.out.println("Enter your Pin");
        }
    }
}
