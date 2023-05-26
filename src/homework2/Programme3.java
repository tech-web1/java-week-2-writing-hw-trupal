package homework2;

/**
 * Write a java programme using the following steps.
 * 3.1 Declare one instance and one static variables.
 * 3.2 Declare one instance method.
 * 3.3 Declare one static method.
 * 3.4 Call both instance and static varibles into both instance and static method inside the print statement.
 * 3.5 Declare the main method .
 * 3.6 Call both instance and static methods into the main method and run the programme.
 */
public class Programme3 {
    //3.1 Declare one instance and one static variables.
    String name = "Prime";
    static String surname = "Testing";

    //3.2 Declare one instance method.
    //3.4 Call both instance and static variables intop both instance and static method inside the print statement.
    public void instanceMethod() {
        System.out.println(name);
        System.out.println(Programme3.surname);
    }

    //3.3 Declare one static method.
    //3.4 Call both instance and static variables into both instance and static method inside the print statement.
    public static void staticMethod() {
        Programme3 Programme3 = new Programme3();
        System.out.println(Programme3.name);
        System.out.println(surname);
    }

    //3.5 Declare the main method.
    //3.6 Call both instance and static into the main method and run the programme.
    public static void main(String[] args) {


        Programme3 Programme3 = new Programme3();
        Programme3.instanceMethod();
        staticMethod();

    }
}
