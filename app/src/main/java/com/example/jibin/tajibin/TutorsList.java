package com.example.jibin.tajibin;

/**
 * Created by jibin on 4/12/2016.
 */
public class TutorsList {
    private String name;
    private String subject;

    public TutorsList(String name, String subject){
        super();
        this.name = name;
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public String getSubject() {
        return subject;
    }
}
