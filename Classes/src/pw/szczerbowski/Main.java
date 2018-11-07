package pw.szczerbowski;

public class Main {

    public static void main(String[] args) {
        Car porsche=new Car();  //when creating new object of data type "Car" and initializing it with a "new" operator
                                //so it is pointing to a Car type object
        Car holden=new Car();

        porsche.setModel("911");
        System.out.println("Model is " + porsche.getModel());
    }
}
