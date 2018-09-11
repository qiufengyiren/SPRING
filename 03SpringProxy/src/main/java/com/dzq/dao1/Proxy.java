package com.dzq.dao1;

/**
 * 代理类
 */
public class Proxy implements Subject {
    //需要代理的学生
    private Subject student;

    //创建构造函数,你总得让我知道给谁代理吧
    public Proxy(Subject student) {
        super();
        this.student = student;
    }

    //代理扩展送花
    public void sendFlower() {
        System.out.println("Proxy替小明送花");
    }

    //代理扩展送巧克力
    public void sendChocolate() {
        System.out.println("Proxy替小明送巧克力");
    }

    @Override
    public void engagement() {
//其他杂活累活让代理去干
        this.sendFlower();
        this.sendChocolate();
        //约会肯定小明同学自己来啦
        student.engagement();
        System.out.println("搞定收工");
    }

    public static void main(String[] args) {
        //目标对象
        Subject xm=new xiaomingStudent();
        //创建代理,给目标对象
        Proxy proxy=new Proxy(xm);
        proxy.engagement();
    }
}
