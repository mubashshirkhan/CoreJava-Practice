/**

Downcasting refers to the procedure when subclass
type refers to the object of the parent class is
known as downcasting. If it is performed directly
compiler gives an error as ClassCastException is thrown at runtime.
It is only achievable with the use of instanceof 
operator The object which is already upcast, that
object only can be performed downcast.


NOTE : Without perform upcast if we try to downcast ,
ClassCastException will be thrown.
It is a runtime exception or unchecked exception.
It is class, present in java.lang package.
It can be avoided by using a operator known as 'instanceof'.

**/


// Class 1
// Parent class
class Vehicles {
}

// Class 2
// Child class
class Car extends Vehicles {
    static void method(Vehicles v)
    {

        //
        if (v instanceof Car) {

            // Downcasting
            Car c = (Car)v;

            System.out.println("Downcasting performed");
        }
    }

    public static void main(String[] args)
    {
   
        Vehicles v = new Car();//upcasting
        Car.method(v);
    }
}


