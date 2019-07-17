package cn.itrip.auth.controller;

public class Sation extends Thread {
    public Sation(String name){
        super(name);
    }
    static int tick=20;
    static Object ob="aa";
    @Override
    public void run() {
        while (tick > 0) {
            System.out.println(tick+">>>>");
            synchronized (ob) {
                if (tick > 0) {
                    System.out.println(getName() + "卖出了第" + tick + "张票");
                    tick--;
                } else {
                    System.out.println("票卖完了");
                }
            }
        }
        try {
            sleep(1000);//休息一秒
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
