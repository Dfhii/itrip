package cn.itrip.auth.controller;

public class MainClass {
    public static void main(String[] args) {
        Sation sation=new Sation("窗口1");
        Sation sation1=new Sation("窗口2");
        Sation sation2=new Sation("窗口3");

        sation.start();
        sation1.start();
        sation2.start();
    }
}
