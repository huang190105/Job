package com.company;

/**
 * @author ：Huang
 * @since : 2019/12/27
 */
public class Puppy {

    int puppyAge;

    Puppy() { };

    Puppy(String name){
        System.out.println("名字："+"小王");
    }
    public void  setAge(int age){
        this.puppyAge = age;
        System.out.println("年龄："+ age);
    }
    public int getPuppyAge(){
        return puppyAge;
    }

    public static void main(String[] args) {
        Puppy puppy = new Puppy("huang");

        puppy.setAge(18);

        puppy.getPuppyAge();

        System.out.println(puppy.puppyAge);

    }

}
