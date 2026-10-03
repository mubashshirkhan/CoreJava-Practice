class A {
    
    static int x = 10;   // static variable
    int y = 20;          // non-static variable

    static void m1() {
        System.out.println("A static m1()");
    }

    void m2() {
        System.out.println("A non-static m2()");
    }
}


class B extends A {

    static void m3() {   // B's static method

        // Superclass static members
        System.out.println(x);     // ✅
        System.out.println(A.x);   // ✅

        m1();                      // ✅
        A.m1();                    // ✅


        // Superclass non-static members
        // System.out.println(y);  // ❌
        // m2();                   // ❌


        // Need an object for non-static members
        B b = new B();

        System.out.println(b.y);   // ✅
        b.m2();                    // ✅
    }
}


public class Test3 {

    public static void main(String[] args) {

        B.m3();   // calling subclass static method
    }
}