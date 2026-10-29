/**
 * POLYMORPHISM
 *
 * There are two types of polymorphism in Java:
 *
 * 1) Compile-Time Polymorphism (CTP)
 * 2) Run-Time Polymorphism (RTP)
 *
 *
 * ============================================================
 * 1) COMPILE-TIME POLYMORPHISM (CTP)
 * ============================================================
 *
 * When a method call is resolved by the compiler based on the
 * reference variable's class, it is called Compile-Time Polymorphism.
 *
 * Static methods are resolved at compile time.
 *
 * In the example below:
 *
 *     A a1 = new B();
 *
 * The reference variable is of type A, so the compiler looks
 * at class A while resolving the static method m1().
 *
 * Therefore:
 *
 *     a1.m1();
 *
 * calls A's m1().
 *
 **/
 
// ============================================================
// EXAMPLE 1: COMPILE-TIME POLYMORPHISM
// ============================================================

class A {

    // Static method
    static void m1() {
        System.out.println("A m1()");
    }

    // Instance method
    void m2() {
        System.out.println("A m2()");
    }
}


class B extends A {

    // Static method
    // This is method hiding, NOT method overriding.
    static void m1() {
        System.out.println("B m1()");
    }

    // Different parameter list -> Method Overloading
    void m2(int x) {
        System.out.println("B m2(int)");
    }
}


// ============================================================
// TEST 1
// ============================================================

class TestCTP {

    public static void main(String[] args) {

        // Upcasting
        A a1 = new B();

        /*
         * Reference type  = A
         * Object type     = B
         */

        // Compile-Time Polymorphism
        a1.m1();

        /*
         * Output:
         * A m1()
         *
         * Reason:
         * m1() is static.
         * Static methods are resolved using the reference type.
         *
         * Reference type = A
         * Therefore A's m1() is called.
         */

        a1.m2();

        /*
         * Output:
         * A m2()
         *
         * Reason:
         * B does NOT override m2().
         * B has m2(int), which is a different method.
         *
         * Therefore A's m2() is executed.
         */
    }
}




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