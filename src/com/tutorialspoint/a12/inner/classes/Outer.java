package com.tutorialspoint.a12.inner.classes;

public class Outer {

    private int number = 10;

    public class Inner {

        public int getNum(){
            System.out.println("Returning number from outer class");

            class InnerMethod {

                public void print(){
                    System.out.println("Method from method inner class");
                }

            }

            InnerMethod innerMethod = new InnerMethod();
            innerMethod.print();

            return number;
        }
    }

}
