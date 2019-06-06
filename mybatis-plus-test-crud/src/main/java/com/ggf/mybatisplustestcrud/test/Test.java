package com.ggf.mybatisplustestcrud.test;


import lombok.val;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/**
 * @Descripton TODO
 * @Author: gqf
 * @create: 2019-06-05 19:30
 */
public class Test {

    static void modifyTheValue(int valueToBeOperated, Function<Integer, Integer> function){
        int newValue = function.apply(valueToBeOperated);
        /*
         * Do some operations using the new value.
         */
        System.out.println(newValue);
    }
//    public static void main(String[] args) {
//        int incr = 20;
//        int myNumber = 10;
//        //val-> val + incr
//        // 相当于定义了一个方法：
//        //        int function(int val) {
//        //            return val+incr;
//        //}
//        modifyTheValue(myNumber, val-> val + incr);
//        myNumber = 15;
//        modifyTheValue(myNumber, val-> val * 10);
//        modifyTheValue(myNumber, val-> val - 100);
//        modifyTheValue(myNumber, val-> "somestring".length() + val - 100);
//    }


}
