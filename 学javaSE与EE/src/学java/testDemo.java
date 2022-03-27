package 学java;

import java.util.stream.Stream;

public class testDemo {
    public static void main(String[] args) {
        int a=0,b=0,c=0;
        int result=123;
        a=result/100;
        b=result/10%10;
        c=result%10;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println("--------");
        //a1 6 7 8
        //b1 4
        //rs1 7+7-
        int a1=6;
        int b1=4;
        int rs1=++a1 + a1++ - --b1 + b1-- -a1--+ ++b1 +2;
        System.out.println(a1);
        System.out.println(b1);
        System.out.println(rs1);

        int num1=43,num2=41,num3=54;
        int temp=num1>num2?num1:num2;
        int max=temp>num3?temp:num3;
        System.out.println(max);

    }
}
