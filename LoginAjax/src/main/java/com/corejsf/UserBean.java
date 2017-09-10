package com.corejsf;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="user")
@SessionScoped
public class UserBean{
   private String name = "";
   private String password;

   public String getName() { return name; }
   public void setName(String newValue) { name = newValue; }

   public String getPassword() { return password; }
   public void setPassword(String newValue) { password = newValue; }
   
   public String getGreeting() { 
      if (name.length() == 0) return "";
      else return "Welcome to JSF2 + Ajax, " + name + "!"; 
   }
}
