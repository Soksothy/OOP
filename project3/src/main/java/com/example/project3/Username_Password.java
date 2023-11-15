package com.example.project3;

import java.util.HashMap;

public class Username_Password {
    HashMap<String,String> logininfo = new HashMap<String,String>();
    Username_Password(){
        logininfo.put("Admin","123No");
    }
    protected HashMap getLoginInfo(){
        return logininfo;
    }
}
