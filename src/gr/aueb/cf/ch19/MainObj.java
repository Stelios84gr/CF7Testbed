package gr.aueb.cf.ch19;

public class MainObj {

    public static void main(String[] args) {
        NodeObj object = new NodeObj();

        object.setItem("CF");
        int data = (int) object.getItem();  // δεν βλέπει το class-casting @ compile time που δεν επιτρέπεται, παρά μόνο @ runtime
    }
}
