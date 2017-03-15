package com.tutorialspoint.a12.inner.classes;

public class Main {

    public void displayMessage(Message e) {
        System.out.println(e.greet());
    }

    static class StaticNestedClass {
        public void myMethod(){
            System.out.println("This is my nested static class");
        }
    }

    public static void main(String[] args) {

        Outer outer = new Outer();

        Outer.Inner inner = outer.new Inner();

        System.out.println(inner.getNum());

        AnonymousInner anonymousInner = new AnonymousInner() {

            @Override
            public void printMethod() {
                System.out.println("This is a print method from anonymousInner class");
            }

        };

        anonymousInner.printMethod();

        Main main = new Main();
        main.displayMessage(new Message() {

            @Override
            public String greet() {
                return "Hello This is an example of anonymous inner class as an argument";
            }

        });

        Main.StaticNestedClass staticNestedClass = new Main.StaticNestedClass();
        staticNestedClass.myMethod();

    }

}
