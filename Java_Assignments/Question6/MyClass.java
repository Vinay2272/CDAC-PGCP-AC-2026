package Question6;

class MyClass {

    @CustomAnnotation
    public void method1() {
        System.out.println("method1 executed");
    }

    public void method2() {
        System.out.println("method2 executed");
    }

    @CustomAnnotation
    public void method3() {
        System.out.println("method3 executed");
    }

    public void method4() {
        System.out.println("method4 executed");
    }
}