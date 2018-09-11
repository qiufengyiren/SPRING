package com.dzq.pojo;

import org.springframework.beans.factory.annotation.Value;

public class TestValue {
    /**
     * 方式一:
     * @Value("jdbc.drive")
     * 获取value
     */
    /*
    @Value("jdbc.drive")*/
    /**
     * 方式二:
     *
     * @Value("${jdbc.driver}") 获取key
     */
    @Value("${jdbc.driver}")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
