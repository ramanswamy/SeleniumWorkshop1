package com.tekparams.basics;

public class ArithmeticOperations {
    int a;
    int b;
    int total;

    int addNumbers(){
        total=a+b;
        return total;
    }

    int subtractNumbers(){
        int result = a-b;
        return result;
    }

    ArithmeticOperations(){
        a=100;
        b=150;
        total=0;
    }

    public static void main(String[] args) {
        ArithmeticOperations obj1 = new ArithmeticOperations();
        int totalMain;
        int resultMain;
        totalMain=obj1.addNumbers();
        resultMain=obj1.subtractNumbers();
        System.out.println("The Addition is : "+totalMain);
        System.out.println("The subtraction is :"+resultMain);
    }
}
