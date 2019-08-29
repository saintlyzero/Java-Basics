/**
 * DeprecatedDemo
 */
class TestClass{

    void foo(){
        System.out.println("Hello, I'm Foo");
    }

    @Deprecated
    void bar(){
        System.out.println("Hello, I'm Bar");
    }
}

public class DeprecatedDemo {

    public static void main(String[] args) {
        TestClass testClass = new TestClass();

        // At compile time displays:
        // Note: Test.java uses or overrides a deprecated API.
        // Note: Recompile with -Xlint:deprecation for details.
        testClass.bar();

    }
}