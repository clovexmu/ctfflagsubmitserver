package com.clovexmu.ctf.demo.service;

import com.clovexmu.ctf.demo.domain.FlagSubmited;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class BeanInvoke {

    @Autowired
    private List<FlagSubmited> flaglist;

    public void add(FlagSubmited flagSubmited)
    {
        this.flaglist.add(flagSubmited);
    }

    public List<FlagSubmited> GetFlagList()
    {
        return this.flaglist;
    }
}
