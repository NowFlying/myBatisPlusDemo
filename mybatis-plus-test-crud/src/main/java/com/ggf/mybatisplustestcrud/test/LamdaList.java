package com.ggf.mybatisplustestcrud.test;


import java.util.Arrays;
import java.util.List;

/**
 * @Descripton 测试Lamda集合
 * @Author: gqf
 * @create: 2019-06-05 19:40
 */
public class LamdaList {

    //list
    public static void main(String[] args) {

    }

    /**
     *  测试List集合
     * @Date 2019-06-05 19:58
     * @param
     * @return
     **/
    public static void testListForeach(){
        Integer[] nums = {1,2,3};
        List<Integer> numbers = Arrays.asList(nums);
        //双冒号打印
        numbers.forEach(System.out :: println);

        //lamda表达式
        numbers.forEach((num) -> System.out.print(num + ";"));
    }

}
