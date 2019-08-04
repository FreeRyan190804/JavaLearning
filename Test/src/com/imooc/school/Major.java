package com.imooc.school;

public class Major {

    private String majorName = "Computer Science";
    private String majorNo = "J0001";
    private int majorDuration = 4;

    public void setMajorDuration(int majorDuration) {
        this.majorDuration = majorDuration;
    }

    public void setMajorName(String majorName){
        this.majorName = majorName;
    }

    public void setMajorNo(String majorNo){
        this.majorNo = majorNo;
    }

    public String getMajorName(){
        return majorName;
    }

    public String getMajorNo(){
        return majorNo;
    }

    public int getMajorDuration(){
        return majorDuration;
    }

    public void getMajorInformation(){
        System.out.println("The major information shows as following:");
        System.out.println("Major name: " + majorName);
        System.out.println("Major No: " + majorNo);
        System.out.println("Major duration: " + majorDuration);
        System.out.println("===========================================");
    }

    public static void main(String[] args){
        Major m = new Major();
        m.getMajorInformation();
    }
}
