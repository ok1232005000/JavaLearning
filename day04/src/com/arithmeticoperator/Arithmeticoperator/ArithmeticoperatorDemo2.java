package com.arithmeticoperator.Arithmeticoperator;

public class ArithmeticoperatorDemo2 {
    //隐式转换：1.取值范围小的和大的运算，小的先提升成大的，在进行运算；
    // 2.byte short char 三种类型的数据在运算时，直接先提升为int，然后再进行运算。
    //byte < short < int < long < float < double
    //强制转换
    public static void main(String[] args) {
        byte b1 = 10;
        byte b2 = 10;
        //int result = b1 + b2;
        byte result = (byte) (b1 + b2);//当数据过大时，会出现错误
        System.out.println(result);

        //"+"算术运算符
        System.out.println( 3.7 + "abc" );//3.7abc
        System.out.println("abc" + true);//abctrue
        System.out.println(5 + 10 + "abc");//15abc
        //'a' 97
        System.out.println('a' + "abc");//aabc
        System.out.println(1 + 'a' + "abc");//98abc
    }
}
