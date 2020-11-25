package com.clovexmu.ctf.demo.controller;

import com.clovexmu.ctf.demo.utils.ResponseUtil;
import com.clovexmu.ctf.demo.domain.FlagSubmited;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.*;


import java.util.*;


@RestController
public class ctfcontroller {


     public static List<FlagSubmited> flaglist =  new ArrayList<>();

    //属性文件xmlconf.properties中对应的各个键值对
    //private static HashMap<String, String> flaglist    = new HashMap<String, String>();

//    @Autowired
//    BeanInvoke beanInvoke;

//    @Autowired
//    Map<String,FlagSubmited> map;

    @GetMapping("/test")
    public String test(@RequestParam(required = true) String id, @RequestParam(defaultValue = "test") String flag)
    {
        return "hello, user:"+ id+ " your flag is :" + flag;
    }

    @RequestMapping("/flagsubmit")

    public Object flagsubmit(FlagSubmited flag)
    {
         //System.out.println("flagsubmit:"+ token + "flags:"+flags);
        Assert.notNull(flag.getToken(),"token不能为空!");
        Assert.notNull(flag.getFlags(),"flags不能为空!");
        Assert.notNull(flag.getQuestionNumber(),"QuestionNumber不能为空!");

//        beanInvoke.add(flagSubmited);
//        return ResponseUtil.okList( beanInvoke.GetFlagList() ) ;
       // map.put(flagSubmited.getToken()+flagSubmited.getQuestionNumber(), flagSubmited);
//        return ResponseUtil.ok();
        FlagSubmited flagSubmited= new FlagSubmited();
        flagSubmited.setToken(flag.getToken());
        flagSubmited.setFlags(flag.getFlags());
        flagSubmited.setQuestionNumber(flag.getQuestionNumber());
        this.flaglist.add(flagSubmited);
        return ResponseUtil.ok("success");
    }

    @RequestMapping("/listflags")
    public Object getlist()
    {
        System.out.println("get flag list");
        return ResponseUtil.okList(flaglist);
    }

    @RequestMapping("/clearflags")
    public Object clearlist()
    {
        flaglist.clear();
        System.out.println("clear flag list");
        return ResponseUtil.ok("clear");
    }

}
