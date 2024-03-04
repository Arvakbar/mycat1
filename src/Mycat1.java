public class Mycat1 {
    public String name = "koko";
    public int age = 1;
    public double weight = Double.parseDouble("2.5");
    public String owner = "Areeve";

    public void displayName(){
        System.out.println("mycat: "+ name);
    }

    public void displayAge(){
        System.out.println("mycat age: "+ age);
    }

    public void displayWeight(){
        System.out.println("mycat weight: "+ weight);
    }

    public void displayOwner(){
        System.out.println("mycat Owner: "+ owner);
    }

    public static void main(String[] args){
        Mycat1 cat = new Mycat1();
        cat.displayName();
        cat.displayAge();
        cat.displayOwner();
        cat.displayWeight();
    }
}

