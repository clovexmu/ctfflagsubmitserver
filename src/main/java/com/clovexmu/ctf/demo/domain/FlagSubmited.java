package com.clovexmu.ctf.demo.domain;


import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
public class FlagSubmited implements Serializable {

    private static final long serialVersionUID = -5012635186550431351L;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;

    }

    public String getFlags() {
        return flags;
    }

    public void setFlags(String flags) {
        this.flags = flags;

    }

    public int getQuestionNumber() {
        return questionNumber;
    }

    public void setQuestionNumber(int questionNumber) {
        this.questionNumber = questionNumber;

    }

    private String token;
    private String flags;
    private int questionNumber;
}
