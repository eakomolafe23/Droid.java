/* This program is a droid workshop, where different methods and instance fields are utilized
Created by Elizabeth Akomolafe
Feb 18th 2020
*/

public class Droid {

  //instances
    int batteryLevel;
    String name;
    int age;

  //constructor
    public Droid(String droidName, int droidAge) {
      name = droidName;
      batteryLevel = 100;
      age = droidAge;

  }

  //method
  public String toString() {
    return "Hello, I'm the droid:" + name;
  }

  //new method
  public String performTask(String task) {
    System.out.println(name + " is performing task:" + task);
    batteryLevel = batteryLevel - 10;
    return task;
}

  //another method
  public String droidAge(int age){
    String str1 = Integer.toString(age);
    System.out.println("I am:" + str1);
    String newage = Integer.toString(age);
    return " I am:" + newage + "months old";
  }

public static void main(String[] args) {
  Droid codey = new Droid("Codey", 10);  
  System.out.println(codey.batteryLevel);
  codey.performTask(" dancing");
  System.out.println(codey.age);

  }
}



