// ============================================================
// EXAMPLE 2: RUN-TIME POLYMORPHISM
// ============================================================
class A1 {

    // Static method
    static void m1() {
        System.out.println("A1 m1()");
    }

    // Instance method
    void m2() {
        System.out.println("A1 m2()");
    }
}


class B1 extends A1 {

    // Static method
    // Method hiding
    static void m1() {
        System.out.println("B1 m1()");
    }

    // Method overriding
    @Override
    void m2() {
        System.out.println("B1 m2()");
    }
}


// ============================================================
// TEST 2
// ============================================================

class TestRTP {

    public static void main(String[] args) {

        // Upcasting
        A1 a1 = new B1();

        /*
         * Reference type = A1
         * Object type    = B1
         */

        // Compile-Time Polymorphism
        a1.m1();

        /*
         * Output:
         * A1 m1()
         *
         * Static method is resolved using the reference type.
         */


        // Run-Time Polymorphism
        a1.m2();

        /*
         * Output:
         * B1 m2()
         *
         * Reason:
         * m2() is an instance method and is overridden in B1.
         *
         * At runtime, JVM checks the actual object:
         *
         *     new B1()
         *
         * Therefore B1's m2() is executed.
         */
    }
}