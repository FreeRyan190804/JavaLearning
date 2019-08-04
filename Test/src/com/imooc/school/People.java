package com.imooc.school;

public class People {
    protected String name;
    protected String sex;
    protected int age;

    public People(){

    }

    public People(String name, String sex, int age){
        this.setSex(sex);
        this.name = name;
        this.setAge(age);
    }

    public void setName(String name){
        this.name = name;
    }

    public void setSex(String sex){
        switch (sex){
            case "male":
            case "female":
                this.sex = sex;
                break;
            default:
                System.out.println("You need to input the right sex, such as male or female.");
        }
    }

    public void setAge(int age){
        this.name = name;
        if (age > 0){
            this.age = age;
        }else{
            System.out.println("You must input an age greater than 0.");
        }
    }

    public String getName(){
        return this.name;
    }

    public String getSex(){
        return this.sex;
    }

    public int getAge(){
        return this.age;
    }

    public static void main(String[] Args){
        People p = new People("Lily", "female", 18);

    }
}
