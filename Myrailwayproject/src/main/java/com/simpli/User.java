package com.simpli;

import jakarta.servlet.ServletException;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

 public class User
{  
@Id
 @Column(name="email")
 private String email; 
@Column(name="username")
 private String uname;
 @Column(name="password") 
private String password; 
public String getEmail() 
{  
return email;
}
public void setEmail(String email) {
 this.email = email;
 }
 public String getUname() {
 return uname;
 }
 public void setUname(String uname) {
 this.uname = uname;
}
 public String getPassword() { 
return password; 
}
 public void setPassword(String password) { 
this.password = password; 
}
}
