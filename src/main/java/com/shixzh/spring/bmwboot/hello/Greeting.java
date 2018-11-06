package com.shixzh.spring.bmwboot.hello;

/**
 * @author: ZhaoShixiang <br>
 * @date: 2018/11/6 17:12
 */
public class Greeting {

    private final long id;
    private final String content;

    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}